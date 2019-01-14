// Narcissistic Number OR Armstrong numbers

//153 = 1^3 + 5^3 + 3^3
//1634 = 1^4 + 6^4 + 3^4 + 4^4

package patterns;

import java.util.Scanner;

class Armstrong {

	int length;

	void computeLength(int num) {
		int rem = 0;
		while (num != 0) {
			num = num / 10;
			length++;
		}
	}

	void checkArmstrong(int num) {
		int sum = 0;
		int rem = 0;
		int mul;
		int temp = num;
		while (temp != 0) {
			rem = temp % 10;
			mul = 1;
			for (int i = 1; i <= length; i++) {
				mul = mul * rem;
			}
			sum = sum + mul;
			temp = temp / 10;
		}

		if (num == sum)
			System.out.println(num + " is a Armstrong number");
		else
			System.out.println(num + " is not a Armstong number");
	}
}

public class ArmstongDemo {

	public static void main(String[] args) {
		System.out.println("Program Started");
		int num;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		Armstrong arm = new Armstrong();
		arm.computeLength(num);
		arm.checkArmstrong(num);
		System.out.println("Program Ended");
	}

}
