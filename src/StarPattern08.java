package patterns;

public class StarPattern08 {

	public static void main(String[] args) {
		int lines = 9;
		int mid = (lines + 1) / 2;
		int starCount = 1;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= starCount; j++) {
				System.out.print("*");
			}

			System.out.println();

			if (i < mid) {
				starCount++;
			} else {
				starCount--;
			}
		}

	}
}

/*

*
**
***
****
*****
****
***
**
*

*/
