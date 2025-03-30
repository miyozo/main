package chapter8_1;
import java.time.LocalDate;
import java.time.Period;

public class SeniorMember extends GeneralMember {
	private LocalDate birthday;

	public SeniorMember(long id, String name, LocalDate birthday) {
		super(id, name);
		this.birthday = birthday;
	}
	
	public int age() {
		var today = LocalDate.now();
		var p = Period.between(birthday, today);
		return p.getYears();
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
}
