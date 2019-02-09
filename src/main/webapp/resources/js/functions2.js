var myApp = angular.module('myApp1', []);
myApp.controller('myController1', function ($scope, $http) {


    $scope.location = '';
    $scope.data ='';


    //HTTP POST methods
    $scope.check = function () {
        $http({
            method: "POST",
            url: 'https://maps.googleapis.com/maps/api/geocode/json',
            params: {address: $scope.location,  key: 'AIzaSyCOBqf1LYN9p_LH-sTWAjg2jXCX_RWfsUI'}
        }).then(function (response) {
            $scope.data = response.data;
            console.log($scope.data);
            check2();
        })
    };

     function check2() {
        $http({
            method: "POST",
            url: 'cokolwiek',
            data: $scope.data,
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(function (response) {
            console.log(response.data);
            _success(response);
        })
    };



    function _success(response) {
        console.log(response.status);
    }


});