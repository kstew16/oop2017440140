package tew;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal aDog = new Dog("Ƽ��");
		Animal aCat = new Cat ("�ǰ�");
		aDog.sing();
		((Dog)aDog).playFetch();
		//((Dog)aCat).playFetch();�̰� Animal�� �ٿ�ĳ���������� ������������ ���� �ȿ� �ִ� ��ü�� �𸣰ŵ�
		aCat.sing();
		
		
		
	}
}
