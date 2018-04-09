import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		
		   System.out.println("6번 문제");
		   
		   int a, b, c;
		   Scanner input = new Scanner(System.in);
			System.out.println("두 자리 정수를 입력하시오: ");
			a = input.nextInt();
			c = a % 10;
			b = a-c;
			System.out.println(10*c + b/10);
			
			System.out.println("=======프로그램 종료=====");
			input.close();
		   
		   
	}

}
