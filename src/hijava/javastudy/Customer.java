package hijava.javastudy;

public class Customer {
	private String id;
	private String name;
	private int amount;
	private float rate;
	private float point = 0;
	
	public Customer() {
		this.rate = (float) 0.02;
	}
	
	public Customer(String id, String name, int amount) {
		this();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}
	
	public int buy(int price) {
		int deposit = amount - price;
		if(deposit > 0) {
			this.amount -= price;
			this.point = price * rate;
			return amount;			
		} else {
			return -1;
		}
	}
	
	public String toString() {
		return this.name + "님의 잔액은" + this.amount + "이며," + this.point + "를 모았습니다";
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}

}
