package lsj1;

public class Test {

	public static void main(String[] args) {
		Dog tina = new Dog();
		tina.name = "Tina";
//		tina.IDN = "30942394"; Error IDN is a private field
		tina.nickName = "2002";
		System.out.println(tina.nickName);
		tina.publicField = "U2";
//error		tina.privateField = "Sting";
		tina.packageField = "Ed"; //package�� �� �ȿ��� public�� ����
		tina.protectedField = "Beatles";
		tina.print();


		

	}

}
