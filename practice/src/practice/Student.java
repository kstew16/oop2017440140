package practice;

public class Student extends Human {
	String major;
	
	public Student(String n, int a, String m) {
		major = m;
//		name = n;
//		age = a;
	}
	public String toString() {
		return(name+age+major);
	}
	public void setMajor(String m) {
		major = m;
	}
public String getMajor() {
	return major;
}
	

}
