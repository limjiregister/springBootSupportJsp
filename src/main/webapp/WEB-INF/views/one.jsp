<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/2/3
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app="MyApp">
<head>
	<title>数据列表</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/ng-table.min.css">
</head>
<body ng-controller="ListCtrl as vm">

<div style="padding: 20px;">
	<table ng-table="vm.tableParams" class="table table-condensed table-bordered table-striped" show-filter="false"
		   ng-table-columns-binding="vm.cols">
		<tr ng-repeat="users in $data">
			<td title="'序号'" filter="{ id: 'number'}" sortable="'id'">
				{{$index+1}}
			</td>
			<td title="'ID'" filter="{ id: 'number'}" sortable="'id'" ng-if="true">
				{{users.id}}
			</td>
			<td title="'Name'" filter="{ name: 'text'}" sortable="'name'" ng-if="true">
				{{users.name}}
			</td>
			<td title="'Addr'" filter="{ addr: 'text'}" sortable="'addr'" ng-if="true">
				{{users.addr}}
			</td>
		</tr>
	</table>
</div>


</body>

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/angular.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/ng-table.min.js"></script>
<script type="text/javascript" src="js/user/list.js"></script>
</html>
