<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<c:import url="header.jsp"/>
    <section>
    	<div class="welcome">
    	Witamy ! ${sessionScope.user.userName}
    	</div>
    	<div>
    		<c:if test = "${user.addressesList == null}">
    			<p>Nie masz jeszcze żadnych adresów</p>
    		</c:if>
    	</div>
    	<div>
    		<c:if test = "${user.addressesList != null}">
    			<c:forEach  var="addressList" items="${user.addressesList}" varStatus="loop">
					<p>
					<fieldset>
					<legend>Rodzaj adresu: ${addressList.addressType}</legend>
					Województwo ${addressList.voivodeship}</br>
					Miasto ${addressList.city}</br> 
					Kod pocztowy ${addressList.postcode}</br>
					Ulica ${addressList.street}</br>
					Numer mieszkania ${addressList.houseNumber}</br>
					</fieldset>
					<p>
						<a href="RemoveAddressServlet?index=${loop.index}">Usuń adres</a>						
					</p>
					<p>
						<a href="UserDisplayServlet?index=${loop.index}&addressType=${addressList.addressType}&voivodeship=${addressList.voivodeship}&city=${addressList.city}&postcode=${addressList.postcode}&street=${addressList.street}&houseNumber=${addressList.houseNumber}&action=edit">Modyfikuj adres</a>
					</p>		
					</p>
				</c:forEach>
    		</c:if>
    	</div>
    	<div>
    		
    	</div>
    	 	<a href="UserDisplayServlet?action=add">Dodaj adres</a>
    		<c:if test = '${display == "new"}'>
    			<c:import url="addressesForm.jsp"/>
    		</c:if>
    		<c:if test = '${display == "edit"}'>
    			<c:import url="editAddressesForm.jsp"/>
    		</c:if>
    		
    </section>
    <c:import url="footer.jsp"/>