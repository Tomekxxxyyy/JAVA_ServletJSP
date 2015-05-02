package domain;

import java.util.ArrayList;

public class RegisteredUsers {

	ArrayList<User> registeredUsers;
	
	public void addUser(User user){
		registeredUsers.add(user);
	}
	public void premiumStatus(int index, boolean premiumStatus){
		registeredUsers.get(index).setPremium(premiumStatus);
	}

	public ArrayList<User> getRegisteredUsers() {
		return registeredUsers;
	}

	public void setRegisteredUsers(ArrayList<User> registeredUsers) {
		if(registeredUsers == null)
			this.registeredUsers = new ArrayList<User>();
		else
			this.registeredUsers = registeredUsers;
	}
	
	
}
