
package pl.eldzi.fusion.base;

import pl.eldzi.fusion.base.enums.UserType;

public class Teacher extends User {
	private Subject[] subjects;
	private Class claz;

	public Teacher(String userName, String name, String surName, UserType type,
	        Class clas, Subject... subj) {
		super(userName, name, surName, type);
		claz = clas;
		subjects = subj;
		if (!getUserType().equals(UserType.TEACHER)) {

		}
	}

	public Subject[] getSubjects() {
		return subjects;
	}

}
