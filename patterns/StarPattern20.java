package patterns;

public class StarPattern20 {

	public static void main(String[] args) {

		int lines = 4;
		int starCount = 1;
		int spaceCount = lines - 1;
		int colMid = (starCount + 1) / 2;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= spaceCount; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= starCount; j++) {

				if (j == 1 || j != colMid)
					System.out.print("* ");
				else
					System.out.print("  ");

				// if (j == 1 || j == starCount || (i == lines && j != colMid))
				// System.out.print("* ");
				// else
				// System.out.print(" ");

				// if (i == 1)
				// System.out.print("* ");
				// else if (i != 1 && j != colMid)
				// System.out.print("* ");
				// else
				// System.out.print(" ");
			}
			System.out.println();
			spaceCount = spaceCount - 1;
			starCount = starCount + 2;
			colMid = (starCount + 1) / 2;
		}
	}

}
