import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Animal aaa = new Animal();//���µ� ����
//		aaa.Sing();//��¹��� ����
//		Dog tina = new Dog();//���µ� ����
//		tina.Sing();//��¹��� ����
//		tina = new Dog();//���µ� ����
//		tina.eat();
////error	aaa.eat(); Animal���� eat ���� x
		//�캯 Ŭ�󽺰� �º� Ŭ���� subclass�̸� ���� ������ ����. �º�<--�캯
		//*Upcasting*
		//Animal aaa = new Dog(); //������ type casting
		Animal aaa = (Animal) new Dog(); // ����� type casting
		//overriding�� �޼ҵ带 ȣ���ϸ� subclass�� �޼ҵ带 �����Ѵ�.
		aaa.Sing(); //������ Poly-morphism
		aaa = new Cat();
		aaa.Sing();//������
		//������ polymorphism
		//1. �ϳ��� Ŭ�󽺷κ��� ���� ����Ŭ�󽺸� ���� ���
		//2. ��� ����Ŭ�󽺴� ����Ŭ���� �޼ҵ带 override�Ѵ�.
		//3. SuperClass SuperRefVar = new SubClass();
		//4. superRefVar.overridedMethod()-> ��ü�� Ŭ�󽺰� ������ �޼ҵ带 �����Ѵ�. 
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if (str.equals("dog")) aaa = new Dog(); //runtime �� ����
		else aaa = new Cat();
		aaa.Sing();//���� ���ε�(Dynamic Binding): ���α׷� ���� �� ȣ���� �޼ҵ带 �����Ѵ�.
		//�߻�Ŭ�󽺴� ��ü�� ���� �� ���� aaa = new Animal();
		
		
		int a;
		a = (int) 3.1; //����ȯ(type casting)

	}

}
