package patterns;

public class StarPattern11 {

	public static void main(String[] args) {
		int lines = 7;
		int midRow = (lines + 1) / 2;
		int starCount = 1;
		int spaceCount = lines - 2;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= starCount; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= spaceCount; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= starCount; j++) {
				if (!(i == midRow && j == starCount)) {
					System.out.print("*");
				}
			}
			System.out.println();

			if (i < midRow) {
				spaceCount = spaceCount - 2;
				starCount++;
			} else {
				spaceCount = spaceCount + 2;
				starCount--;
			}

		}
	}

}

//	*     *
//	**   **
//	*** ***
//	*******
//	*** ***
//	**   **
//	*     *
