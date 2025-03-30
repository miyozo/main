package chapter8_1;
import java.time.LocalDate;
public class Sample3_ {
	public static void main(String[] args) {

		var date1 = LocalDate.of(2025, 12, 13);
		var date2 = LocalDate.of(2025, 10, 12);
		
		if(date1.equals(date2)) { 
			System.out.println("同じ日です"); 
		} 
		if(date1.isAfter(date2)) {
			System.out.println("date1はdate2より後");
		}
	}

}
