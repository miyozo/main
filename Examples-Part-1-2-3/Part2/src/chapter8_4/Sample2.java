package chapter8_4;
import java.time.LocalDate;
public class Sample2 {
	public static void main(String[] args) {
		
		 GeneralMember gm = 
				new StudentMember(100, "田中宏", LocalDate.of(2028, 3, 31));
		 
		 System.out.println(gm.kai_hi()); 
		 
	}
}
