package ece2017440140;

import java.util.Scanner;

//�ݺ��� Ȧ����...
public class Hw1 {
/*1. �� ��(����)�� �Է� �޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.


2. �ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.


3. �� ��(������)�� �Է� �޾� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.


4. ����(����)�� �Է� �޾Ƽ� ���(A, B, C, D, E)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
(A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)


5. �޴��� ����ϰ�, ����ڷκ��� �Է��� �޾� ���õ� �޴��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
choose one of the following.
apple
orange
banana
peach

enter your choice here : (����� �Է�)orange

--------------
Your choice is ��orange��.


6. � �� �ڸ� ���� �ڸ����� ������ ���� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
����� �Է� : �� ���� �� �ڸ� ����
��� : �ڸ����� ������ �ݴ�� �� ����*/
	
	public static void main(String[] args) {
		System.out.println(" �� ��(����)�� �Է� �޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.");
		int a=0,b=0,c=0;
		int max=0;
		Scanner input = new Scanner(System.in);
		System.out.println("a�� �Է��Ͻʽÿ�.");
		a=input.nextInt();
		System.out.println("b�� �Է��Ͻʽÿ�.");
		b=input.nextInt();
		System.out.println("�� �� �� ū ���� "+(a>=b?(a):(b)));
		a=0;
		b=0;
		c=0;
		System.out.println(" �ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.");
		a=input.nextInt();
		if(a%2==1) {System.out.println("Ȧ����");}
		else System.out.println("¦����");
		a=0;
		b=0;
		c=0;
		System.out.println(" �� ��(����)�� �Է� �޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.");
		//int a=0,b=0,c=0;
		//int max=0;
		//Scanner input = new Scanner(System.in);
		System.out.println("a�� �Է��Ͻʽÿ�.");
		a=input.nextInt();
		System.out.println("b�� �Է��Ͻʽÿ�.");
		b=input.nextInt();
		System.out.println("c�� �Է��Ͻʽÿ�.");
		c=input.nextInt();
		System.out.println("�� �� �� ���� ū ���� "+(a>=b?(a>=c?a:c):(b>=c?b:c)));
	}

}
