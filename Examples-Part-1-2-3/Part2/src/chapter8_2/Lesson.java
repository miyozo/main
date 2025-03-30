package chapter8_2;
public class Lesson {
	private String LessonId;
	private String Title;
	
	public Lesson(String lessonId, String title) {
		LessonId = lessonId;
		Title = title;
	}
	public int lessonFee() {
		return 1000;
	}
	
	public String getLessonId() {
		return LessonId;
	}
	public String getTitle() {
		return Title;
	}
	public void setLessonId(String lessonId) {
		LessonId = lessonId;
	}
	public void setTitle(String title) {
		Title = title;
	}

}
