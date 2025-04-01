package instanceMethod;

public class Number1 {
	private String name; //文字列name
	
	public boolean equals(Object o) {
		if(this == o) {
			return true; //自身のインスタンスと同じであればtrueを返す。(等値比較)
		}
		
		if(o == null) {
			return false; //引数のインスタンスがnullであればfalseを返す。
		}
		
		if(!(o instanceof Number1)) {
			return false; //引数のインスタンスの型が異なる場合はfalseを返す。
		}
		
		Number1 a = (Number1) o; //インスタンスの型が同じあれば引数を自身のインスタンスの型に変換する。
		
		if(!this.name.trim().equals(a.name.trim())) {
			return false; /*開発者の任意の比較条件を満たさない場合にfalseを返す。
							例では自身のインスタンスと引数のインスタンスの文字列nameの比較を行っている。
							trimメソッドで空白を取り除き、空白があっても文字列が等値であればtrueとなる。*/
		}
		
		return true; //上記の比較条件を満たした場合にtrueを返す。
	}
	
}
