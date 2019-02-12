<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <link rel="stylesheet" href="resources/css/style.css" type="text/css">
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
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.9/angular.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.0/angular-animate.min.js"></script>
    <script src="resources/js/functions.js"></script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCOBqf1LYN9p_LH-sTWAjg2jXCX_RWfsUI&callback=initMap"
            async defer></script>


<body ng-app="myApp" ng-controller="myController" class="bg-light text-dark" style="">

<div id="wrap">
    <div id="main" class="clear-top">
        <div class="collapse" id="navbarHeader">
            <div class="container">
                <div class="row">
                    <div class="col-md-7 py-4">
                        <h4>About</h4>
                        <p class="text-info">Free open source projects present different java solutions using spring,
                            hibernate and other popular frameworks.</p>
                    </div>
                    <div class="col-md-3 offset-md-1 py-4">
                        <h4>Contact</h4>
                        <ul class="list-unstyled">
                            <li>
                                <a href="https://pl.linkedin.com/in/michalsiwiak" class="text-secondary"
                                   target="_blank">Follow on LinkedIn</a>
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
                        class=""> HOME
                </text>
                </a>
                <a href="https://github.com/MichalSiwiak/find-nearest-flight" target="_blank"
                   class="navbar-brand d-flex align-items-center"><i
                        class="fa fa-git-square fa-fw d-inline-block lead fa-2x"></i>&nbsp;&nbsp;<text class="">SOURCE
                    CODE
                </text>
                </a>
                <a href="${pageContext.request.contextPath}" class="navbar-brand d-flex align-items-center"><i
                        class="fa fa-file-text fa-2x fa-fw lead d-inline-block" aria-hidden="true"></i>&nbsp;&nbsp;<text
                        class="">DESCRIPTION
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
        <div class="text-center py-4 bg-secondary"
             style="	background-image: linear-gradient(to left, rgba(0, 0, 0, 0.1), rgba(0, 0, 0, 0.9));	background-position: top left;	background-size: 100%;	background-repeat: repeat;">
            <div class="container">
                <div class="row">
                    <div class="col-md-0 text-left">
                        <h1 class="text-left text-primary">Find Nearest Flight</h1>
                        <p class="lead text-left"></p>
                    </div>
                </div>
            </div>
        </div>

        <div class="py-0">
            <div class="container">
                <div class="row mt-3">
                    <div class="offset-md-2 m-0" style="">
                        <h4 class="m-0 mb-3 px-3">Enter the location - city, ​​street, province for example: Wrocław,
                            Warszawa Marszałkowska, Zamość lubelskie etc.</h4>
                    </div>
                </div>
            </div>
        </div>

        <div class="py-0">
            <div class="container">
                <form ng-submit="searchFlight()">
                    <div class="row">
                        <div class="m-0 p-0 pr-0 pl-3 col-md-8"><input type="text" required="true"
                                                                       class="form-control text-center rounded-0"
                                                                       placeholder="location ..." ng-model="location">
                        </div>
                        <div class="text-left p-0 pr-3 col-md-4">
                            <button type="submit" style="height:37px" class="btn btn-primary px-1 py-2 w-100">Find
                                Nearest Flight
                            </button>
                        </div>
                    </div>
                </form>
            </div>
        </div>

        <div class="py-0 mt-4">
            <div class="container text-center">
                <div ng-if="response.message"><h3>{{response.message}}</h3></div>
            </div>
        </div>

        <div class="py-0 mt-4" ng-hide="showSpinner">
            <div class="container text-center">
                <h3>Please wait - request is processing ...</h3>
                <div class="loader text-center m-0 mx-auto"></div>
            </div>
        </div>

        <div class="py-0 mt-4" ng-hide="showData" ng-if="!response.message">
            <div class="container">
                <div ng-if="response.message"><h3>{{response.message}}</h3></div>
                <ul class="list-group">
                    <li class="list-group-item d-flex justify-content-between align-items-center">Callsign<h4
                            class="m-0 text-dark">{{response.callsign}}</h4>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">Distance From Aircraft
                        [KM]<h4 class="m-0 text-dark">{{response.distanceFromAircraft}}</h4>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">Aircraft Location
                        [latitude / longitude]<h5 class="m-0 text-dark">
                            {{response.aircraftLocation.latitude}}&nbsp;/&nbsp;{{response.aircraftLocation.longitude}}</h5>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">Point Location
                        [latitude / longitude] <h5 class="m-0 text-dark">
                            {{response.pointLocation.latitude}}&nbsp;/&nbsp;{{response.pointLocation.longitude}}</h5>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">Point Address <h5
                            class="m-0 text-dark">{{response.address.formattedAddress}}</h5>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">Aircraft Type<h4
                            class="m-0 text-dark">{{response.aircraftType}}</h4>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">Route<h4
                            class="m-0 text-dark">{{response.route}}</h4>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">Aircraft Photo <h4
                            class="m-0 text-dark"><img style="width: 300px" src="{{response.photo}}"></h4>
                    </li>
                </ul>
            </div>
        </div>

        <div class="py-0 my-4" ng-hide="showData" ng-if="!response.message">
            <div class="container text-center" style="height:500px;">
                <div id="map"></div>
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