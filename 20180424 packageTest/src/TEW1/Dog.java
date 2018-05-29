package TEW1;

public class Dog extends Animal {
	public String name;
	private String IDN;
	String nickname; // package 접근지정 : 패키지 내에서만 퍼블릭
	void print() {
		//System.out.println(privateField);
		System.out.println(publicField);
		System.out.println(packageField);
		System.out.println(protectedField);
		//super. 뭐뭐뭐 하면 field나 클래스도 호출 가능 삐루루루루루룰
	}
}
