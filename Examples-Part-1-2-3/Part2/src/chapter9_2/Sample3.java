package chapter9_2;
import java.time.LocalDate;
import chapter9_1.*; // 9_1パッケージからインポートする 
public class Sample3 {

	public static void main(String[] args) {
		
		Object o = new StudentMember(100, "田中宏", LocalDate.of(2026, 3, 31));
		
		if(o instanceof StudentMember v) {
			System.out.println( "StudentMember:" + v.getName() + " " + v.isExpired());
		}
		
	}

}
