package hijava.practice;

public class Factory {

	public static void main(String[] args) {
		System.out.println("result2=" + factorial(5));
	}
private static int factorial(int num) {
		System.out.println("factorial("+num+")");
			
		if (num <= 1) return 1;
		
		return num * factorial(num -1);
	}
}
