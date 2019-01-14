package patterns;

public class StringPattern1 {

	public static void main(String[] args) {
		String s1 = "SUN RISES IN EAST";

		char[] chArray = s1.toCharArray();
		for (int i = chArray.length - 1; i >= 0; i--) {
			System.out.print(chArray[i]);
		}

	}

}

// TSAE NI SESIR NUS
