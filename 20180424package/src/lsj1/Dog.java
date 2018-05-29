package lsj1; //private은 상속 못받음

public class Dog extends Animal {
	public String name;
	private String IDN;
	String nickName;//package 접근지정: 패키지 내에서만 public
	public void print() {
		System.out.println(publicField);
		//error System.out.println(privateField);
		System.out.println(packageField);
		System.out.println(protectedField);
	}

}
