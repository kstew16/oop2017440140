package tew;

public class TestAnimalSing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalSing as = new AnimalSing();
		as.add(new Dog ("반디"));
		as.add(new Dog ("백구"));
		as.add(new Dog ("콩순"));
		as.add(new Dog ("민트"));
		as.add(new Cat("루루"));
		as.add(new Cat("모모"));
		as.add(new Cat("치치"));
		as.add(new Cat("라라"));
		
		as.sing();

	}

}
