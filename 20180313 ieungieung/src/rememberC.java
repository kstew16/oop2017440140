import java.util.Scanner;//스캐너 나중에 한대요
public class rememberC {
//오늘은 변수와 자료형, 변수 선언에 대해서 알아보도록 할 거에요
//변수는 메모리 저장공간의 이름이고
//자료형은 변수가 가질 수 있는 값의 범위를 정하고 변수를 피 연산자로 사용할 경우 사용할 수 있는 연산자를 정한다
//값을 메모리에 저장하기 위해 필요한 정보(저장공간의 수,저장 포맷)을 정한다
/*변수 선언문 변수를 사용하기 위해 필요한 아래의 정보를 표현한다.

사용할 변수의 이름을 지정한다 

사용할 변수의 자료형을 선언한다. 

C언어에서는 변수를 사용하기 전에  반드시 변수선언을 해야 한다.
*/
/*리터럴 소스코드에서 특정한 자료형의 값을 직접 표현하는 방법. 예) 정수형: 10, 0xF3; 실수형: 3.14, 10f; 0.1E-5; 문자형: 'a', \n; 문자열: "Hello world*/
	/*today, we'll gonna learn about variable and Data type, variable Declaration*/
	//연산자 연산을 수행하는 기호
/*수식 연산자와 피연산자들의 조합. 
모든 수식은 값을 반환(리턴)한다.
*/
//pre increment (a++) 반환값은 a, 부수효과는 a=a+1 이 부수효과는 문장의 마지막에 적용이 됩니다.
	//여기를 봐 중요해 boolean 연산자 자료형이랑 true false 도 리터럴이 존재해 아래에 써줌
	//관계연산자 < > 이런 놈들은 부울 값을 반환

	
	//관례 클래스명 각 단어의 첫 글자는 대문자로
	//변수, 메소드 이름은 소문자로 시작하여 두 번째 단어의 첫 글자는 대문자로.
	// 상수는 모두 대문자로. 
	
	//형봔한은 자료형의 값을 다른 자료형으로 바꿔줌. casting
	public static void main(String[] args) {
				//변수이름 언더바로 하면 디버깅할때 프로그램이 쓰는 거랑 착각하니까 쓰지 말고 소문자로! 숫자로는 시작 x
				int a=20;
				int b=10;
				int c;
				float ff=3.14f;
				double dd= 3.14;
				//리터럴 3.14의 자료형은 더블
				final int d=1000;//d를 상수화 시켜버림
				System.out.println("d="+d);
				
				boolean bb;//불 연산자 소환!!
				bb = true;//트루를 넣는다
				//연산자는 불 논리회로랑 똑같은 방식으로 진행된다
				// 논리 연산자의 피연산자는 부울 변수 또는 리터럴을 사용해야 한다.ㅇㅇ 트루아니면 false잖아
				System.out.println("bb="+bb+"트루 출력됨 대단하지?");
				System.out.println("OH Hell World!");
				System.out.println("I'm"+" Tiamoh");//문자열 더할 수 있음
				Scanner input = new Scanner(System.in);
				System.out.println("첫 번째 숫자?");
				a=input.nextInt();
				System.out.println("두 번째 숫자?");
				b=input.nextInt();
				c=a+b;
				/*System.out.print("a="+a);//문자열로 a의 값을 출력의 마지막에 집어넣으라
				System.out.println(" b="+b);*/
				System.out.println("a("+a+")+b("+b+")=c("+c+")");
				
				dd=a;//(더블에 인티져 대입함)
				//근데 implicit casting 해서 알아서 형변환 됨
				dd=3.14;
				a=10;
				
				a=(int)dd;
				//이러면 explicit casting (정보를 잃는 캐스팅이라..)
				System.out.println("a="+a+" y="+dd);
				return;

		


	}
}
//대입연산자는 안 써도 안다고 믿는다.