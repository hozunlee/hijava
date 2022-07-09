package hijava.practice;

public class Man {
	public static final int COFFEE = 3000;
	public static final int DONUT = 2500;

	
	private String name;
	private int deposit; // 잔액
	
	public Man () {
		this.deposit = 10000;
	};
	
	public Man (String name) {
		this(); // 나의 함수를 부르는 this(); 생성자 함수
		this.name =name;
	};
	
	
	public void buyCoffee(int count) {
//		this.deposit = this.deposit - 3000 * count;
//		this.deposit -= COFFEE * count;
		this.result(COFFEE, count);
		
	}
	
	public void buyDonut(int count) {
//		this.deposit = this.deposit - 3000 * count;
//		this.deposit -= DONUT * count;
		this.result(DONUT, count);
		
	}
	
	private void result(int item, int count) {
		this.deposit -= item * count;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	
	public String toString() {
		return this.name + "님의 잔액은" + this.deposit + "원 입니다. 축하";
	}
	
	public static void main(String[] args) {
		Man hong = new Man("Hong");
		Man lee = new Man("Lee");
		
		hong.buyCoffee(3);
		lee.buyDonut(2);
		System.out.println(lee);
		System.out.println(hong);
	}
	
}
