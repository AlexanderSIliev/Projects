package Recursions;

public class Question3 {
	private static String nToString = "";

	public static String replaceWith7(int n) {
		if (n % 10 == 7 || n % 10 == -7) {
			nToString += "*";
		} else {
			if (n > 0) {
				nToString += n % 10;
			} else if (n < 0) {
				nToString += -(n % 10);
			}
		}
		if ((n - n % 10) / 10 != 0) {
			replaceWith7((n - n % 10) / 10);
		}
		String nReverse = "";
		char ch[] = nToString.toCharArray();
		for (int i = nToString.length(); i > 0; i--) {
			if (i == nToString.length() && n < 0) {
				nReverse += "-";
			}
			nReverse += ch[i - 1];
		}
		return nReverse;

	}

	public static void main(String[] args) {
		System.out.println(replaceWith7(-717));
	}

}
