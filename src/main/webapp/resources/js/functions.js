var myApp = angular.module('myApp', []);
myApp.controller('myController', function ($scope, $http) {


    $scope.location = '';
    $scope.data = '';
    $scope.response = '';


    //HTTP POST methods
    $scope.searchFlight = function () {
        $http({
            method: "POST",
            url: 'https://maps.googleapis.com/maps/api/geocode/json',
            params: {address: $scope.location, key: 'AIzaSyCOBqf1LYN9p_LH-sTWAjg2jXCX_RWfsUI'}
        }).then(function (response) {
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
    }

});