package tew;

public class Cat extends Animal implements Playable {
	@Override
	void sing() {
		System.out.println("�߿��ϰ� �����ȴ�.");
		
	}
	void eat() {
		System.out.println("�ɳ�¬¬�ķ籸�ķ�");
		
	}
	@Override
	public void walk() {
		System.out.println("�߿��̶� ��ӻ�� �ɾ��!");
		
	}
}
