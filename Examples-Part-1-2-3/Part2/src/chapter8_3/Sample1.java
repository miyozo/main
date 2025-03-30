package chapter8_3;
import java.time.LocalDate;
public class Sample1 {

	public static void main(String[] args) {

		var gm = new GeneralMember(100, "田中宏");
		var st = new StudentMember(110, "佐藤修", LocalDate.of(2028, 3, 31));
		var se = new SeniorMember(120, "森下花", LocalDate.of(1961, 2, 11));

		System.out.println( gm.kai_hi() );
		System.out.println( st.kai_hi() );
		System.out.println( se.kai_hi() );

	}

}
