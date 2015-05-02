<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   response.setHeader( "Pragma", "no-cache" );
   response.setHeader( "Cache-Control", "no-cache" );
   response.setDateHeader( "Expires", 0 );
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div id="register">
	<p>Pierwszy raz w serwisie ? zarejestruj się.</p>
	<form action="RegisterServlet" method = "get">
		<input type="text" name="userName"/>Username</br>
		<input type="password" name="password"/>Password</br>
		<input type="password" name="password2"/>confirm password</br>
		<input type="email" name="email"/>email</br>
		<input type="submit" value="ok"/>
	</form>
	</div>
	<div id="login">
	<p>Jesteś już zarejestrowany ? zaloguj się.</p>
	<form action="LoginServlet" method = "get"> 
		Username<input type="text" name="userName"/></br>
		Password<input type="password" name="password"/></br>
		<input type="submit" value="ok"/>
	</form>
	</div>
	<div class="welcome">
	<p>
		Witamy serdecznie na naszej stronie. Zarejestruj się lub zaloguj.
	</p>
	<p>
		${message}
	</p>
	</div>
</body>
</html>