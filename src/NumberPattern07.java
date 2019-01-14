package patterns;

public class NumberPattern07 {

	public static void main(String[] args) {

		int lines = 3;
		int num = 1;
		int numCount = 3;
		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= numCount; j++) {
				System.out.print(num);
			}
			System.out.println();
			num++;
		}
	}

}

// 111
// 222
// 333
