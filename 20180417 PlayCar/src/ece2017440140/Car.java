package ece2017440140;

public class Car {
	private String color;
	private int speed;
	static int numberofCars=0; 
	//�ٵ� ���α׷����� �ϴ� ���ϱ� ��ü ������ �׻� ������ field�� �ʿ��� �׷� �� ������ ���� ���� �ϳ��� ���� �����ϸ� �ǰڴ�!!
	//������ �����ϸ� �ܽ�Ʈ���Ϳ��ٰ� �� ���ؼ� �� ���� ��ü�� �ִ��� �� �ľ��� �� �ְ� �� ���ù����ϴ�.
	//�ٵ� �� static�̳İ�?
	
	//�̰� �����Ƽ� �����ڶ�� �޽�带 ������� (Constructor)
	//�ڼ��� �� �Ʒ��� ���� �޼ҵ���� Ŭ�� �̸��� ����.
	// ��ȯ���� ����.
	
	//methods
	public static void print() {
		//System.out.println(this.color +","+ this.speed); ������
		// ���� �޼ҵ�� ��ü�� ������ �� ���� ���� �޼ҵ忡���� ���� ������ ��� �մϴ�.
		System.out.println(numberofCars);//SystemŬ�� �ȿ� out��������- (���������� ��ü��� �մϴ�.)�� ���ؼ� println�޼ҵ尡 ȣ��.
	}
	Car(String color, int speed){
		this.color=color;//�տ��� private�� field color �ڿ��� �Ű� color
		this.speed=speed;
		numberofCars++;
	}//������ ������ �׽�Ʈ�� Ŭ�󽺿��� �̴ϼ� ������ ����� ��. ������ ������ Car(); ��ĭ�̾ ���� �� ��. ���� �ڹٰ� �� ��. 
	public Car() {
		//���� �����ڸ� �������� ������ �Ű����� ���� �����ڸ� �ڹٿ��� �ڵ����� ������ �ش�. ������ �����ڸ� �ϳ��� �����ϸ� �ڹٴ� �ƹ� �ϵ� ���� �ʴ´�.
	this.color = "White";
	this.speed = 60;
	numberofCars++;
	}//��� ���̸� ��� ���� ������ ������ ������. WHy?!!?!?!?!@? Car method�� ���� �Ŵϱ�...
	//�ȿ��� ������ this �ϸ� �ʱ�ȭ ���⼭�� �ǳ�
	public Car(String c) {
		this(c,0);
		//�䷸�� ��Ʈ���� �Է¹����� �ٸ� �ϳ��� �ʱ�ȭ�ϰԷ� ������ ���� �־�.
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
