package chapter12_2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Sample3A {
	public static void main(String[] args) {
		
		var list = getList();
		list.sort(Comparator.comparing(Computer::price));
		list.forEach(System.out::println);
	}
	public static List<Computer> getList() {
		var list = new ArrayList<Computer>();
		list.add(new Computer("DELO",  	"DELO-200", 50000 ));
		list.add(new Computer("HQ",    	"HQ-110A",  68000 ));
		list.add(new Computer("Panan", 	"PanaMini", 62000 ));
		list.add(new Computer("HQ",		"SeakBook", 98000 ));
		list.add(new Computer("Panan",	"Panalet",  75000 ));
		list.add(new Computer("HQ",		"HQ-Star",  60000 ));
		list.add(new Computer("Latte",	"LatteAir", 85000 ));
		list.add(new Computer("Nect",	"Nectop",   79000 ));
		list.add(new Computer("DELO",	"DELOPad",  48000 ));
		list.add(new Computer("DELO",	"DELO-100", 48000 ));
		return list;
	}
}
