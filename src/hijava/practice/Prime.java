package hijava.practice;

public class Prime {
	
	public static void main(String[] args) {
		int total = 0;
	
	for(int num =2; num <= 100; num += 1) {
		boolean isPrimeNum = true;
		isPrimeNum = isPrime(num, isPrimeNum);
		
		if (isPrimeNum)
				total += num;
		else
			System.out.println(num);
}
}

	private static boolean isPrime(int num) {
		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				return false;
			}
	}
		return true;
	}
}