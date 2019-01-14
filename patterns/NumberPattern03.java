package patterns;

public class NumberPattern03 {
	public static void main(String[] args) {
		int lines = 5;
		int numCount = 1;
		int num = 5;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= numCount; j++) {
				System.out.print(num + " ");
				num--;
			}
			System.out.println();
			num = 5;
			numCount++;
		}
	}
}

//	5 
//	5 4 
//	5 4 3 
//	5 4 3 2 
//	5 4 3 2 1 