package ece2017440140;

public abstract class Polygon {//�߻� Ŭ������ ��ü �� ����
	public double height;
	public double width;
	public abstract double area();//�߻�޼ҵ�� �ٵ�� ������ �� Ŭ�󽺸� ��ӹ޴� ����� �� �޼ҵ带 �����ؾ���.
	//�̰� ���� ���ϸ� �̰� ��ӹ��� ��鵵 �߻�Ŭ������ �Ǿ ��ü ������ �� ��.
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
