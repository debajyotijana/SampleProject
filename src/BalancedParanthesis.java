package patterns;

import java.util.Stack;

public class BalancedParanthesis {
	static boolean checkParanthesis(String str) {

		Stack<Character> stk = new Stack<Character>();
		char[] charArr = str.toCharArray();
		for (char c : charArr) {
			switch (c) {
			case '(':
			case '{':
			case '[':
			case '<':
				stk.push(c);
				break;
			default:
				if (!stk.empty() && isPair(stk.peek(), c) == true) {
					stk.pop();
				}
				break;
			}
		}
		if (stk.empty()) {
			return true;
		} else {
			return false;
		}
	}

	static boolean isPair(char opening, char closing) {

		if (opening == '(' && closing == ')')
			return true;
		else if (opening == '{' && closing == '}')
			return true;
		else if (opening == '[' && closing == ']')
			return true;
		else if (opening == '<' && closing == '>')
			return true;
		else
			return false;

	}

	public static void main(String[] args) {

		System.out.println("Program Started");
		// String str = "[{()}<>]";
		String str = "[a+b*(c])";
		boolean balanced = checkParanthesis(str);
		if (balanced)
			System.out.println(str + " = Balanced Paranthesis");
		else
			System.out.println(str + " = Not Balanced Paranthesis");
		System.out.println("Program Ended");
	}
}
