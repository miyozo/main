package chapter8_2;
public class Member {
	private long id;
	private String name;
	private Lesson lesson;

	public Member(long id, String name, Lesson lesson) {
		this.id = id;
		this.name = name;
		this.lesson = lesson;
	}
	public int lessonFee() {
		return lesson.lessonFee();
	}
	
	public String getLessonId() {
		return lesson.getLessonId();
	}
	public String getTitle() {
		return lesson.getTitle();
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Lesson getLesson() {
		return lesson;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}
}
