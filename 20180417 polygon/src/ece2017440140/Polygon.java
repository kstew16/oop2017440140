package ece2017440140;

public abstract class Polygon {//추상 클래스는 객체 못 만듦
	public double height;
	public double width;
	public abstract double area();//추상메소드는 바디는 없지만 이 클라스를 상속받는 놈들은 이 메소드를 구현해야함.
	//이거 구현 안하면 이거 상속받은 놈들도 추상클래스가 되어서 객체 생성을 못 함.
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
