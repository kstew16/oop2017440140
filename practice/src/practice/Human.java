package practice;

public class Human {
	String name;
	int age;
	public Human(String n, int a) {
		name = n;
		age = a;
	}
	public String toString() {
		return (name+","+age);
	}
public void setName(String n) {
	name = n;
}
public void setName(int a) {
	age = a;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}

}
