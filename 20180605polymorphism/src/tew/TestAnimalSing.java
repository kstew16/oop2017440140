package tew;

public class TestAnimalSing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalSing as = new AnimalSing();
		as.add(new Dog ("�ݵ�"));
		as.add(new Dog ("�鱸"));
		as.add(new Dog ("���"));
		as.add(new Dog ("��Ʈ"));
		as.add(new Cat("���"));
		as.add(new Cat("���"));
		as.add(new Cat("ġġ"));
		as.add(new Cat("���"));
		
		as.sing();

	}

}
