package ece2017440140;

public class TestCar {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Car myCar = new Car("Space Blue", 300); //괄호 안에 있는 건 아까 소스에서 바꾼거 이후에 설정된거. myCar는 객체를 접근하는 매개.
		System.out.println(myCar);
		System.out.println(Car.numberofCars);//클라스명.정적변수명, 객체명.정적변수명 뭐 써도 다 됨.
		Car yourCar = new Car("Hot Pink", 119);
		System.out.println(yourCar);
		System.out.println(Car.numberofCars);
		Car kittenCar = new Car();
		System.out.println(kittenCar);
		System.out.println(Car.numberofCars);
		//myCar.setColor("SpaceBlue");
		//myCar.setSpeed(140);
		
		System.out.println(Math.cos(0));//지금까지는 메소드를 쓰려면 객체 호출해야됐는데 가끔은 이렇게 cos메소드를 돌리기 위해서 객체필요없을때도 있어. 이걸 
		//static method 라고 해. 자바 전체에서 사용할 수 있는 그런 메소드인가보징. 방금전거는 뇌피셜
		//java api 들어가면 볼 수 있음
		Car.print();
	}

}
