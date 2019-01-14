package patterns;

import java.util.Scanner;

public class EvenOddNum {

	public static void main(String[] args) {

		System.out.println("Program Started");
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Entered number " + num + " is Even");
		} else {
			System.out.println("Entered number " + num + " is Odd");
		}
		System.out.println("Program Ended");
	}

}
