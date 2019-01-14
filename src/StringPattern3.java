package patterns;

public class StringPattern3 {

	public static void main(String[] args) {
		String s1 = "SUN RISES IN EAST";

		String[] words = s1.split(" ");

		for (int i = 0; i < words.length; i++) {
			char[] chArray = words[i].toCharArray();
			for (int j = chArray.length - 1; j >= 0; j--) {
				System.out.print(chArray[j]);
			}
			System.out.print(" ");
		}
	}

}

// NUS SESIR NI TSAE