package lsj2;

import lsj1.*;

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lilly";
		//aBasil.age = 2; Error age is a private field
		
		//Ÿ ��Ű���� Ŭ�󽺸� ����Ϸ��� 
		//1. ��Ű����.Ŭ�󽺸�
		//lsj1.Dog aDog = new lsj1.Dog();
		//2. import ��ɾ ���
		Dog aDog = new Dog();
		aDog.name = "Happy";
//		aDog.print();
		//error aDog.IDN = "23232"; Error private��
		//error aDog.nickName = "kk"; nickName�� ��Ű�� ��������
		Animal aa = new Animal();
//error		aa.protectedField = "ddd";
		
		Rosemary rr = new Rosemary();
		

	}

}
