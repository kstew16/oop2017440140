package ljs;

public class Dog extends Animal {
	public Dog() {//����Ʈ ������ 
		// ����� ����Ŭ���� ������ ȣ�� super(); //explicitly
		System.out.println("Dog ����Ʈ������");
	}
	public Dog(int a) {
		super(a);
		System.out.println("Dog ������ ������");
	}

}
