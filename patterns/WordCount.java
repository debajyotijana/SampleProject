package patterns;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {

		System.out.println("Program Started");
		System.out.println("Enter string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int wordCount = computeWordCount(str);
		System.out.println("Number of words present in given string is : " + wordCount);
		System.out.println("Program Ended");
	}

	static int computeWordCount(String str) {

		int wordCount = 0;
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {

			if (strArr[i].length() > 0) // if length of word is greater than 0 then increment word count
				wordCount++;
		}
		return wordCount;
	}

}
