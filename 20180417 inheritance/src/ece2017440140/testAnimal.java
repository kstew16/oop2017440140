package ece2017440140;

public class testAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal("���˹�");
		Snail snail =  new Snail("�����");
		Cat cat = new Cat ("���");
		animal.sing();
		
		//�ٸ� �� �� Animal�̶� ������ ��� �Ҹ��� �ٸ� new class�� ����� �ʹ�.
		//class �������� superclass �����ϸ� �ֺ� ������ ������ �� ����.
		snail.sing();
		cat.sing();
	}

}
