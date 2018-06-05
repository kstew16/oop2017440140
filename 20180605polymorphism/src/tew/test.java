package tew;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal aDog = new Dog("티나");
		Animal aCat = new Cat ("건공");
		aDog.sing();
		((Dog)aDog).playFetch();
		//((Dog)aCat).playFetch();이건 Animal을 다운캐스팅했을뿐 참조변수형만 알지 안에 있는 객체는 모르거든
		aCat.sing();
		
		
		
	}
}
