package ece2017440140;

import java.util.Scanner;

public class whtnot {

	public static void main(String[] args) {
		//ConditionalStatement
		
		int score;
		int good = 0;
		int bad = 0;
		int i=0;
		for(i=0;i<5;i++) {

		
			System.out.println(i+1+"��° ������ ������ �Է��϶�?");
		
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			score= input.nextInt();
			if(score>=0&&score<=100) {
				if(score>=80) {System.out.println("������"+score+"�� �Դϱ�? �����մϴ� ����� ������ A+�Դϴ�");
				good++;
				}
				if(score>=60&&score<80) {System.out.println("������"+score+"�� �Դϱ�? �� ������ �ϼ̳׿� ����� ������ A0�Դϴ�");
				good++;
				}
				if(score>=50&&score<60) {System.out.println("������"+score+"�� �Դϱ�? �ΰ��̱��� ����� ������ B+�Դϴ�");}
				if(score>=30&&score<50) {System.out.println("������"+score+"�� �Դϱ�? ����� ������ B0�Դϴ� ���ƿ��� ���ʽÿ�");
				bad++;
				}
				if(score>=0&&score<30) {System.out.println("������"+score+"�� �Դϱ�? �׷��� ������ ���� ������ �մϱ�?;; �������� ���ƿ�����");
				bad++;
			}
		}//���Թ� (compound Statement); ���� ������ �߰�ȣ �� ���� �ϳ��� �������� ó����
		else {System.out.println("0���� 100�� ������ ����� �� ������ �Է��Ͻʽÿ�");}
			if(i==4) {
				switch(good) {
				case 1 :System.out.println("�� ���� ������ 1������ ����߾�!");
					break;
				case 2 :System.out.println("A���� �� �� ���� ��? ���� ���� �ߴµ�?");
					break;
				case 3 :System.out.println("ũ... 3A ������");
					break;
				case 4 :System.out.println("? ���� ������ ����");
					break;
				case 5 :System.out.println("... ��");
					break;
				default : System.out.println("���� ������ ��� ���Ҿ��");
				break;
				}
				switch(bad) {
				case 1 :System.out.println("�� ���� �׷� ���� ����");
					break;
				case 2 :System.out.println("������ �� ����");
					break;
				case 3 :System.out.println("�� ������� �� �̷�?");
					break;
				case 4 :System.out.println("�� �� �� �� ���� �ǳ�? �б� �� �ٳ�?");
					break;
				case 5 :System.out.println("�� ���?");
					break;
				default : System.out.println("���� ������ ��� ���Ҿ��");
				break;
				}

			}
		}
	}
}
