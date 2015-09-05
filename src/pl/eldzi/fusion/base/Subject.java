
package pl.eldzi.fusion.base;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Subject {
	private String name;
	private Date s, e;
	private Teacher t;

	@SuppressWarnings("deprecation")
    public Subject(String subjectName, Date startLessonDate, Teacher teacher) {
		name = subjectName;
		s = startLessonDate;
		e = new Date(s.getYear(), s.getMonth(), s.getDate(), s.getHours(),
		        s.getMinutes() + 45, s.getSeconds());
		t = teacher;
	}

	public Date getStartDate() {
		return s;
	}

	public Date getEndDate() {
		return e;
	}

}
