package tew;

public class Cat extends Animal implements Playable {
	@Override
	void sing() {
		System.out.println("야옹하고 울어버렸다.");
		
	}
	void eat() {
		System.out.println("냥냥짭짭후루구후룩");
		
	}
	@Override
	public void walk() {
		System.out.println("야옹이랑 사뿐사뿐 걸어요!");
		
	}
}
