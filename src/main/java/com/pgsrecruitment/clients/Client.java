package com.pgsrecruitment.clients;

public class Client {
	
	String name;
	String surname;
	
	public Client(String initName, String initSurname) {
		this.name = initName;
		this.surname = initSurname;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
