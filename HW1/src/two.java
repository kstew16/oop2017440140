import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		System.out.println("2번 문제");
		//하나의 정수를 입력 받아 이 수가 짝수(even number)인지 홀수(odd number)인지를 출력하는 프로그램을 작성하시오.
		int a;
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		a = input.nextInt();
		
		if (a%2==0) {
			System.out.println("짝수");}
		else {
			System.out.println("홀수");
		}
		System.out.println("=======프로그램 종료=====");

	}

}
