package patterns;

public class StarPattern02 {
	public static void main(String[] args) {
		int lines = 5;
		int starCount = 5;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= starCount; j++) {
				System.out.print("*");
			}

			System.out.println();

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