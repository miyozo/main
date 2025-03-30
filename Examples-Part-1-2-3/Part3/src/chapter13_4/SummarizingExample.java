package chapter13_4;
import java.util.stream.Collectors;
import jp.kwebs.lib.Book;
public class SummarizingExample {

	public static void main(String[] args) {
		var books = Book.getList();
		var stat = books.stream()
						.collect(Collectors.summarizingInt(Book::getPrice));
		System.out.println(stat);
		
		System.out.println("データ数：" + stat.getCount());
		System.out.println("合計　　：" + stat.getSum());
		System.out.println("平均　　：" + stat.getAverage());
		System.out.println("最大値　：" + stat.getMin());
		System.out.println("最小値　：" + stat.getMax());
	}

}
