package patterns;

public class StarPattern13 {
	public static void main(String[] args) {
		int lines = 7;
		int spaceCount = lines - 1;
		int starCount = 1;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= spaceCount; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= starCount; j++) {
				if (j == 1 || j == starCount || i == lines)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();

			spaceCount--;
			starCount = starCount + 2;
		}
	}
}

//	     *
//	    * *
//	   *   *
//	  *     *
//	 *	     *
//  ***********