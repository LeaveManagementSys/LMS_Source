package com.virtusa.enums;

public enum UserTypes {

	EMPLOYEE("EMPLOYEE"),MANAGER("MANAGER"),HR("HR");
	private String type;
	private UserTypes(String type) {
		this.type=type;
	}
	public String getVal() {
		return type;	
	}
}
