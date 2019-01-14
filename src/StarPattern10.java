package patterns;

public class StarPattern10 {

	public static void main(String[] args) {

		int lines = 9;
		int mid = (lines + 1) / 2;
		int spaceCount = 0;
		int StarCount = 9;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= spaceCount; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= StarCount; j++) {
				System.out.print("*");
			}
			System.out.println();

			if (i < mid) {
				StarCount = StarCount - 2;
				spaceCount++;
			} else {
				StarCount = StarCount + 2;
				spaceCount--;
			}
		}

	}

}

/*

*******
 *****
  ***
   *
  ***
 *****
*******

*/