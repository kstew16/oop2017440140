import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Animal aaa = new Animal();//상태도 문제
//		aaa.Sing();//출력문장 문제
//		Dog tina = new Dog();//상태도 문제
//		tina.Sing();//출력문장 문제
//		tina = new Dog();//상태도 문제
//		tina.eat();
////error	aaa.eat(); Animal에는 eat 구현 x
		//우변 클라스가 좌변 클라스의 subclass이면 전혀 문제가 없다. 좌변<--우변
		//*Upcasting*
		//Animal aaa = new Dog(); //묵시적 type casting
		Animal aaa = (Animal) new Dog(); // 명시적 type casting
		//overriding한 메소드를 호출하면 subclass의 메소드를 수행한다.
		aaa.Sing(); //다형성 Poly-morphism
		aaa = new Cat();
		aaa.Sing();//다형성
		//다형성 polymorphism
		//1. 하나의 클라스로부터 여러 서브클라스를 만들 경우
		//2. 모든 서브클라스는 수퍼클라스의 메소드를 override한다.
		//3. SuperClass SuperRefVar = new SubClass();
		//4. superRefVar.overridedMethod()-> 객체의 클라스가 구현한 메소드를 실행한다. 
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if (str.equals("dog")) aaa = new Dog(); //runtime 때 결정
		else aaa = new Cat();
		aaa.Sing();//동적 바인딩(Dynamic Binding): 프로그램 수행 시 호출할 메소드를 결정한다.
		//추상클라스는 객체를 만들 수 없다 aaa = new Animal();
		
		
		int a;
		a = (int) 3.1; //형변환(type casting)

	}

}
