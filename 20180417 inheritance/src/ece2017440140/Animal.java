package ece2017440140;

public class Animal {
	//field
	public String name;//name �ٸ� ��ü���� ��� ��
	//constructor
	public Animal(String name) {
		this.name = name;
	}
	//methods
	public void sing() {
		System.out.println(name + " sing");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
