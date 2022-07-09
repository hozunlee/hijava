package hijava.practice;

public class FIbo {

	public static void main(String[] args) {

		int number = 10;

		for (int i = 0; i <= number; i += 1) {
			System.out.print(fibo(i) + " ");
		}

	}

	private static int fibo(int num) {

//		if (num <= 1)
//			return num;

		if (num > 1) {
			return fibo(num - 1) + fibo(num - 2);
		} else
			return num;
	}

}
