import java.util.Scanner;
public class nine {

	public static void main(String[] args) {
		// 위의 문제에서 1부터 9사이 이외의 숫자를 사용자가 잘못 입력할 수도 있으니, 이 경우에 잘못된 숫자라는 것을 알려주는 에러 메시지를 출력하고 다시 숫자를 입력 받도록 처리하시오.(입력의 유효성 검사)
		System.out.println("9번 문제");
		
		int n;
		int i=1;
		System.out.println("구구단 중에서 출력하고 싶은 단을 입력하세요");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		if (n>9) {
			System.out.println("1에서 9사이의 숫자를 입력하세요");
			Scanner input = new Scanner(System.in);
			n = input.nextInt();
			if (n<=9) {
				while (i<=9) {
				System.out.println(n+"x"+i+"="+n*i);
				i++;}
			}
				
		}
		else
		while (i<=9) {
			System.out.println(n+"x"+i+"="+n*i);
			i++;
		}
		}
	
			
	}
		
			
	



