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
		System.out.println("사각형 높이"+rec.height+"사각형 밑변"+rec.width+"인 사각형 넓이는 "+rec.area());
		System.out.println("삼각형 높이"+tri.height+"삼각형 밑변"+tri.width+"인 삼각형 넓이는 "+tri.area());
	}

}
