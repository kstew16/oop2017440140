
public class testscript {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hllo");
		
		System.out.println(str1.equals(str2));//false 리턴 str1은 hello인데 str2는 hllo라서 서로 내용이 다름
		  str1 = str2; //str2의 주소가 str1과 같아짐
		System.out.println(str1==str2);//true 리턴
		 
	}

}
