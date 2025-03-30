package chapter8_2;
public class Sample1 {
	public static void main(String[] args) {

		Lesson lesson = new Lesson("A12", "ヨガ");
		Member m = new Member(100, "田中宏", lesson);
		
		System.out.println("レッスン料金＝" + m.lessonFee() + "円");
		
	}
}
