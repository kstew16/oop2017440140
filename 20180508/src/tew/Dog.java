package tew;

public class Dog extends Animal implements Playable {
	@Override
	void sing() {
		System.out.println("�۸��ϰ� �����ȴ�.");
		
	}
	void eat() {
		System.out.println("�۸�¬¬�ķ籸�ķ�");
		
	}
	@Override
	public void walk() {
		System.out.println("�۸��̶� �ų��� �ɾ��!");
		
	}

}
