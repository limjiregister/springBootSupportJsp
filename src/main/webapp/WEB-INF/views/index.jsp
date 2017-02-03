<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/2/3
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app="MyApp">
<head>
	<title>Title</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body ng-controller="MyCtrl">

<div class="col-md-12" style="margin-bottom: 30px;">

	<a href="/one.do" type="button">jump to 数据列表</a>

</div>


<form class="form-horizontal" role="form" style="width: 50%;margin-top: 100px;">
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">名字</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="firstname"
				   placeholder="请输入名字" ng-model="item.name">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">姓</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="lastname"
				   placeholder="请输入姓" ng-model="item.addr">
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="button" class="btn btn-default" ng-click="saveItem()">保存</button>
		</div>
	</div>
</form>


</body>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/angular.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/user/my.js"></script>
</html>
