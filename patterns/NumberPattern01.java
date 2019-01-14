package patterns;

public class NumberPattern01
{

	public static void main(String[] args) {
		int lines = 7;
		int numCount = 1;
		int num = 1;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= numCount; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
			numCount++;
		}
	}
}

//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10 
//	11 12 13 14 15 
//	16 17 18 19 20 21 
//	22 23 24 25 26 27 28 