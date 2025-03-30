package chapter8_1;
import java.time.LocalDate;

public class Sample1 {

	public static void main(String[] args) {

		var expDate = LocalDate.of(2030, 1, 12);
		var st = new StudentMember(100, "田中宏", expDate);

		System.out.println(st.kai_hi());
		System.out.println(st.getId());
		System.out.println(st.getName());
	}

}
