package patterns;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		System.out.println("Program Started");
		System.out.println("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Input String : " + str);

		String revStr = computeReverse(str);
		System.out.println("Reversed String : " + revStr);

		checkPalindrome(str, revStr);

		System.out.println("Program Ended");
	}

	static void checkPalindrome(String str, String revStr) {
		if (revStr.equals(str)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}
	}

	static String computeReverse(String str) {

		String revStr = "";
		char[] charArr = str.toCharArray();
		for (int i = charArr.length - 1; i >= 0; i--) {
			revStr = revStr + charArr[i];
		}
		return revStr;

	}

}
