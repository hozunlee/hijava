package hijava.practice;

public class Student {
	// 멤버변수는 기본적으로 private
	private int sid;
	private String name;
	private String addr;
	private String tel;
	private String email;
	public int age;

	// 생성자 함수는 클래스명과 동일한 이름의 함수
	
	public Student() {
		
	}
	

	public Student(int sid, String name, String addr, String tel, String email) {
		this.sid = sid;
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.email = email;
	}

	public Student(String name) {
		this.setName(name);
//		this.name = name;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = "북녘에사는" + name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		if(tel !== null || tel.length() < 4) {
			String s1 = tel.substring(0, tel.length() -4);
			return s1 + "****";
		} else {
			return tel;			
		}
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSid() {
		return sid;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", addr=" + addr + ", tel=" + tel + ", email=" + email + "]";
	}

}
