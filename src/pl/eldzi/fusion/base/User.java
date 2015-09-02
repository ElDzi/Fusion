
package pl.eldzi.fusion.base;

import java.util.ArrayList;

public class User {
	private String userName, name, surname;
	private School school;
	private ArrayList<Mark> marks = new ArrayList<>();
	private Attendance attendance;
	public User(long ID) {
		
	}
	
	public User(String user_name) {
		
    }
}
