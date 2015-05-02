<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div><a href="LogoutServlet">Wyloguj</a></div>
	<c:if test="${sessionScope.user.premium || sessionScope.user.admin}">
		Premium
	</c:if>
	<c:if test="${sessionScope.user.admin}">
		Admin
	</c:if>
	<div>
	<c:forEach  var="users" items="${registeredUsers}" varStatus="index">
	<form action = "RegisteredUsersServlet" method ="get" >
		Imie: ${users.userName} Numer: ${index.index} isPremium ? ${users.premium}</br>
		SetPremium<input type="radio" name="${index.index}" value= "true"/> SetNormal<input type="radio" name="${index.index}" value= "false"/>
		<input type="submit" value="ok"/>		
	</form>
	
	</c:forEach>
	</div>
</body>
</html>