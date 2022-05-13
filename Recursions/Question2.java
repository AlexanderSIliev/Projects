package Recursions;

public class Question2 {
	private static int max = 0;

	public static int findLargestDigit(int n) {
		if (n > 0) {
			if (n % 10 > max) {
				max = n % 10;
			}
		} else if (n < 0) {
			if (n % 10 < max) {
				max = n % 10;
			}
		}
		if ((n - n % 10) / 10 != 0) {
			findLargestDigit((n - n % 10) / 10);
		}
		if (n > 0) {
			return max;
		} else {
			return -max;
		}
	}

	public static void main(String[] args) {
		System.out.println(findLargestDigit(-1739473));
	}

}
