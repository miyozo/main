package chapter9_2;
import java.time.LocalDate;
import chapter9_1.*; // 9_1パッケージからインポートする 
public class Sample4 {

	public static void main(String[] args) {

		Object obj = new StudentMember(100, "田中宏", LocalDate.of(2026, 3, 31));
		
		switch(obj) {
			case GeneralMember gem	-> System.out.println("一般会員: " + gem.kai_hi());
			case StudentMember stm  -> System.out.println("学生会員: " + stm.kai_hi());
			case SeniorMember  sem	-> System.out.println("シニア会員: " + sem.kai_hi());
			case null				-> System.out.println("nullです");
			default					-> System.out.println("その他のオブジェクト");
		}
	}
}
