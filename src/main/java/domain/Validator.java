package domain;

public class Validator {
	
	String message;
	
	public String isEmptyField(String userName, String email, String password, String password2){
		if (userName == "" || email == "" || password == "" || password2 == ""){
			message = "Należy uzupełnić wszystkie pola";
		}
		
		return message;
	}
	public String isPasswordEqual(String password, String password2){
		if(!password.equals(password2)){
			message = "podane hasła są różne";
		}
				
		return message;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
