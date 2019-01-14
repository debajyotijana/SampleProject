package patterns;

public class NumberPattern06temp {

	public static void main(String[] args) {
		int lines = 5;
		int numCount = 1;
		int num = 1;
		int spaceCount = lines - 1;
		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= spaceCount; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= numCount; j++) {
				System.out.print(num + " ");
				if (j == ((numCount + 1) / 2))
					num = 1;
				else
					num++;
			}
			System.out.println();
			spaceCount--;
			num = 1;
			numCount = numCount + 2;

		}
	}
}