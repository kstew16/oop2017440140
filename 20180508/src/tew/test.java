package tew;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog tina = new Dog();
		Animal aaa = new Animal();
		aaa.sing();
		tina.sing();
		tina = new Dog();
		tina.eat();
		aaa = new Dog();  //Dog �� Animal�� ���� Ŭ���̹Ƿ� Animal�� Dog�� ��� ��Ҹ� ������ �ִ�. �׷���  �̷��� ���ָ� �������� Ÿ���� Animal�̰� ��ü�� Dog�� ���� �����Ǵµ� �׷��� Dog��ü ���� animal�� ���ϴ� Ư���� �� �� ����
		aaa.sing();//�׷��� �뷡�� �θ� �� �ְ�
		//aaa.eat();// ������ ����
		//�캯�� Ŭ�󽺰� �º��� ����Ŭ���̸� ���� ������ ���� ������ ����ȯ - ��ĳ�����̶�� �� ����Ŭ���� ���� ������ ���ڽ��ϴ�.~
		//�ٵ� �� �۸��ϰ� �������İ�? �ᱹ Dog ��ü�ݾ�
		aaa =new Cat();
		aaa.sing();//���� dog���¿����� sing�� ���Ҿ� polymorphism
		//SuperClass SuperRefVar = new Subclass();
		// �������̶� �ϳ��� Ŭ�󽺷κ��� ���� ����Ŭ�󽺸� ���� ��� ��� ����Ŭ�󽺴� ����Ŭ���� �޼ҵ带 �������̵��ϸ�, superRefVar.overridedMethod( -> ��ü�� Ŭ�󽺰� ������ �޼ҵ� ����)
		Scanner input = new Scanner(System.in);
		String str = input.next();
		if (str.equals("Dog")) {
			aaa =  new Dog();
		}
		else aaa = new Cat();
		aaa.sing();//���α׷� ���� �߿� � �޼ҵ尡 ��������� ������ Dynamic binding �̶�� ��
		tina.walk();
	}

}
