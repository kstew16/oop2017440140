import java.util.Scanner;

public class twentyone {

	public static void main(String[] args) {
		// 사용자로부터 한 숫자를 입력받아, 입력받은 숫자 이하의 소수들의 합을 구하는 프로그램을 작성하시오.
		System.out.println("21번 문제");
		int i,j;
		int sum = 0;
		i = 0;
		System.out.println("숫자를 입력하세요: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		for(j=2;i<a;i++)
		{for(j=2;j<=i;j++)
		{if (i==j)
			sum = sum + i;
		
	
		 if (i%j==0)
			{break;}
		}
		
	
		}
		{System.out.println(sum);}
		System.out.println("=========프로그램종료========");
		}
}


