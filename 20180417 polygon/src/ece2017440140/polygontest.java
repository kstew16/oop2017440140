package ece2017440140;

public class polygontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri = new Triangle();
		Rectangle rec = new Rectangle();
		tri.height = 2.0;
		tri.width = 3.0;
		rec.height =2.0;
		rec.width = 2.0;
		System.out.println("�簢�� ����"+rec.height+"�簢�� �غ�"+rec.width+"�� �簢�� ���̴� "+rec.area());
		System.out.println("�ﰢ�� ����"+tri.height+"�ﰢ�� �غ�"+tri.width+"�� �ﰢ�� ���̴� "+tri.area());
	}

}
