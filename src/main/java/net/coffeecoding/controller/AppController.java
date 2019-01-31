package net.coffeecoding.controller;

import java.net.MalformedURLException;
import java.net.URL;

import net.coffeecoding.manager.FlightManager;
import net.coffeecoding.model.GeoCoordinates;
import net.coffeecoding.model.State;
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

    @GetMapping("/error")
    public String showErrorPage() {
        return "error-page";
    }
}