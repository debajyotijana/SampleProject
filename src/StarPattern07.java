package patterns;

public class StarPattern07 {

	public static void main(String[] args) {

		int lines = 9;
		int mid = (lines + 1) / 2;
		int spaceCount = mid - 1;
		int starCount = 1;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= spaceCount; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= starCount; j++) {
				System.out.print("*");
			}

			System.out.println();

			if (i < mid) {
				spaceCount--;
				starCount = starCount + 2;
			} else {
				spaceCount++;
				starCount = starCount - 2;
			}
		}
	}
}

/*

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/