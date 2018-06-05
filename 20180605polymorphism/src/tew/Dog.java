package tew;

public class Dog extends Animal {
	Dog(String name){
		super(name);
	}
	@Override
	void sing() {
		System.out.println(this.name + " ¸Û¹¶");
	}
	
	void playFetch() {
		System.out.println(this.name + " ¸·´ë±â´øÁö°í³î±â");
		
	}
}
