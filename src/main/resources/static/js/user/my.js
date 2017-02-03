/**
 * Created by Administrator on 2017/2/3.
 */
var app = angular.module('MyApp', []);


app.config(function ($httpProvider) {
	$httpProvider.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded;charset=utf-8';
	$httpProvider.defaults.transformRequest = function (data) {
		if (data === undefined) {
			return data;
		}
		return $.param(data);
	}
});

app.controller("MyCtrl", function ($scope,$http) {


	$scope.saveItem = function () {

		var url = "/save.do";

		$http({
			method: 'POST',
			data: $scope.item,
			url: url
		}).success(function (response, status, headers, config) {

			console.log("response:",response);

			if (response.errorCode==1) {

				$scope.item = {};
				alert("成功保存："+response.data.name+","+response.data.addRange)

			}

		}).error(function (response, status, headers, config) {

			alert(status + response);

		});


	};


});