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

		
			System.out.println(i+1+"번째 과목의 성적을 입력하라?");
		
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			score= input.nextInt();
			if(score>=0&&score<=100) {
				if(score>=80) {System.out.println("성적이"+score+"점 입니까? 축하합니다 당신의 학점은 A+입니다");
				good++;
				}
				if(score>=60&&score<80) {System.out.println("성적이"+score+"점 입니까? 꽤 열심히 하셨네요 당신의 학점은 A0입니다");
				good++;
				}
				if(score>=50&&score<60) {System.out.println("성적이"+score+"점 입니까? 인간이군요 당신의 학점은 B+입니다");}
				if(score>=30&&score<50) {System.out.println("성적이"+score+"점 입니까? 당신의 학점은 B0입니다 돌아오지 마십시오");
				bad++;
				}
				if(score>=0&&score<30) {System.out.println("성적이"+score+"점 입니까? 그러고도 학점을 받을 생각을 합니까?;; 강해져서 돌아오세요");
				bad++;
			}
		}//복함문 (compound Statement); 여러 문장을 중괄호 로 묶어 하나의 문장으로 처리함
		else {System.out.println("0에서 100점 사이의 제대로 된 성적을 입력하십시오");}
			if(i==4) {
				switch(good) {
				case 1 :System.out.println("잘 맞은 과목이 1개구나 고생했어!");
					break;
				case 2 :System.out.println("A넘은 게 두 개나 돼? 공부 많이 했는데?");
					break;
				case 3 :System.out.println("크... 3A 오졌다");
					break;
				case 4 :System.out.println("? 공부 적당히 하자");
					break;
				case 5 :System.out.println("... ㅗ");
					break;
				default : System.out.println("시험 보느라 고생 많았어요");
				break;
				}
				switch(bad) {
				case 1 :System.out.println("한 개쯤 그럴 수도 있지");
					break;
				case 2 :System.out.println("관리는 좀 하자");
					break;
				case 3 :System.out.println("이 과목들은 왜 이래?");
					break;
				case 4 :System.out.println("못 본 거 네 개나 되네? 학교 왜 다녀?");
					break;
				case 5 :System.out.println("왜 살아?");
					break;
				default : System.out.println("시험 보느라 고생 많았어요");
				break;
				}

			}
		}
	}
}
