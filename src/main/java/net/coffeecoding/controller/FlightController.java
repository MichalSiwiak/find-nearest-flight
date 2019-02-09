package net.coffeecoding.controller;

import com.google.gson.Gson;
import net.coffeecoding.api.Location;
import net.coffeecoding.api.Address;
import net.coffeecoding.api.Response;
import net.coffeecoding.model.Geocode;
import net.coffeecoding.model.Result;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


@Controller
public class FlightController {

    /*@RequestMapping(value = "/cokolwiek", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<Response> createSales(@RequestParam("location") String location) throws MalformedURLException {


        URL url = new URL("https://maps.googleapis.com/maps/api/geocode/json?address=" + location + "&key=AIzaSyCOBqf1LYN9p_LH-sTWAjg2jXCX_RWfsUI");

        System.out.println(url);

        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(url.openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Geocode geocode = new Gson().fromJson(reader, Geocode.class);

        Location locationPoint = new Location();
        Response response = new Response();
        locationPoint.setLatitude(geocode.getResults().get(0).getGeometry().getLocation().getLat());
        locationPoint.setLongitude(geocode.getResults().get(0).getGeometry().getLocation().getLng());

        Address address = new Address();
        address.setFormattedAddress(geocode.getResults().get(0).getFormatted_address());

        address.setName(geocode.getResults().get(0).getAddress_components().get(0).getLong_name());
        address.setCounty(geocode.getResults().get(0).getAddress_components().get(1).getLong_name());
        address.setRegion(geocode.getResults().get(0).getAddress_components().get(2).getLong_name());
        address.setCountry(geocode.getResults().get(0).getAddress_components().get(3).getLong_name());
        address.setCountryCode(geocode.getResults().get(0).getAddress_components().get(3).getShort_name());
        address.setPostalCode(geocode.getResults().get(0).getAddress_components().get(4).getLong_name());


        response.setAddress(address);


        System.out.println(response.toString());


        return new ResponseEntity<>(response, HttpStatus.OK);
    }

*/
}
