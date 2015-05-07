package domain;

import java.util.ArrayList;

public class User{
	
	public ArrayList<Addresses> addressesList;
	
	String userName;
	String password;
	String email;
	
	boolean premium;
	boolean admin;
	
	public void editList(int index, Addresses address){
		addressesList.set(index, address);
	}
	
	public void removeFromList(int index){
		addressesList.remove(index);
	}
	
	public void addToList(Addresses address){
		if(addressesList == null)
			addressesList = new ArrayList<Addresses>();
		addressesList.add(address);
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isPremium() {
		return premium;
	}
	public void setPremium(boolean premium) {
		this.premium = premium;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public ArrayList<Addresses> getAddressesList() {
		return addressesList;
	}
	public void setAddressesList(ArrayList<Addresses> addressesList) {
		this.addressesList = addressesList;
	}
		
	
}
