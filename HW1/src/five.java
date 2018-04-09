import java.util.Scanner;

public class five {

	public static void main(String[] args) {	
	    System.out.println("5번 문제");
	    String name;
	 
		
	    System.out.println("choose one of the following.");
	    
		System.out.println("apple");
		
		System.out.println("orange");
		
		System.out.println("banana");
		
		System.out.println("peach");
		
		
		System.out.print("enter your choice here : ");
		Scanner input = new Scanner(System.in);
		String a1 = input.next();
		
		System.out.println("Your choice is " + a1 );
		
		System.out.println("=======프로그램 종료=====");
		input.close();

		
	}

}
