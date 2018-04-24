package ece2017440140;

public class testAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal("도옹물");
		Snail snail =  new Snail("희망이");
		Cat cat = new Cat ("모모");
		animal.sing();
		
		//다른 건 다 Animal이랑 같은데 우는 소리만 다른 new class를 만들고 싶다.
		//class 생성에서 superclass 지정하면 애비가 누군지 설정할 수 잇음.
		snail.sing();
		cat.sing();
	}

}
