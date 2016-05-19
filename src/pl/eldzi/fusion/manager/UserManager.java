
package pl.eldzi.fusion.manager;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import pl.eldzi.fusion.base.Class;
import pl.eldzi.fusion.base.Pupil;
import pl.eldzi.fusion.base.Teacher;
import pl.eldzi.fusion.base.enums.UserType;

public class UserManager {
	private static ArrayList<Class> classes = new ArrayList<>();

	private static ArrayList<Teacher> teachers = new ArrayList<>();

	private static ArrayList<Pupil> pupils = new ArrayList<>();

	public static void registerClass(Class claz) {
		if (claz != null && claz.getTutor() != null && claz.getPupils() != null
		        && claz.getPupils().size() >= 1) {
			if (!classes.contains(claz) | !containByName(claz)) {
				classes.add(claz);
				// TODO: COLORED LOGGER!
				// TODO: INSERT MYSQL!
				System.out.println("Klasa " + claz.getName()
				        + " zostala pomyslnie zarejestrowana !");
			}
		}
	}

	public static void registerTeacher(Teacher t) {
		if (t != null && t.getUserType().equals(UserType.TEACHER)) {
			if (!teachers.contains(t) || !containByName(t)) {
				teachers.add(t);
			}
		}
	}

	public static boolean containByName(Teacher t) {
		if (t == null) {
			return false;
		}

		if (teachers.isEmpty()) {
			return false;
		}
		for (Teacher ti : teachers) {
			if (ti.getName().toLowerCase().equals(t.getName().toLowerCase())) {
				return true;
			}
		}
		return false;
	}

	public static boolean containByName(Class claz) {
		if (claz == null) {
			return false;
		}
		if (classes.isEmpty()) {
			return false;
		}
		for (Class cl : classes) {
			if (cl.getName().toLowerCase().equals(claz.getName().toLowerCase())) {
				return true;
			}
		}
		return false;

	}
}
