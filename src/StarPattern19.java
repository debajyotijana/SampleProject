package patterns;

public class StarPattern19 {

	public static void main(String[] args) {
		int lines = 7;
		int starcount = 7;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= starcount; j++) {
				if (i == j || ((i + j) == (lines + 1)))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

//	  *           * 
//  	*       *   
//	      *   *     
//	        *       
//	      *   *     
//	    *       *   
//	  *           * 