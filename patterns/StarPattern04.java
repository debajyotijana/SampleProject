package patterns;

public class StarPattern04 {
	public static void main(String[] args) {
		int lines = 5;
		int spaceCount = 0;
		int starCount = 5;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= spaceCount; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= starCount; j++) {
				System.out.print("*");
			}
			System.out.println();

			spaceCount++;
			starCount--;
		}
	}
}

/*

*****
 ****
  ***
   **
    *

*/