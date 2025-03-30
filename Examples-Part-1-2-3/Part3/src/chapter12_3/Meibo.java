package chapter12_3;

public record Meibo(int number, String name)
									implements Comparable<Meibo> {

	@Override
	public int compareTo(Meibo o) {
		return 0;
	}

	
}
