package examaple;

public class DeskLamp {
	//필드
	private boolean isOn;
	
	//메소드
	public void turnOn() {
		this.isOn=true;
	}
	public void turnOff() {
		this.isOn=false;
	}
	public String toString(){
		if(isOn) {
			return "켜진 램프임";
			}
		else {
			return "꺼진 램프임";
			}
		
		
	}
}
