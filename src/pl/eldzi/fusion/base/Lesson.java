
package pl.eldzi.fusion.base;

import java.util.Date;

public class Lesson {
	private Subject s;

	public Lesson(Subject subj) {
		s = subj;
	}

	public Subject getSubject() {
		return s;
	}

	public Date getStartDate() {
		return getSubject().getStartDate();
	}

	public Date getEndDate() {
		return getSubject().getEndDate();
	}

}
