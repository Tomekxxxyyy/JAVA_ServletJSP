<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<div style ="position:fixed;left:40%;top:20%;">
	<form action="EditAddressServlet" method="get">
		<select name="addressType">
			<option value="zameldowania">zameldowania</option>
  			<option value="korespondencyjny">korespondencyjny</option>
  			<option value="pracy">pracy</option>
  		</select>Podaj rodzaj adresu</br>
  		
  		<select name="voivodeship">	
  			<option value="Dolnośląskie">Dolnośląskie</option>
            <option value="Kujawsko-Pomorskie">Kujawsko-Pomorskie</option>
            <option value="Lubelskie">Lubelskie</option>
            <option value="Lubuskie">Lubuskie</option>
            <option value="Łódzkie">Łódzkie</option>
            <option value="Małopolskie">Małopolskie</option>
            <option value="Mazowieckie">Mazowieckie</option>
            <option value="Opolskie">Opolskie</option>
            <option value="Podkarpackie">Podkarpackie</option>
            <option value="Podlaskie">Podlaskie</option>
            <option value="Pomorskie">Pomorskie</option>
            <option value="Śląskie">Śląskie</option>
            <option value="Świętokrzyskie">Świętokrzyskie</option>
            <option value="Warmińsko-Mazurskie">Warmińsko-Mazurskie</option>
            <option value="Wielkopolskie">Wielkopolskie</option>
            <option value="Zachodniopomorskie">Zachodniopomorskie</option>
         </select> Podaj Województwo</br>
         
		<input type="text" name="city" value="${city}"/>Miasto</br>
		<input type="text" name="postcode" value="${postcode}"/>Kod pocztowy</br>
		<input type="text" name="street" value="${street}"/>Ulica</br>
		<input type="text" name="houseNumber" value="${houseNumber}"/>Numer domu
		<input type="hidden" name="index" value="${index}"/>
		<input type="submit" value="Zatwierdź"> <a href="UserDisplayServlet?action=resign">Rezygnuj</a>
	</form>
	</div>