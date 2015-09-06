
package pl.eldzi.fusion.base;

import java.util.ArrayList;

import pl.eldzi.fusion.base.enums.UserType;

public class User {
	private String userName, name, surname;
	private School school;
	private UserType t;

	// ONLY FOR PUPILS
	// private ArrayList<Mark> marks = new ArrayList<>();
	// private Attendance attendance;

	public User(String userName, String name, String surName, UserType type) {
		this.userName = userName;
		this.name = name;
		surname = surName;
		t = type;
	}

	protected String getUserName() {
		return userName;
	}

	public String getName() {
		return name;
	}

	public UserType getUserType() {
		return t;
	}

	public String getSurName() {
		return surname;
	}

}
