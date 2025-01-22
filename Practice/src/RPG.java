
public class RPG {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者"+h.name+"を生み出しました！");
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		
		Cleric c = new Cleric();
		c.name = "メイ";
		System.out.println("聖職者"+c.name+"を生み出しました！");
		c.selfAid();
	}
}
