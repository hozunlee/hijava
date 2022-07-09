package hijava.javastudy;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer kim = new Customer("kim", "HJ", 30000);
		kim.buy(3000);
		
		System.out.println(kim.getAmount());
		System.out.println(kim.getPoint());
	
		System.out.println(kim);
	}
}
