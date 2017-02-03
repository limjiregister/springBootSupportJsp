/**
 * Created by Administrator on 2017/2/3.
 */
var app = angular.module('MyApp', ['ngTable']);


app.config(function ($httpProvider) {
	$httpProvider.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded;charset=utf-8';
	$httpProvider.defaults.transformRequest = function (data) {
		if (data === undefined) {
			return data;
		}
		return $.param(data);
	}
});

app.controller("ListCtrl", function ($scope,$http,YourMethods, NgTableParams) {

	var self = this;

	loadYourDatas();

	function loadYourDatas(pageIndex, pageSize) {
		self.tableParams = new NgTableParams({page: !pageIndex ? 1 : pageIndex, count: !pageSize ? 8 : pageSize}, {
			getData: function (params) {

				//确定一个负责页码 和 页大小的 作用域，并且关联ngTable的分页
				$scope.pageIndex = params.page();
				$scope.pageSize = params.count();
				//通过请求数据，把数据集合返回给getData，并且告知ngTable的total大小
				return YourMethods.loadDatas($scope.pageIndex, $scope.pageSize).then(function (result) {
					/*		console.log("$scope.pageIndex", $scope.pageIndex);
					 console.log("$scope.pageSize", $scope.pageSize);*/

					console.log("resykt",result);


					params.total(result.data.data.content);
					return result.data.data.content;
				});
			}
		});
	}

});

app.factory("YourMethods", function ($http) {

	return {
		loadDatas: function (pageNo, pageSize) {


			var args = {"pageNo": pageNo, "pageSize": pageSize};
			var url = "/loadDatas.do";

			return $http.post(url,args,function(data){

				return data;


			   });

		}


	};

});