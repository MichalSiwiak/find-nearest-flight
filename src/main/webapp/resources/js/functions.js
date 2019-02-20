var myApp = angular.module('myApp', ['ngAnimate']);
myApp.controller('myController', function ($scope, $http) {


    $scope.location = '';
    $scope.data = '';
    $scope.response = '';
    $scope.showData = true;
    $scope.showSpinner = true;


    //HTTP POST methods
    $scope.searchFlight = function () {
        $scope.response.message = null;
        $http({
            method: "POST",
            url: 'https://maps.googleapis.com/maps/api/geocode/json',
            params: {address: $scope.location, key: 'AIzaSyCOBqf1LYN9p_LH-sTWAjg2jXCX_RWfsUI'}
        }).then(function (response) {
            $scope.showData = true;
            $scope.showSpinner = false;
            $scope.data = response.data;

            console.log($scope.data);
            getJsonData();
        })
    };

    function getJsonData() {
        $http({
            method: "POST",
            url: 'searchFlight',
            data: $scope.data,
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(function (response) {
            console.log(response.data);
            $scope.response = response.data;
            _success(response);
        })
    };


    function _success(response) {
        console.log(response.status);
        $scope.showData = false;
        $scope.showSpinner = true;
        if ($scope.response.message == null) {
            initMap();
        }
    }


    function initMap() {
        var map = new google.maps.Map(document.getElementById('map'), {
            zoom: 8,
            center: { // middle point
                lat: ($scope.response.pointLocation.latitude + $scope.response.aircraftLocation.latitude) / 2,
                lng: ($scope.response.pointLocation.longitude + $scope.response.aircraftLocation.longitude) / 2
            }
        });

        var imagePlane = 'https://coffeecoding.net/resources/img/planebig.png';
        var imagePoint = 'https://coffeecoding.net/resources/img/pointsmall.png';
        var plane = new google.maps.Marker({
            position: {
                lat: $scope.response.aircraftLocation.latitude,
                lng: $scope.response.aircraftLocation.longitude
            },
            map: map,
            icon: imagePlane,
            title: 'Nearest Flight'
        });

        var point = new google.maps.Marker({
            position: {
                lat: $scope.response.pointLocation.latitude,
                lng: $scope.response.pointLocation.longitude
            },
            map: map,
            icon: imagePoint,
            title: 'Point'
        });
    }

});