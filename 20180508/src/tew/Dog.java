package tew;

public class Dog extends Animal implements Playable {
	@Override
	void sing() {
		System.out.println("¸Û¸ÛÇÏ°í ¿ï¾î¹ö·È´Ù.");
		
	}
	void eat() {
		System.out.println("¸Û¸ÛÂ¬Â¬ÈÄ·ç±¸ÈÄ·è");
		
	}
	@Override
	public void walk() {
		System.out.println("¸Û¸ÛÀÌ¶û ½Å³ª°Ô °É¾î¿ä!");
		
	}

}
