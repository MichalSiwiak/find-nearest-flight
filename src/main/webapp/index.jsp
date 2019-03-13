<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>coffeecoding.net</title>
    <meta name="description"
          content="Free open source projects present different java solutions using spring, hibernate and other popular frameworks.">
    <meta name="keywords"
          content="java, spring, hibernate, apache, tomcat, coding, programmer, linux, google cloud platform, open source, bootstrap, mysql, java ideas">
    <!-- CSS dependencies -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
          type="text/css">
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker.standalone.min.css">
    <link rel="stylesheet" href="https://coffeecoding.net/resources/css/now-ui-kit.css" type="text/css">
    <link rel="stylesheet" href="https://coffeecoding.net/resources/css/style.css" type="text/css">
    <link rel="icon" href="resources/img/favicon.png">
    <!-- PAGE scripts -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.js"></script>
</head>


<body class="bg-light text-dark">
<div id="wrap">
    <div id="main" class="clear-top">


        <div class="collapse" id="navbarHeader">
            <div class="container">
                <div class="row">
                    <div class="col-md-7 py-4">
                        <h4>About</h4>
                        <p class="text-info">Free open source projects present different java solutions using spring,
                            hibernate
                            and other popular frameworks.</p>
                    </div>
                    <div class="col-md-3 offset-md-1 py-4">
                        <h4>Contact</h4>
                        <ul class="list-unstyled">
                            <li>
                                <a href="https://pl.linkedin.com/in/michalsiwiak" class="text-secondary"
                                   target="_blank">Follow
                                    on LinkedIn</a>
                            </li>
                            <li>
                                <a href="mailto:info@coffeecoding.net" target="_top" class="text-secondary">Email me</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>


        <div class="navbar sticky-top navbar-dark bg-info">
            <div class="container d-flex justify-content-between">
                <a href="https://www.coffeecoding.net/" class="navbar-brand d-flex align-items-center"><i
                        class="fa fa-home fa-2x lead fa-fw d-inline-block" aria-hidden="true"></i>&nbsp;&nbsp;<text
                        class="">
                    HOME
                </text>
                </a>
                <a href="https://github.com/MichalSiwiak/find-nearest-flight" target="_blank"
                   class="navbar-brand d-flex align-items-center"><i
                        class="fa fa-git-square fa-fw d-inline-block lead fa-2x"></i>&nbsp;&nbsp;<text class="">SOURCE
                    CODE
                </text>
                </a>
                <a href="${pageContext.request.contextPath}/demo" class="navbar-brand d-flex align-items-center"><i
                        class="fa fa-desktop fa-2x fa-fw lead d-inline-block" aria-hidden="true"></i>&nbsp;&nbsp;<text
                        class="">DEMO VIEW
                </text>
                </a>
                <a href="https://coffeecoding.net/resources/img/cv_msiwiak.pdf" target="_blank"
                   class="navbar-brand d-flex align-items-center"><i
                        class="fa fa-address-card fa-2x lead fa-fw d-inline-block" aria-hidden="true"></i>&nbsp;&nbsp;<text
                        class="">RESUME
                </text>
                </a>
                <a href="/contact" class="navbar-brand d-flex align-items-center"><i
                        class="fa fa-envelope fa-2x lead fa-fw d-inline-block" aria-hidden="true"></i>&nbsp;&nbsp;<text
                        class="">CONTACT
                </text>
                </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarHeader"><span
                        class="navbar-toggler-icon"></span></button>
            </div>
        </div>


        <div class="py-5">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <h1 class="text-left">Find Nearest Flight</h1>
                        <hr>
                        <h5>This application is a solution for the task placed on reddit
                            <a href="https://www.reddit.com/r/dailyprogrammer/comments/8i5zc3/20180509_challenge_360_intermediate_find_the/"
                               target="_blank">HERE.</a><br>
                            <br>The application searches the nearest flight and aircraft information from the point
                            entered. By using the google API, the application looks for geographical coordinates of the
                            point based on the address entered. Then search for the nearest plane using the API:
                            https://opensky-network.org/api/states/all.</h5>
                        <h5>The application supports operations:</h5>
                        <h5>
                            <ul>
                                <li>parsing JSON data,</li>
                                <li>scraping data using web crawler in order to find other information (for example
                                    aircraft photo),
                                </li>
                                <li>sharing own api,</li>
                                <li>using google api.</li>
                            </ul>
                        </h5>
                        <h5><b>Back End: </b>Java, Spring MVC, Spring Web Services.</h5>
                        <h5><b>Front End: </b>HTML, CSS, AngularJS.</h5>
                        <h5>To run application: git clone
                            https://github.com/MichalSiwiak/find-nearest-flight.git,
                            upload and run application using tomcat application server or similar.</h5>
                        <h5>Demo View: <a href="https://www.coffeecoding.net/flights/demo">https://www.coffeecoding.net/flights/demo</a>
                        </h5>
                        <h5>Controller class (full code is available on github):</h5>
                    </div>
                </div>
                <pre><code class="java">
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


            System.out.println(pointLocation.toString());
            //searching nearest flight from opensky-network.org
            flightManager = new FlightManager(new URL("https://opensky-network.org/api/states/all"));
            State nearestFlight = flightManager.findNearestFlight(pointLocation.getLatitude(), pointLocation.getLongitude());


            System.out.println(nearestFlight.toString());
            //setting other information from opensky-network.org
            response.setDistanceFromAircraft(flightManager.getNearestDistance());
            aircraftLocation.setLatitude(nearestFlight.getLatitude());
            aircraftLocation.setLongitude(nearestFlight.getLongitude());


            //setting other information from  google api
            String formatted_address = geocode.getResults().get(0).getFormatted_address();
            address.setFormattedAddress(((formatted_address == null) ? "N/A" : formatted_address));
            response.setPointLocation(pointLocation);
            response.setAircraftLocation(aircraftLocation);
            response.setAddress(address);


            if (nearestFlight.getCallsign().trim().length() != 0 && nearestFlight.getCallsign() != null) {

                response.setCallsign(nearestFlight.getCallsign());

                //connecting to flightradar using callsign number
                HttpClient client = HttpClientBuilder.create().build();
                HttpGet request = new HttpGet("https://www.flightradar24.com/v1/search/web/find?query=" + nearestFlight.getCallsign().trim());
                HttpResponse flightradarResponse = client.execute(request);
                HttpEntity entity = flightradarResponse.getEntity();
                String content = EntityUtils.toString(entity);

                //getting details of flight from flightradar
                flightradar = new Gson().fromJson(content, Flightradar.class);
                if (flightradar.getResults().size() != 0) {
                    String route = flightradar.getResults().get(0).getDetail().getRoute();
                    response.setRoute(((route == null) ? "N/A" : route));
                    String ac_type = flightradar.getResults().get(0).getDetail().getAc_type();
                    response.setAircraftType(((ac_type == null) ? "N/A" : ac_type));
                    String logo = flightradar.getResults().get(0).getDetail().getReg();

                    if (logo != null) {
                        Document document = Jsoup.connect("https://www.airliners.net/search?keywords=" + logo).timeout(6000).get();
                        Elements elements = document.select("div.ps-v2-results-photo");
                        if (elements.size() != 0) {
                            URL url = new URL(elements.get(0).getElementsByTag("img").attr("src"));
                            response.setPhoto(((url == null) ? new URL("https://coffeecoding.net/resources/img/plane-no-photo.png") : url));
                        }
                    } else {
                        response.setPhoto(new URL("https://coffeecoding.net/resources/img/plane-no-photo.png"));
                    }
                } else {
                    response.setRoute("N/A");
                    response.setAircraftType("N/A");
                    response.setPhoto(new URL("https://coffeecoding.net/resources/img/plane-no-photo.png"));
                }
            } else {
                response.setRoute("N/A");
                response.setAircraftType("N/A");
                response.setPhoto(new URL("https://coffeecoding.net/resources/img/plane-no-photo.png"));
            }


        } catch (Exception e) {
            e.printStackTrace();
            Response responseError = new Response();
            responseError.setMessage("No results! The server did not find the required flight number. Please try again or select the exact location.");
            System.out.println(responseError.getMessage());
            return new ResponseEntity<>(responseError, HttpStatus.OK);
        }

        System.out.println(response.toString());
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @GetMapping("/error")
    public String showErrorPage() {
        return "error-page";

    }
}
</code></pre>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/9.11.0/highlight.min.js"></script>
                <script>
                    hljs.initHighlightingOnLoad();
                </script>
            </div>
        </div>


    </div>
</div>


<footer class="footer bg-dark text-muted">
    <div class="container">
        <p class="float-right">
            <a href="#">Back to top</a>
        </p>
        <p>© Copyright 2018 coffeecoding.net - All rights reserved.<br>Contact: info@coffeecoding.net<br>Warsaw PL<br><a
                href="https://www.coffeecoding.net/">Visit the homepage</a>
        </p>
    </div>
</footer>


</body>
</html>