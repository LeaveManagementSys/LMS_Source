package com.virtusa.dao;

import com.virtusa.entities.User;

public class UserDAOImpl extends UserDAO {

	public UserDAOImpl() {
		this.userList=
	}
	@Override
	public boolean userAuth(String username, String password) {
		// TODO Auto-generated method stub
		for(User user:userList) {
			if(user.getUsername().equals(password)) {
				if(user.getPassword().equals())
			}
		}
		return super.userAuth(username, password);
	}

	@Override
	public String retrieveuserType(String username) {
		// TODO Auto-generated method stub
		return super.retrieveuserType(username);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
}
