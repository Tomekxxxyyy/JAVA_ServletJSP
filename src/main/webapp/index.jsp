<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body><p>
	<form action="RegisterServlet" method = "get">
		Username<input type="text" name="userName"/></br>
		Password<input type="password" name="password"/></br>
		confirm password<input type="password" name="password2"/></br>
		email<input type="email" name="email"/></br>
		<input type="submit" value="ok"/>
	</form>
	</p>
	<p>
	<form action="LoginServlet" method = "get"> 
		Username<input type="text" name="userName"/></br>
		Password<input type="password" name="password"/></br>
		<input type="submit" value="ok"/>
	</form>
	</p>
	<p>
		${message}
	</p>
</body>
</html>