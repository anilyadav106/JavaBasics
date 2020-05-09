package basicjavaprograms;

public class revTest {

	public static void toReverse(String str) {

		char[] chr = str.toCharArray();

		String str1 = "";

		for (int i = chr.length - 1; i >= 0; i--) {

			str1 = str1 + chr[i];

		}

		if (str.equals(str1)) {

			System.out.println("the string is palindrome");
		} else {

			System.out.println("string is not palindrome");
		}
	}

	public static void main(String[] args) {

		revTest.toReverse("Anil");
	}
}
