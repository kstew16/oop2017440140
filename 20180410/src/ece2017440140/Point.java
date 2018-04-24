package ece2017440140;

public class Point {
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double xx) {
		this.x = xx;
		xx = 100;
	}
	
    public void setY(double yy) {
		this.y = yy;
	}
    
    public void print() {
		System.out.println("("+this.getX()+","+this.getY()+")");
		System.out.println("("+getX()+","+getY()+")");
		System.out.println("("+this.x+","+this.y+")");
    }
	
	public double distance() {
		//반환할 결과값 선언
		 //지역변수의 유효범위는 메소드 내부
			return Math.sqrt(x*x+y*y);
		//거리 계산
	}
	public double distance(Point p) {
		return Math.sqrt((this.x-p.getX())*(this.x-p.getX())+(this.y-p.getY())*(this.y-p.getY()));
		
	}
	//같은 이름의 메소드를 매개변수에 따라서 가능
	
	public Point move(Point p) { //매개 변수 p의 유효범위는 메소드 내부
	
		//temp 변수 선언
		double a;
	    double b;
	    //포인트 p 만큼 이동
		a = this.x + p.x; //x는 필드 변수 라고 this를 사용해서 강조 the filed of this object x
		b = this.y + p.y;	
		//새로운 포인트 생성
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;	
		//새로운 포인트 반환
		return pnt;
	}
	public String toString() {
		return ("("+this.x+","+this.y+")");
	}
}
