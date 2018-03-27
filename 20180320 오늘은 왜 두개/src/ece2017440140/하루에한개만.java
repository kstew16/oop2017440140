package ece2017440140;

public class 하루에한개만 {

	public static void main(String[] args) {
		int i=0;
		int sum=0;
		for(i=0;i<10;i++) {
			
			System.out.println(i+1);
			
		}
		i=0;
		while(i<11) {
			
			System.out.println(i);
			sum+=i;
			i=i+1;
			
		}
		System.out.println(sum);
		String str = "hello darkness my old friend";
		int count=0;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)!='l')//i번째 인덱스의 문자를 추출 
			continue;//다르면 이 뒤에 무시하고 다음 인덱스 진행
			count ++;
			
			
		}
		System.out.println("무장에서 발견한 l의 개수"+count);

		System.out.println("==========프로그램 종료==========");
	}

}
