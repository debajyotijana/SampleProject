package patterns;

public class StarPattern15 {
	public static void main(String[] args) {
		int lines = 7;
		int starCount = lines;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= starCount; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

//	* * * * * * * 
//	* * * * * * * 
//	* * * * * * * 
//	* * * * * * * 
//	* * * * * * * 
//	* * * * * * * 
//	* * * * * * * 
