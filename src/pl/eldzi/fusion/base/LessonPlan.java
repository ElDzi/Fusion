
package pl.eldzi.fusion.base;

public class LessonPlan {

	Lesson[] m, tu, w, th, f;

	public LessonPlan(Lesson[] monday, Lesson[] tuesday, Lesson[] wednesday,
	        Lesson[] thursday, Lesson[] friday) {
		m = monday;
		tu = tuesday;
		w = wednesday;
		th = thursday;
		f = friday;
	}
}
