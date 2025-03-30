package chapter8_3;
import java.time.LocalDate;

import chapter8_1.GeneralMember;
public class StudentMember extends GeneralMember {

	private LocalDate expDate;

	public StudentMember(long id, String name, LocalDate expDate) {
		super(id, name);
		this.expDate = expDate;
	}
	
	public int kai_hi() {
		return 500;
	}
	 
	public boolean isExpired() {
		var today = LocalDate.now(); 
		return today.isAfter(expDate);
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	
}
