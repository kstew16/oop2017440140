package ece2017440140;

public class Car {
	private String color;
	private int speed;
	static int numberofCars=0; 
	//근데 프로그래밍을 하다 보니까 객체 내에서 항상 동일한 field도 필요함 그럼 그 변수를 위한 공간 하나만 만들어서 공유하면 되겠다!!
	//공간을 공유하면 콘스트럭터에다가 뭐 더해서 몇 개의 객체가 있는지 등등도 파악할 수 있고 뭐 무궁무진하다.
	//근데 왜 static이냐고?
	
	//이게 귀찮아서 생성자라는 메쏘드를 만들었졍 (Constructor)
	//자세한 건 아래를 봐ㅓ 메소드며이 클라스 이름과 같다.
	// 반환형은 없다.
	
	//methods
	public static void print() {
		//System.out.println(this.color +","+ this.speed); 에러남
		// 정적 메소드는 객체에 접근할 수 없음 정적 메소드에서는 정적 변수만 써야 합니다.
		System.out.println(numberofCars);//System클라스 안에 out정적변수- (정적변수는 객체라고 합니다.)에 대해서 println메소드가 호출.
	}
	Car(String color, int speed){
		this.color=color;//앞에게 private쪽 field color 뒤에게 매개 color
		this.speed=speed;
		numberofCars++;
	}//생성자 썼으면 테스트쪽 클라스에서 이니셜 선언을 해줘야 함. 생성자 없으면 Car(); 빈칸이어도 에러 안 남. 원래 자바가 해 줘. 
	public Car() {
		//만약 생성자를 정의하지 않으면 매개변수 없는 생성자를 자바에서 자동으로 생성해 준다. 하지만 생성자를 하나라도 정의하면 자바는 아무 일도 하지 않는다.
	this.color = "White";
	this.speed = 60;
	numberofCars++;
	}//요거 붙이면 방금 말한 생성자 오류가 없어짐. WHy?!!?!?!?!@? Car method를 만든 거니까...
	//안에다 저렇게 this 하면 초기화 여기서도 되네
	public Car(String c) {
		this(c,0);
		//요렇게 스트링만 입력받으면 다른 하나는 초기화하게로 설정할 수도 있어.
		numberofCars++;
	}
	public String toString() {
		return ("Color is "+ this.color + "\nSpeed is " + this.speed);
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}


}
