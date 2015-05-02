<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<c:import url="header.jsp"/>
    <section>
    	<div class="welcome">
    		Witamy  strefie premium ! ${sessionScope.user.userName}
    	</div>
    </section>
    <c:import url="footer.jsp"/>