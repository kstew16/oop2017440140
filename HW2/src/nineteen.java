import java.util.Scanner;

public class nineteen {

	public static void main(String[] args) {
		// 사용자로부터 한 숫자를 입력받아, 입력받은 숫자가 소수인지 아닌지를 검사하는 프로그램을 작성하시오.
		System.out.println("19번 문제");
		
		
		for(int i=0;i<10;i++) {
			System.out.println("숫자를 입력하세요: ");
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
			if(a==0 || a==1) {
				System.out.println("소수가 아닙니다"); break;
			}
			else if (a%2==0)
			{System.out.println("소수가 아닙니다");
			break;}
			
			else 
				System.out.println("입력한"+a+"는 소수입니다. ");
			    break;
			
		}
		System.out.println("=========프로그램종료========");
	}

}
