package chapter12_3;
import java.util.TreeSet;
public class Sample2 {
	public static void main(String[] args) {
		
		var set = new TreeSet<Meibo>();
		set.add(new Meibo(113, "Anne Hathaway"));
		set.add(new Meibo(102, "Johnny Depp"));
		set.add(new Meibo(115, "Shohei OTANI"));
		
		set.forEach(System.out::println);
		
	}
}
