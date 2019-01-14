package patterns;

public class AlphaPattern01 {

	public static void main(String[] args) throws InterruptedException {

		int lines = 5;
		int alphaCount = 1;
		int asciiValue = 65;

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= alphaCount; j++) {
				{
					char ch1 = (char) asciiValue;
					System.out.print(ch1 + " ");
				}

			}
			System.out.println();
			asciiValue++;
			alphaCount++;
		}
	}
}

//	A 
//	B B 
//	C C C 
//	D D D D 
//	E E E E E 