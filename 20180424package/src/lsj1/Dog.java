package lsj1; //private�� ��� ������

public class Dog extends Animal {
	public String name;
	private String IDN;
	String nickName;//package ��������: ��Ű�� �������� public
	public void print() {
		System.out.println(publicField);
		//error System.out.println(privateField);
		System.out.println(packageField);
		System.out.println(protectedField);
	}

}
