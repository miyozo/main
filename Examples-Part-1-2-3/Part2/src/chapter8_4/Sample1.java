package chapter8_4;
import java.time.LocalDate;
public class Sample1 {
	public static void main(String[] args) {
		
		 GeneralMember gm = 
				new StudentMember(100, "田中宏", LocalDate.of(2028, 3, 31));
		 
		 System.out.println(gm.getId());
		 System.out.println(gm.getName());
		 
	//	 System.out.println(gm.getExpDate());
		 
	}
}
