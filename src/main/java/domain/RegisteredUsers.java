package domain;

import java.util.ArrayList;

public class RegisteredUsers {

	ArrayList<User> registeredUsers;
	
	public void addUser(User user){
		registeredUsers.add(user);
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
