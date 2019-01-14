package patterns;

import java.util.Stack;

public class BalancedParanthesis2 {
	static boolean checkParanthesis(String str) {

		Stack<Character> stk = new Stack<Character>();
		char[] charArr = str.toCharArray();
		for (char c : charArr) {
			if (c == '(' || c == '{' || c == '[' || c == '<') {
				stk.push(c);
			} else if (c == ')' || c == '}' || c == ']' || c == '>') {
				if (!stk.empty() && isPair(stk.peek(), c) == true) {
					stk.pop();
				}
			}
		}
		if (stk.empty()) {
			return true;
		} else
			return false;

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
		// String str = "(]";
		String str = "[()]";
		boolean balanced = checkParanthesis(str);
		if (balanced)
			System.out.println(str + " = Balanced Paranthesis");
		else
			System.out.println(str + " = Not Balanced Paranthesis");
		System.out.println("Program Ended");
	}
}
