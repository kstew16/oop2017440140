import java.util.Scanner;

public class seven {

	public static void main(String[] args) {
		// 0이 입력될 때까지 계속 정수를 입력 받고, 입력된 모든 숫자들의 총합을 출력하시오.
		System.out.println("7번 문제");
		int sum;
		sum = 0;
		int a=1;
		while (a!=0) {
		System.out.println("정수를 입력하세요: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		sum = sum + a;
		}
		System.out.println("Sum= " + sum);
		System.out.println("=========프로그램종료========");
		
		
		
	}

}
