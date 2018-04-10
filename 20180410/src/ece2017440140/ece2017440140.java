package ece2017440140;

public class ece2017440140 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//==은 주소값이 같은것까지 봄
		// .equals를 사용해야 내용이 같은 지 알 수 있음.
		
		Point pnt = new Point();
		pnt.setX(1.0); pnt.setY(1.0);
		pnt.print();
		System.out.println(pnt);//string형으로 바꿔줌
		String str =pnt.toString();
		System.out.println(str);//메쏘드쪽보면 괄호만 쳐도 스트링으로 바까버림
	}
	

}
