package net.coffeecoding.controller;

import com.google.gson.Gson;
import net.coffeecoding.api.Location;
import net.coffeecoding.api.Address;
import net.coffeecoding.api.Response;
import net.coffeecoding.manager.FlightManager;
import net.coffeecoding.model.flightradar.Flightradar;
import net.coffeecoding.model.geocode.Geocode;
import net.coffeecoding.model.opensky.State;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URL;


@Controller
public class FlightController {

    @GetMapping("/demo")
    public String showMainPage1() {
        return "flights-form";
    }

    //make a second method to accept String
    @RequestMapping(value = "/searchFlight", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity<Response> searchFlight(@RequestBody Geocode geocode) {

        Response response = new Response();
        Address address = new Address();
        Location pointLocation = new Location();
        Location aircraftLocation = new Location();
        FlightManager flightManager;
        Flightradar flightradar;

        try {
            //getting geo coordinates from point
            pointLocation.setLatitude(geocode.getResults().get(0).getGeometry().getLocation().getLat());
            pointLocation.setLongitude(geocode.getResults().get(0).getGeometry().getLocation().getLng());


            //searching nearest flight from opensky-network.org
            flightManager = new FlightManager(new URL("https://opensky-network.org/api/states/all"));
            State nearestFlight = flightManager.findNearestFlight(pointLocation.getLatitude(), pointLocation.getLongitude());


            //setting other information from opensky-network.org
            response.setDistanceFromAircraft(flightManager.getNearestDistance());
            response.setCallsign(nearestFlight.getCallsign());
            aircraftLocation.setLatitude(nearestFlight.getLatitude());
            aircraftLocation.setLongitude(nearestFlight.getLongitude());


            //setting other information from  google api
            address.setFormattedAddress(geocode.getResults().get(0).getFormatted_address());
            response.setPointLocation(pointLocation);
            response.setAircraftLocation(aircraftLocation);
            response.setAddress(address);


            //connecting to flightradar using callsign number
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet("https://www.flightradar24.com/v1/search/web/find?query=" + nearestFlight.getCallsign().trim());
            HttpResponse flightradarResponse = client.execute(request);
            HttpEntity entity = flightradarResponse.getEntity();
            String content = EntityUtils.toString(entity);


            //getting details of flight from flightradar
            flightradar = new Gson().fromJson(content, Flightradar.class);
            response.setFlightFrom(flightradar.getResults().get(0).getDetail().getSchd_from());
            response.setFlightTo(flightradar.getResults().get(0).getDetail().getSchd_to());
            response.setRoute(flightradar.getResults().get(0).getDetail().getRoute());
            response.setAircraftType(flightradar.getResults().get(0).getDetail().getAc_type());


            //scraping aircraft photo
            String logo = flightradar.getResults().get(0).getDetail().getReg();
            Document document = Jsoup.connect("https://www.airliners.net/search?keywords=" + logo).timeout(6000).get();
            Elements elements = document.select("div.ps-v2-results-photo");
            response.setPhoto(new URL(elements.get(0).getElementsByTag("img").attr("src")));
        } catch (IOException e) {

        }

        System.out.println(response.toString());
        return new ResponseEntity<>(response, HttpStatus.OK);


    }

    @GetMapping("/error")
    public String showErrorPage() {
        return "error-page";

    }
}
