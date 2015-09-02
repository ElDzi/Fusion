
package pl.eldzi.fusion.manager;

import java.util.ArrayList;

import pl.eldzi.fusion.base.Class;
import pl.eldzi.fusion.base.Pupil;
import pl.eldzi.fusion.base.Teacher;

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
				System.out.println("Klasa " + claz.getName()
				        + " zostala pomyslnie zarejestrowana !");
			}
		}
	}

	protected static boolean containByName(Class claz) {
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
