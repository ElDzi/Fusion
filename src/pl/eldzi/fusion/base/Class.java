
package pl.eldzi.fusion.base;

import java.util.ArrayList;

public class Class {
	private Teacher tutor;
	private int sizeOfClass;
	private ArrayList<Pupil> pupils;
	private String name;

	public Class(long ID) {

	}

	public Class(String name) {
	}

	public ArrayList<Pupil> getPupils() {
		return pupils;
	}

	public Teacher getTutor() {
		return tutor;
	}

	public String getName() {
		return name;
	}
}
