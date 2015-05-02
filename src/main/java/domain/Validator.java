package domain;

import java.util.ArrayList;

public class Validator {
	
	String message;
	User user;
			
	public void isEmptyField(String userName, String email, String password, String password2){
		if (userName == "" || email == "" || password == "" || password2 == ""){
			message = "Należy uzupełnić wszystkie pola";
		}
	}
	public void isPasswordEqual(String password, String password2){
		if(!password.equals(password2)){
			message = "podane hasła są różne";
		}
	}
	
	public void isCorrectLogin(ArrayList<User> registeredUsers, String userName, String password){
		if(registeredUsers.size() == 0){
			message = "Baza użytkowników jest jeszcze pusta. Zarejestruj się";
		}
		for(User user : registeredUsers){
			if(user.getUserName().equals(userName) && user.getPassword().equals(password)){
				this.user = user;
				break;
			}
			else
				message = "Nieprawidłowe hasło lub login";
		}
		
		
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
