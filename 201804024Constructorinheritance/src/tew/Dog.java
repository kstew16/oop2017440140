package tew;

public class Dog extends Animal {
	public Dog() {//����Ʈ ������
		super();//��������!!!! �̰� ��� �� ��.
		System.out.println("Dog ����Ʈ ������");
		
	}//������ �� �� �ǳ� �����ٿ��� �ִϸ� �����ڰ� ���ư�
	public Dog(int a) {
		super(a);
		System.out.println("Dog ������ ������");
	}
}
