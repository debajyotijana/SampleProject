package patterns;

public class StringPattern2 {

	public static void main(String[] args) {
		String s1 = "SUN RISES IN EAST";

		String[] word = s1.split(" ");

		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i] + word[i].length() + " ");
		}
	}

}

// SUN3 RISES5 IN2 EAST4