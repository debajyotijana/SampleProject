package patterns;

public class StringPattern5 {

	public static void main(String[] args) {
		String s1 = "SUN RISES IN EAST";
		String[] words = s1.split(" ");

		String temp = words[0];
		words[0] = words[words.length - 1];
		words[words.length - 1] = temp;

		for (int i = 0; i < words.length; i++) {
			if (i == 0 || i == words.length - 1) {
				char[] chArray = words[i].toCharArray();
				for (int j = chArray.length - 1; j >= 0; j--) {
					System.out.print(chArray[j]);
				}
				System.out.print(" ");
			} else {
				System.out.print(words[i] + " ");
			}
		}

	}
}

// TSAE RISES IN NUS