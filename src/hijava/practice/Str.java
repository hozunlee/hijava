package hijava.practice;

public class Str {
	public static void main(String[] args) {
		substrTest();
	}
	
	private static void substrTest() {
		String s = "010-9999-9999";
		String s1 = s.substring(0, s.length() -4);
		
		System.out.println(s1 + "****");
	}



}
