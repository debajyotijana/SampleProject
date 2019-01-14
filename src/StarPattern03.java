package patterns;

public class StarPattern03 {
	public static void main(String[] args) {
		int lines = 5;
		int starCount = 1;
		int spaceCount = lines - 1;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= spaceCount; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= starCount; j++) {
				System.out.print("*");
			}
			System.out.println();

			spaceCount--;
			starCount++;

		}
	}
}

/*

    *
   **
  ***
 ****
*****

*/