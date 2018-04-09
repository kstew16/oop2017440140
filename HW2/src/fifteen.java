import java.util.Scanner;

public class fifteen {

	public static void main(String[] args) {
		// 1~100 사이의 숫자 하나를 정한 뒤(랜덤으로 생성해도 됨), 10번 이내로 그 숫자를 맞추는 게임을 작성하시오.(10번 이내로 못 맞추었을 경우는 약간 머리가 딸리는 사람이므로 Game Over 처리를 신랄하게 해 주기 바람)
		System.out.println("15번 문제");
		int num;
       int temp=53;
       
       
       for(int i=0;i<=10;i++)
       {  System.out.println("숫자를 입력하세요: ");
		Scanner input = new Scanner(System.in);
	   num = input.nextInt();
	   if (temp>num)
		   System.out.println("입력하신 숫자보다 큽니다");
	   else if(temp<num )
		   System.out.println("입력하신 숫자보다 작습니다");
	   else if (temp==num) {
		   System.out.println("정답입니다");
		   break;}
	   if (i==10) {
		   System.out.println("Game Over");
	   break;}
		   
	 
	}

}
}
