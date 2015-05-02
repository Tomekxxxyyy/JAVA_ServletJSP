package domain;

public class Displayer {
		
	String admin = "admin.jsp";
	String user = "user.jsp";
	String premium = "premium.jsp";
	
	public String validateUser(User user){
		if(user.isAdmin() == true)
			return admin;
		else if(user.isPremium() == true)
			return premium;
		else
			return this.user;
		
	}
	
}
