package patterns;

public class StarPattern18 {

	public static void main(String[] args) {
		int lines = 7;
		int starCount = lines;
		int mid = (lines + 1) / 2;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= starCount; j++) {
				if (i == mid || j == mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

//	      *       
//	      *       
//	      *       
//	* * * * * * * 
//	      *       
//	      *       
//	      *  