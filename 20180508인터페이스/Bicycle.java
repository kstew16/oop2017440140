
public class Bicycle implements Drivable{
	@Override
	public void brake() {
		System.out.println("브레이크를 잡다");
	}
	@Override
	public void acc() {
		System.out.println("엑셀을 구르다");
	}

}
