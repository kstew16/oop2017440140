
package TEW1;
import TEW2.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog tina = new Dog();
		tina.print();
		tina.name = "Tina";
		//tina.IDN = "12312312"; error IDN is a private
		Basil aBasil = new Basil();
		tina.publicField = "U2";
		//tina.privateField = "Sting';"
		tina.packageField ="BIGBANG"; //��Ű�� �������� �ۺ��̳� �ٸ� ����
		tina.nickname = "tt";
		tina.publicField ="U2";
		tina.packageField = "BIGBANG";
		tina.protectedField = "Beatles";
		tina.print();
	}

}
