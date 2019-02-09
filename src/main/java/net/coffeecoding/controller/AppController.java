package net.coffeecoding.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;
import net.coffeecoding.api.Address;
import net.coffeecoding.api.Location;
import net.coffeecoding.api.Response;
import net.coffeecoding.manager.FlightManager;
import net.coffeecoding.model.*;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

    private GeoCoordinates geoCoordinates = new GeoCoordinates();

    public AppController() {
        this.geoCoordinates.setLatitude(51.6525013);
        this.geoCoordinates.setLongitude(18.4329261);
    }

    @GetMapping("/demo")
    public String showMainPage() {
        return "flights-form";
    }

    @GetMapping("/demo2")
    public String showMainPage1() {
        return "flights-form2";
    }

    @RequestMapping(value = "/flight", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<?> findNearestFlight() throws MalformedURLException {
        State nearestFlight = new FlightManager(new URL("https://opensky-network.org/api/states/all")).findNearestFlight(geoCoordinates.getLatitude(), geoCoordinates.getLongitude());
        return new ResponseEntity<>(nearestFlight, HttpStatus.OK);
    }

    @RequestMapping(value = "/getdata", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<?> getGeoCoordinates() {
        return new ResponseEntity<>(geoCoordinates, HttpStatus.OK);
    }

    @RequestMapping(value = "/checkflight", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity<?> checkFlight(@RequestBody GeoCoordinates geoCoordinates) {
        this.geoCoordinates.setLatitude(geoCoordinates.getLatitude());
        this.geoCoordinates.setLongitude(geoCoordinates.getLongitude());
        return new ResponseEntity<String>(HttpStatus.CREATED);
    }

<<<<<<< HEAD
    //zrobić druga metodę przyjmującą String
    @RequestMapping(value = "/cokolwiek", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity<Response> cokolwiek(@RequestBody Geocode geocode) {


        Location pointLocation = new Location();
        Response response = new Response();
        pointLocation.setLatitude(geocode.getResults().get(0).getGeometry().getLocation().getLat());
        pointLocation.setLongitude(geocode.getResults().get(0).getGeometry().getLocation().getLng());

        Address address = new Address();
        address.setFormattedAddress(geocode.getResults().get(0).getFormatted_address());

        address.setName(geocode.getResults().get(0).getAddress_components().get(0).getLong_name());
        address.setCounty(geocode.getResults().get(0).getAddress_components().get(1).getLong_name());
        address.setRegion(geocode.getResults().get(0).getAddress_components().get(2).getLong_name());
        address.setCountry(geocode.getResults().get(0).getAddress_components().get(3).getLong_name());
        address.setCountryCode(geocode.getResults().get(0).getAddress_components().get(3).getShort_name());
        address.setPostalCode(geocode.getResults().get(0).getAddress_components().get(4).getLong_name());

        FlightManager flightManager = null;
        try {
            flightManager = new FlightManager(new URL("https://opensky-network.org/api/states/all"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        State nearestFlight = flightManager.findNearestFlight(pointLocation.getLatitude(), pointLocation.getLongitude());


        Location aircraftLocation = new Location();
        aircraftLocation.setLatitude(nearestFlight.getLatitude());
        aircraftLocation.setLongitude(nearestFlight.getLongitude());
        response.setCallsign(nearestFlight.getCallsign());
        response.setDistanceFromAircraft(flightManager.getNearestDistance());

        response.setPointLocation(pointLocation);
        response.setAircraftLocation(aircraftLocation);
        response.setAddress(address);

        System.out.println(nearestFlight.getCallsign());

        try {

            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet("https://www.flightradar24.com/v1/search/web/find?query=" + nearestFlight.getCallsign().trim());
            HttpResponse flightradarResponse = client.execute(request);
            HttpEntity entity = flightradarResponse.getEntity();
            String content = EntityUtils.toString(entity);
            Flightradar flightradar = new Gson().fromJson(content, Flightradar.class);

            response.setFlightFrom(flightradar.getResults().get(0).getDetail().getSchd_from());
            response.setFlightTo(flightradar.getResults().get(0).getDetail().getSchd_to());
            response.setRoute(flightradar.getResults().get(0).getDetail().getRoute());
            response.setAircraftType(flightradar.getResults().get(0).getDetail().getAc_type());
            String logo = flightradar.getResults().get(0).getDetail().getReg();

            Document document = Jsoup.connect("https://www.airliners.net/search?keywords="+logo).timeout(6000).get();
            Elements elements = document.select("div.ps-v2-results-photo");
            response.setPhoto(new URL(elements.get(0).getElementsByTag("img").attr("src")));


        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(response.toString());

        return new ResponseEntity<>(response, HttpStatus.CREATED);
=======
    @GetMapping("/error")
    public String showErrorPage() {
        return "error-page";
>>>>>>> c5eedef7cb13a2a39c380574621e32ffa7a0cfa0
    }
}