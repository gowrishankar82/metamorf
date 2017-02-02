/**
 * Created by vagrant on 2/2/17.
 */

var main = angular.module('main', ['ngRoute','ngResource']);

main.config(function($routeProvider){
  $routeProvider.when('/userReport', {
    templateUrl: 'userReport.html',
    controller: 'userReportController'
  })
      .otherwise({ redirectTo: '/' });
});


