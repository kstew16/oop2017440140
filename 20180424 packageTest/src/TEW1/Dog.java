package TEW1;

public class Dog extends Animal {
	public String name;
	private String IDN;
	String nickname; // package �������� : ��Ű�� �������� �ۺ�
	void print() {
		//System.out.println(privateField);
		System.out.println(publicField);
		System.out.println(packageField);
		System.out.println(protectedField);
		//super. ������ �ϸ� field�� Ŭ������ ȣ�� ���� �߷������
	}
}
