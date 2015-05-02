<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		<div id="logout"><a href="LogoutServlet">Wyloguj</a></div>
	
		<c:if test="${sessionScope.user != null || sessionScope.user.premium || sessionScope.user.admin}">
		<div class="account"><a href="user.jsp">User Account</a></div>
		</c:if>
	
		<c:if test="${sessionScope.user.premium || sessionScope.user.admin}">
		<div class="account"><a href="premium.jsp">Premium Account</a></div>
		</c:if>
		
		<c:if test="${sessionScope.user.admin}">
		<div class="account"><a href="admin.jsp">Admin Account</a></div>
		</c:if>
	</header>
