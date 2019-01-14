package patterns;

import java.util.Scanner;

public class StringReverse1 {

	public static void main(String[] args) {

		System.out.println("Program Started");
		System.out.println("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Input String : " + str);
		String revStr = computeReverse(str);
		System.out.println("Reversed String : " + revStr);

		System.out.println("Program Ended");
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
