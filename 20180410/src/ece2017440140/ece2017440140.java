package ece2017440140;

public class ece2017440140 {
	/*primitive type�� byte,int,long,float,double,char���� ���մϴ�.

int a ; //int Ÿ�� a ����

a = 4; //a ���ٰ� 4�� ����.....�̰�쿡��....a �� 4�� ������ �˴ϴ�.



reference type�� class, object, array���� ���ϴ� ����..

object Ÿ���� ��ǥ���� ����......


String ���ֽ��ϴ�.....


String b ; //String Ÿ�� b ����

b = "aaaa"; //b �� aaaa���ڿ� ����.

//�̰�� b����........aaaa�� ����Ǿ� �ִ� �ּҰ� ����˴ϴ�.






�׷���......System.out.println(b); �� �ϸ�.....�ּҰ� �ȳ�����
aaaa�� ���ڿ��� ��� �˴ϴ�......�װ��� println�޼ҵ�� ������ �ִµ���..

���ڿ��� ����ϴ� ��찡 ���� ������....println()�޼ҵ忡�� ���ڿ��ϳ��� ��������
�ԷµǴ� ��ü�� �Է� �޾������� �� ���ڿ��� ��� �ϵ��� ó���� ���ִ� ���Դϴ�.*/
	/*primitive type �� boxing new Double(double�� ����) �̷��� �ϸ� reference �� ����ó�� �� �� �̵�*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//==�� �ּҰ��� �����ͱ��� ��
		// .equals�� ����ؾ� ������ ���� �� �� �� ����.
		Double db;
		Point pnt = new Point();
		pnt.setX(-2.0); pnt.setY(-8.0);
		Point pnt2 = new Point();
		pnt.print();
		pnt2.setX(3.0); pnt2.setY(4.0);
		System.out.println(pnt);//string������ �ٲ���
		String str =pnt.toString();
		System.out.println(str);//�޽���ʺ��� ��ȣ�� �ĵ� ��Ʈ������ �ٱ����
		db=pnt2.distance();
		System.out.println(pnt2.distance());
		System.out.println(pnt2.distance(pnt));//�Ű������� �ٸ��� ���� �̸��� �޼ҵ带 �ٸ��� ��� ���� �̰��� �޼ҵ� �����ε��̶� Ī�Ѵ�.
		
	}
	

}
