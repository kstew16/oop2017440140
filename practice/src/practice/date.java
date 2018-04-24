package practice;

public class date {
	private int year;
	private String month;
	private int day;
	
	public void setdate(int year, String month, int day) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public date() {
		year = 2017;
		month = "1¿ù";
		day = 30;
	}
	
	public date(int year, String month, int day) {
		setdate(year, month, day);
	}
	
	public date(int year) {
		setdate(year, "4¿ù", 3);
	}
	

	}
	


