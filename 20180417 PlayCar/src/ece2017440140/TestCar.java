package ece2017440140;

public class TestCar {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Car myCar = new Car("Space Blue", 300); //��ȣ �ȿ� �ִ� �� �Ʊ� �ҽ����� �ٲ۰� ���Ŀ� �����Ȱ�. myCar�� ��ü�� �����ϴ� �Ű�.
		System.out.println(myCar);
		System.out.println(Car.numberofCars);//Ŭ�󽺸�.����������, ��ü��.���������� �� �ᵵ �� ��.
		Car yourCar = new Car("Hot Pink", 119);
		System.out.println(yourCar);
		System.out.println(Car.numberofCars);
		Car kittenCar = new Car();
		System.out.println(kittenCar);
		System.out.println(Car.numberofCars);
		//myCar.setColor("SpaceBlue");
		//myCar.setSpeed(140);
		
		System.out.println(Math.cos(0));//���ݱ����� �޼ҵ带 ������ ��ü ȣ���ؾߵƴµ� ������ �̷��� cos�޼ҵ带 ������ ���ؼ� ��ü�ʿ�������� �־�. �̰� 
		//static method ��� ��. �ڹ� ��ü���� ����� �� �ִ� �׷� �޼ҵ��ΰ���¡. ������Ŵ� ���Ǽ�
		//java api ���� �� �� ����
		Car.print();
	}

}
