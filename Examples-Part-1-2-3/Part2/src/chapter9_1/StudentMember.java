package chapter9_1;
import java.time.LocalDate;
public class StudentMember extends Member {

	private LocalDate expDate;

	public StudentMember(long id, String name, LocalDate expDate) {
		super(id, name);
		this.expDate = expDate;
	}
	@Override
	public int kai_hi() {
		return isExpired() ? 1000 : 500;
	}	
	
	public boolean isExpired() {
		var today = LocalDate.now();
		return today.isAfter(expDate);
	}

	public LocalDate getExpDate() {
		return expDate;
	}
	@Override
	public String toString() {
		return "StudentMember [expDate=" + expDate + "]";
	}
	
}
