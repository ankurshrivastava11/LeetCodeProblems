package practicet;

public class X {
	public enum Bills {
		ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
	}
	public static void main(String[] args) {
		for(Bills b : Bills.values())
			System.out.println(b + ", ordinal " + b.ordinal());	
	}	
}