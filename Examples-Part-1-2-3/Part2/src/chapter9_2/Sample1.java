package chapter9_2;
import java.time.LocalDate;
import chapter9_1.*; // 9_1パッケージからインポートする 

public class Sample1 {
	public static void main(String[] args) {
		
		Object o = new StudentMember(100, "田中宏", LocalDate.of(2026, 3, 31));
		
		if(o instanceof Member) {
			System.out.println("Member");
		}
		if(o instanceof GeneralMember) {
			System.out.println("GeneralMember");
		}
		if(o instanceof StudentMember) {
			System.out.println("StudentMember");
		}
		if(o instanceof SeniorMember) {
			System.out.println("SeniorMember");
		}
	}

}
