package ece2017440140;

public class �Ϸ翡�Ѱ��� {

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
			if(str.charAt(i)!='l')//i��° �ε����� ���ڸ� ���� 
			continue;//�ٸ��� �� �ڿ� �����ϰ� ���� �ε��� ����
			count ++;
			
			
		}
		System.out.println("���忡�� �߰��� l�� ����"+count);

		System.out.println("==========���α׷� ����==========");
	}

}
