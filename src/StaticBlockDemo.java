package patterns;

class Demo1 {

}

public class StaticBlockDemo {
	static int k = 10;

	static {
		k = 30;
		System.out.println("K value is : " + k);
	}

	public static void main(String[] args) {
		System.out.println("Program Started");

		System.out.println("Program Ended");
	}

}
