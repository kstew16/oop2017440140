package tew;

public class Dog extends Animal {
	public Dog() {//디폴트 생성자
		super();//나여깄소!!!! 이거 없어도 잘 됨.
		System.out.println("Dog 디폴트 생성자");
		
	}//생성자 둘 다 되네 윗쪽줄에서 애니멀 생성자가 돌아간
	public Dog(int a) {
		super(a);
		System.out.println("Dog 정수형 생성자");
	}
}
