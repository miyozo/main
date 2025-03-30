package chapter9_2;
import java.time.LocalDate;
import chapter9_1.*; // 9_1パッケージからインポートする 

public class Sample2 {
	public static void main(String[] args) {
		
		Object o = new StudentMember(100, "田中宏", LocalDate.of(2026, 3, 31));
		
		if(o instanceof StudentMember) {
			var m = (StudentMember)o;
			System.out.println( "StudentMember:" + m.getName() + " " + m.isExpired());
		}
	}

}
