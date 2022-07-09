package hijava.practice;

/**
 * 첫번째 자바 실습
 * @author hjune
 * @update say 함수 추가
 */

public class HelloJava {

	// main은 JVM 꺼 :'자바를 실행하기 위한 가상 기계(컴퓨터)
	public static void main(String[] args) {
		HelloJava.say("천재");
		System.out.println("Hello Hojun");
	};

	// say는 HelloJava 꺼
	public static void say(String msg) {
		System.out.println(msg);
	}
};

// ctrl + d 한줄 지우기
// ctrl + f11 런 하기
// ctrl + shift + F : 코드 정리 하기
// syso + 컨트롤 + space
