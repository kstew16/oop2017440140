package practice;

public class ChildClass extends ParentClass {

	
		
		int data = 200;
		public void print() {
			super.print();
			System.out.println("����Ŭ������ print()�޼ҵ�");
			System.out.println(this.data);
			System.out.println(super.data);
		}
		public static void main(String[] args) {
			ChildClass c1 = new ChildClass();
			c1.print();

	}

}
