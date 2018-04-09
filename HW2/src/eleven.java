import java.util.Scanner;

public class eleven {

	public static void main(String[] args) {
		// 위의 문제를 0을 입력하기 전까지는 계속 수행(인수 출력)하도록 수정하시오.
		System.out.println("11번 문제");
		int a=1;
		while (a!=0) {
			System.out.println("정수를 입력하세요: ");
		 
		   Scanner input = new Scanner(System.in);
		   a = input.nextInt();
		
		for(int n=2;n<a;n++) {
			if (a%n==0)
				System.out.println(n);}}
			
				System.out.println("=========프로그램종료========");
		
			
		}

	}


