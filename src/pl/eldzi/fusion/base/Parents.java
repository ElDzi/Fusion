
package pl.eldzi.fusion.base;

import pl.eldzi.fusion.base.enums.UserType;

public class Parents extends User {
	private Pupil pupil;

	public Parents(String userName, String name, String surName, UserType type) {
		super(userName, name, surName, type);
		pupil = null; // TODO
	}

}
