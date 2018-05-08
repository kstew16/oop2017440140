package practice;

public class ChildClass extends ParentClass {

	
		
		int data = 200;
		public void print() {
			super.print();
			System.out.println("서브클래스의 print()메소드");
			System.out.println(this.data);
			System.out.println(super.data);
		}
		public static void main(String[] args) {
			ChildClass c1 = new ChildClass();
			c1.print();

	}

}
