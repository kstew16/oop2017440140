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
		aaa = new Dog();  //Dog 는 Animal의 서브 클라스이므로 Animal은 Dog의 모든 요소를 가지고 있다. 그런데  이렇게 해주면 참조변수 타입이 Animal이고 객체는 Dog인 놈이 생성되는데 그러면 Dog객체 내의 animal에 속하는 특성만 쓸 수 있음
		aaa.sing();//그래서 노래는 부를 수 있고
		//aaa.eat();// 먹지는 못함
		//우변의 클라스가 좌변의 서브클라스이면 전혀 문제가 없음 일종의 형변환 - 업캐스팅이라고 함 슈퍼클라스의 참조 변수를 보겠습니다.~
		//근데 왜 멍멍하고 울어버리냐고? 결국 Dog 객체잖아
		aaa =new Cat();
		aaa.sing();//위에 dog상태에서의 sing과 더불어 polymorphism
		//SuperClass SuperRefVar = new Subclass();
		// 다형성이란 하나의 클라스로부터 여러 서브클라스를 만들 경우 모든 서브클라스는 수퍼클라스의 메소드를 오버라이드하며, superRefVar.overridedMethod( -> 객체의 클라스가 구현한 메소드 실행)
		Scanner input = new Scanner(System.in);
		String str = input.next();
		if (str.equals("Dog")) {
			aaa =  new Dog();
		}
		else aaa = new Cat();
		aaa.sing();//프로그램 실행 중에 어떤 메소드가 실행될지가 결정됨 Dynamic binding 이라고 함
		tina.walk();
	}

}
