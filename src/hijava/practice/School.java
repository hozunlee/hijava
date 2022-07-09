package hijava.practice;

public class School {

	public static void main(String[] args) {
		Student kim = new Student();
		kim.setName("익주");
		kim.setAddr("인천");
		kim.setEmail("narimo@gmail.com");
		kim.setSid(02);
		kim.setTel("없어요");
		kim.age = 23;
		
		
		Student lee = new Student(01, "요한", "안산", "email", "0202");
		
		Student park = new Student("유리");
		
		System.out.println(kim.age);
		System.out.println(kim);
		System.out.println(lee);
	}

}
