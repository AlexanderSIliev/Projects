package Recursions;

public class Question1 {
	public static int counter = 0;

	public static int countBits(int n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		String nToBinary = Integer.toBinaryString(n);
		if (counter < nToBinary.length()) {
			counter++;
			countBits(n);
		}
		return counter;

	}

	public static void main(String[] args) {
		System.out.println(countBits(1739473));
	}

}
