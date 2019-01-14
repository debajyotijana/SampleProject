package patterns;

public class NumberPattern02 {

	public static void main(String[] args) {
		int lines = 5;
		int numCount = 1;
		int num = 1;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= numCount; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
			num = 1;
			numCount++;
		}
	}
}

//	1 
//	1 2 
//	1 2 3 
//	1 2 3 4 
//	1 2 3 4 5 
