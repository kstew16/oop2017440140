package tew;

public class Dog extends Animal {
	Dog(String name){
		super(name);
	}
	@Override
	void sing() {
		System.out.println(this.name + " �۹�");
	}
	
	void playFetch() {
		System.out.println(this.name + " ������������");
		
	}
}
