<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<c:import url="header.jsp"/>
    <section>
    	<div class="welcome">
    	Witamy pana admina :)
    	</div>
    	<div>
		<c:forEach  var="users" items="${registeredUsers}" varStatus="index">
		<p>
			<form action = "RegisteredUsersServlet" method ="get" >
				<fieldset>
				<legend>Imie: ${users.userName}</legend>
				isPremium ? ${users.premium}</br>
				SetPremium<input type="radio" name="${index.index}" value= "true"/><br> 
				SetNormal<input type="radio" name="${index.index}" value= "false"/>
				<input type="submit" value="ok"/>
				</fieldset>		
			</form>
		</p>
	</c:forEach>
	</div>
    </section>
    <c:import url="footer.jsp"/>