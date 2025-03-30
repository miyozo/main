package chapter9_1;
import java.time.LocalDate;
import java.time.Period;

public class SeniorMember extends Member {
	
	private LocalDate birthday;

	public SeniorMember(long id, String name, LocalDate birthday) {
		super(id, name);
		this.birthday = birthday;
	}
	
	@Override
	public int kai_hi() {
		return age()>=70 ? 250 : 700;
	}
	
	public int age() {
		var today = LocalDate.now();
		var p = Period.between(birthday, today);
		return p.getYears();
	}

	public LocalDate getBirthday() {
		return birthday;
	}
	@Override
	public String toString() {
		return "SeniorMember [birthday=" + birthday + "]";
	}
	
}
