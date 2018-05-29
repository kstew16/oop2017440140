
public class Dog extends Animal implements Playable{
	@Override
	void Sing() {
		System.out.println("A Dog barks");
	}
	void eat() {
		System.out.println("A dog eats");
	}
	@Override
	public void walk() {
		System.out.println("walk with a dog");
	}
	@Override
	public void fetch() {
			System.out.println("fetch with a dog");
	}

}
