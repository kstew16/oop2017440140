package ece2017440140;
import java.util.Scanner;
public class Helloworld {
	
	/**it is not a well made class*/
	public static void main(String[] args) {
		System.out.println("OH Hell World!");
		System.out.println("I'm Tiamoh");
		Scanner input = new Scanner(System.in);
		int a=20;
		int b=10;
		int c;
		System.out.println("첫 번째 숫자?");
		a=input.nextInt();
		System.out.println("두 번째 숫자?");
		b=input.nextInt();
		c=a+b;
		System.out.print("두 수를 더하면 ");
		System.out.println(c);
		return;
	}

}
