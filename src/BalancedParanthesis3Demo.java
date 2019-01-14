package patterns;

import java.util.Scanner;

class Paranthesis {
	String exp;
	int top = -1;
	char[] arr = new char[10];

	void push(char c, int chArrLength) {
		if (top == chArrLength) {
			System.out.println("Stack Full");
		} else {
			top++;
			arr[top] = c;
		}
	}

	void pop() {
		if (top < 0) {
			System.out.println("Stack Empty");
		} else {
			--top;
		}
	}

	void checkBalParanthesis() {
		char[] chArr = exp.toCharArray();
		for (char c : chArr) {
			if (c == '(' || c == '{' || c == '[' || c == '<') {
				push(c, chArr.length);
			} else if (c == ')' || c == '}' || c == ']' || c == '>') {
				if (isPair(arr[top], c) == true) {
					pop();
				}
			}
		}

		if (top == -1)
			System.out.println("String " + exp + " is Balanced Paranthesis");
		else
			System.out.println("String " + exp + " is not Balanced Paranthesis");

	}

	boolean isPair(char open, char close) {
		if (open == '(' && close == ')')
			return true;
		else if (open == '{' && close == '}')
			return true;
		else if (open == '[' && close == ']')
			return true;
		else if (open == '<' && close == '>')
			return true;
		else
			return false;
	}
}

public class BalancedParanthesis3Demo {

	public static void main(String[] args) {
		System.out.println("Program Started");
		Paranthesis p1 = new Paranthesis();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String with paranthesis");
		p1.exp = sc.next();
		p1.checkBalParanthesis();
		System.out.println("Program Ended");
	}
}
