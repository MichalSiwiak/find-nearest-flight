<!DOCTYPE html>

<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.9/angular.min.js"></script>
    <script>
        var myApp = angular.module('myApp', []);
        myApp.controller('myController', function ($scope, $http) {

            //Initialize page with default data which is blank in this example
            $scope.form = {
                latitude: "",
                longitude: "",
            };

            _refreshPageData();

            //HTTP get methods
            function _refreshPageData() {
                $http.get('flight')
                    .then(function (response) {
                        $scope.jsondata = response.data;
                        console.log("status:" + response.status);
                    }).catch(function (response) {
                    console.error('Error occurred:', response.status, response.data);
                }).finally(function () {
                    console.log("Task Finished.");
                });
            }

            //HTTP PUT methods
            $scope.checkFlight = function () {
                $http({
                    method: "POST",
                    url: 'checkflight',
                    data: angular.toJson($scope.form),
                    headers: {
                        'Content-Type': 'application/json'
                    }
                }).then(_success, _error);
            };

            function _success(response) {
                _refreshPageData();
                _clearForm()
            }

            function _error(response) {
                console.log(response.statusText);
            }

            //Clear the form
            function _clearForm() {
                $scope.form.latitude = "";
                $scope.form.longitude = "";
            };


        });
    </script>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body ng-app="myApp" ng-controller="myController">
<div>
    <table>
        <tr>
            <th>Name</th>
            <th>Value</th>
        </tr>
        <tr>
            <td>Icao24</td>
            <td>{{jsondata.icao24}}</td>
        </tr>
        <tr>
            <td>Callsign</td>
            <td>{{jsondata.callsign}}</td>
        </tr>
        <tr>
            <td>Origin Country</td>
            <td>{{jsondata.origin_country}}</td>
        </tr>
    </table>
</div>
<h2>Check Flight</h2>

<form ng-submit="checkFlight()">
    <table>
        <tr>
            <td>Latitude</td>
            <td><input type="text" ng-model="form.latitude" size="60"/></td>
        </tr>
        <tr>
            <td>Longitude</td>
            <td><input type="text" ng-model="form.longitude" size="60"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form>
</body>
</html>