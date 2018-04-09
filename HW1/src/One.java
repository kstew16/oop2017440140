import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		System.out.println("1번 문제");
		//1. 두수(정수)를 입력받아, 그 중 큰 수를 출력하는 프로그램을 작성
		int a, b;
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하시오: ");
		a = input.nextInt();
		System.out.print("두번째 정수를 입력하시오: ");
		b = input.nextInt();
		
		if (a>b)
			System.out.println(a);
		else
			System.out.println(b);
		System.out.println("=======프로그램 종료=====");

	}

}
