package chapter9_1;
import java.time.LocalDate;
import java.util.ArrayList;
public class Sample1 {
	public static void main(String[] args) {
		
		var ls = new ArrayList<Member>();
		ls.add(new GeneralMember(100, "田中宏"));
		ls.add(new StudentMember(110, "佐藤修",LocalDate.of(2026, 3, 31)));
		ls.add(new SeniorMember(120, "木村花子",LocalDate.of(1961, 2, 11)));
		
		int total = 0;
		for(Member m : ls) {
			total += m.kai_hi();
		}
		System.out.println("合計＝" + total);
		
	}
}
