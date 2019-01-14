package patterns;

public class NumberPattern04 {

	public static void main(String[] args) {
		int lines = 9;
		int mid = (lines + 1) / 2;
		int numcount = 1;
		int num = 1;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= numcount; j++) {
				System.out.print(num + " ");
				if (i <= mid) {
					num++;
				} else {
					num--;
				}
			}

			System.out.println();

			if (i < mid) {
				num = 1;
				numcount++;
			} else {
				num = 5;
				numcount--;
			}
		}
	}
}

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 5 4 3 2
// 5 4 3
// 5 4
// 5