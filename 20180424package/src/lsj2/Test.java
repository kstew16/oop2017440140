package lsj2;

import lsj1.*;

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lilly";
		//aBasil.age = 2; Error age is a private field
		
		//타 패키지의 클라스를 사용하려면 
		//1. 패키지명.클라스명
		//lsj1.Dog aDog = new lsj1.Dog();
		//2. import 명령어를 사용
		Dog aDog = new Dog();
		aDog.name = "Happy";
//		aDog.print();
		//error aDog.IDN = "23232"; Error private임
		//error aDog.nickName = "kk"; nickName은 패키지 접근지정
		Animal aa = new Animal();
//error		aa.protectedField = "ddd";
		
		Rosemary rr = new Rosemary();
		

	}

}
