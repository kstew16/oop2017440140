
public class three {

	public static void main(String[] args) {
		// 1부터 100사이의 숫자(정수) 중에서 3의 공배수(3,6,9,12,..)들의 총합을 출력하는 프로그램을 작성하시오.(while문 사용)
		System.out.println("3번 문제");
		int i;
		int sum = 0;
		i = 1;
		while (i<=100){ 
			if (i%3==0) {
				sum = sum + i;
			     i++;}
			else 
				i++;
			}
		System.out.println("Sum = " + sum);
		System.out.println("=========프로그램종료========");
		
		
	}

}
