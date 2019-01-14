package patterns;

public class StringPattern4 {

	public static void main(String[] args) {
		String s1 = "SUN RISES IN EAST";

		String[] words = s1.split(" ");

		// for (int i = 0; i < words.length; i++) {

		// if (i == 0) {
		// String temp = words[0];
		// words[0] = words[words.length - 1];
		// words[words.length - 1] = temp;
		// System.out.print(words[i] + " ");
		// } else
		// System.out.print(words[i] + " ");
		// }

		String temp = words[0];
		words[0] = words[words.length - 1];
		words[words.length - 1] = temp;

		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}

	}
}

// EAST RISES IN SUN