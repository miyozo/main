
public class Cleric {
	String name;
	int hp = 50;
	final int maxhp = 50;
	int mp = 10;
	final int maxmp = 10;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = maxhp;
		System.out.println("セルフエイド！HPが"+this.hp+"まで回復した！");
	}
}
