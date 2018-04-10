package ece2017440140;

public class ece2017440140 {
	/*primitive type은 byte,int,long,float,double,char등을 말합니다.

int a ; //int 타입 a 선언

a = 4; //a 에다가 4를 대입.....이경우에는....a 에 4가 저장이 됩니다.



reference type은 class, object, array등을 말하는 데요..

object 타입의 대표적인 예는......


String 이있습니다.....


String b ; //String 타입 b 선언

b = "aaaa"; //b 에 aaaa문자열 대입.

//이경우 b에는........aaaa가 저장되어 있는 주소가 저장됩니다.






그런데......System.out.println(b); 를 하면.....주소가 안나오고
aaaa란 문자열이 출력 됩니다......그것은 println메소드와 관련이 있는데요..

문자열을 출력하는 경우가 많기 때문에....println()메소드에서 문자열하나의 번지수가
입력되는 객체를 입력 받았을때는 그 문자열을 출력 하도록 처리를 해주는 것입니다.*/
	/*primitive type 에 boxing new Double(double형 변수) 이렇게 하면 reference 형 변수처럼 쓸 수 이따*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//==은 주소값이 같은것까지 봄
		// .equals를 사용해야 내용이 같은 지 알 수 있음.
		Double db;
		Point pnt = new Point();
		pnt.setX(-2.0); pnt.setY(-8.0);
		Point pnt2 = new Point();
		pnt.print();
		pnt2.setX(3.0); pnt2.setY(4.0);
		System.out.println(pnt);//string형으로 바꿔줌
		String str =pnt.toString();
		System.out.println(str);//메쏘드쪽보면 괄호만 쳐도 스트링으로 바까버림
		db=pnt2.distance();
		System.out.println(pnt2.distance());
		System.out.println(pnt2.distance(pnt));//매개변수만 다르면 같은 이름의 메소드를 다르게 사용 가능 이것을 메소드 오버로딩이라 칭한다.
		
	}
	

}
