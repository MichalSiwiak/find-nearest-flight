<!DOCTYPE html>

<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.9/angular.min.js"></script>
    <script>
        var myApp = angular.module('myApp', []);
        myApp.controller('myController', function ($scope, $http) {
            $http.get('flight')
                .then(function (response) {
                    $scope.jsondata = response.data;
                    console.log("status:" + response.status);
                }).catch(function (response) {
                console.error('Error occurred:', response.status, response.data);
            }).finally(function () {
                console.log("Task Finished.");
            });
        });
        /* Private Methods */
        //HTTP GET- get all employees collection
       /* function _refreshPageData() {
            $http({
                method: 'GET',
                url: 'employees'
            }).then(function successCallback(response) {
                $scope.employees = response.data.employees;
            }, function errorCallback(response) {
                console.log(response.statusText);
            });
        }*/
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
<body>
<div ng-app="myApp" ng-controller="myController">
    <table>
        <tr>
            <th>Name</th>
            <th>Value</th>
        </tr>
        <tr>
            <td>Name1</td>
            <td>{{jsondata.icao24}}</td>
        </tr>
        <tr>
            <td>Name2</td>
            <td>{{jsondata.callsign}}</td>
        </tr>
        <tr>
            <td>Name3</td>
            <td>{{jsondata.origin_country}}</td>
        </tr>
    </table>
</div>
</body>
</html>