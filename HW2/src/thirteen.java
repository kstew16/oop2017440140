import java.util.Scanner;

public class thirteen {

	public static void main(String[] args) {
		// month와 day를 입력 받아, 1월 1일부터의 총 day수를 출력하는 프로그램을 작성하시오. (switch문 사용) //1월 20일은 20일 출력, 2월 5일은 36일 출력. 단 2월은 28일로 계산.

		System.out.println("13번 문제");
		int month=0;
		int day=0; 
		int total=0;
		do {
			System.out.println("month를 입력하세요: ");
			Scanner input = new Scanner(System.in);
			month=input.nextInt();
			if (month==2) {
				if (day>=1 && day<=28) {
					System.out.println("day를 입력하세요: ");
					Scanner scan = new Scanner(System.in);
					day=scan.nextInt();}
					
			else {System.out.println("day를 입력하세요: ");
				Scanner scan = new Scanner(System.in);
				day=scan.nextInt();
				break;}}
			
				
			while (month>=1 && month <13 && day>=1 && day<32);
			switch (month)
			{ case 1: total = day;	    break;
			case 2:  total = 31+ day;	    break;
			case 3:   total = 59+day; 	break;
			case 4:   total = 90+day; 	break;
			case 5:   total = 120+day; 	break;
			case 6:  total = 151+day; 	break;
			case 7:   total = 181+day; 	break;
			case 8:   total = 212+day; 	break;
			case 9:   total = 243+day; 	break;
			case 10:   total = 274+day;	 break;
			case 11:   total = 304+day; 	break;
			case 12:   total = 334+day; 	break;
			}
		} while(month<13);
		System.out.println(total +"일 입니다.");
		
		}
	
}
