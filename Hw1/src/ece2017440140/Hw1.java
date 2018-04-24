package ece2017440140;

import java.util.Scanner;

//반복문 홀수만...
public class Hw1 {
/*1. 두 수(정수)를 입력 받아, 그 중 큰 수를 출력하는 프로그램을 작성하시오.


2. 하나의 정수를 입력 받아 이 수가 짝수(even number)인지 홀수(odd number)인지를 출력하는 프로그램을 작성하시오.


3. 세 수(정수형)를 입력 받아 가장 큰 수를 출력하는 프로그램을 작성하시오.


4. 점수(정수)를 입력 받아서 등급(A, B, C, D, E)을 출력하는 프로그램을 작성하시오.
(A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)


5. 메뉴를 출력하고, 사용자로부터 입력을 받아 선택된 메뉴를 출력하는 프로그램을 작성하시오.
choose one of the following.
apple
orange
banana
peach

enter your choice here : (사용자 입력)orange

--------------
Your choice is “orange”.


6. 어떤 두 자리 수의 자릿수의 순서를 서로 바꾸는 프로그램을 작성하시오.
사용자 입력 : 한 개의 두 자리 정수
출력 : 자릿수의 순서가 반대로 된 정수*/
	
	public static void main(String[] args) {
		System.out.println(" 두 수(정수)를 입력 받아, 그 중 큰 수를 출력하는 프로그램을 작성하시오.");
		int a=0,b=0,c=0;
		int max=0;
		Scanner input = new Scanner(System.in);
		System.out.println("a를 입력하십시오.");
		a=input.nextInt();
		System.out.println("b를 입력하십시오.");
		b=input.nextInt();
		System.out.println("두 수 중 큰 수는 "+(a>=b?(a):(b)));
		a=0;
		b=0;
		c=0;
		System.out.println(" 하나의 정수를 입력 받아 이 수가 짝수(even number)인지 홀수(odd number)인지를 출력하는 프로그램을 작성하시오.");
		a=input.nextInt();
		if(a%2==1) {System.out.println("홀수임");}
		else System.out.println("짝수임");
		a=0;
		b=0;
		c=0;
		System.out.println(" 세 수(정수)를 입력 받아, 그 중 큰 수를 출력하는 프로그램을 작성하시오.");
		//int a=0,b=0,c=0;
		//int max=0;
		//Scanner input = new Scanner(System.in);
		System.out.println("a를 입력하십시오.");
		a=input.nextInt();
		System.out.println("b를 입력하십시오.");
		b=input.nextInt();
		System.out.println("c를 입력하십시오.");
		c=input.nextInt();
		System.out.println("세 수 중 가장 큰 수는 "+(a>=b?(a>=c?a:c):(b>=c?b:c)));
	}

}
