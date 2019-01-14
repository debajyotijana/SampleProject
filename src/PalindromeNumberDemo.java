package patterns;

import java.util.Scanner;

class PalindromeNumber {

	int number;
	int temp;
	int revNumber;

	void computeReverse() {
		int rem = 0;
		while (temp != 0) {
			rem = temp % 10;
			temp = temp / 10;
			revNumber = revNumber * 10 + rem;
		}
		System.out.println("Reverse of " + number + " is : " + revNumber);
	}

	void checkPalindrome() {
		if (number == revNumber)
			System.out.println("Number " + number + " is Palindrome");
		else
			System.out.println("Number " + number + " is Not Palindrome");
	}
}

public class PalindromeNumberDemo {

	public static void main(String[] args) {

		System.out.println("Program Started");
		PalindromeNumber pl = new PalindromeNumber();
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		pl.number = sc.nextInt();
		pl.temp = pl.number;
		pl.computeReverse();
		pl.checkPalindrome();

		System.out.println("Program Ended");
	}

}
