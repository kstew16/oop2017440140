package ece2017440140;

import java.util.Scanner;

public class Hw2 {
   public static void main(String[] args) {
      int a=0,b=0,c=0;
      int max=0;
      char capture;
      int i=0,j=0,k=0;
      int sum=0;
      int loopbouncei=0;
      int loopbouncej=0;
      String str;
      Scanner input = new Scanner(System.in);
      System.out.println("4. 점수(정수)를 입력 받아서 등급(A, B, C, D, E)을 출력하는 프로그램을 작성하시오.\r\n" + 
            "(A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)");

      System.out.println("정수의 점수를 입력하십시오.");
      a=input.nextInt();
      capture=a>=80?('A'):(a>=60?('B'):(a>=40?('C'):(a>=20?('D'):('E'))));
      System.out.println("점수는"+a+" 등급은"+capture);
      a=0;
      str=input.nextLine();
      System.out.println("5. 메뉴를 출력하고, 사용자로부터 입력을 받아 선택된 메뉴를 출력하는 프로그램을 작성하시오.\r\n" + 
            "   choose one of the following.\r\n" + 
            "   apple\r\n" + 
            "   orange\r\n" + 
            "   banana\r\n" + 
            "   peach");
      str=input.nextLine();
      if(str.equals("apple")==true) {System.out.println("사과 메뉴를 선택하셨습니다.");}
      else if(str.equals("orange")==true) {System.out.println("오렌지 메뉴를 선택하셨습니다.");}
      else if(str.equals("banana")==true) {System.out.println("바나나 메뉴를 선택하셨습니다.");}
      else if(str.equals("peach")==true) {System.out.println("복숭아 메뉴를 선택하셨습니다.");}
      else System.out.println("올바른 입력이 필요합니다.");
      System.out.println("반복문1.1부터 10까지 연속 출력하는 프로그램을 작성하시오.");
      for(i=1;i<11;i++) {
         System.out.println(i);
         
      }
      i=0;
      System.out.println("반복문 3.1부터 100사이의 정수 중에서 3의 배수들의 총합을 출력하는 프로그램을 작성하시오");
      while(i<=100) {
         if(i%3==0) {sum+=i;}
         i++;
         
      }
      System.out.println(sum);
      i=0;
      sum=0;
      System.out.println("반복문 5.do while 문을 사용하여 1부터 100사이의 정수 중에서 3의 배수들의 총합을 출력하는 프로그램을 작성하시오");
      do {
         if(i%3==0) {sum+=i;}
         i++;
         
      } while(i<=100);
      System.out.println(sum);
      sum=0;
      i=0;
      System.out.println("반복문 7.0이 입력될 때까지 계속 정수를 입력받고, 입력된 모든 숫자들의 총합을 출력하시오");
      
      do {
         i=input.nextInt();
         sum+=i;
         
      }
      while(i!=0) ;
      System.out.println("현재까지 입력하신 수들의 총 합은"+sum);
      sum=0;
      i=0;
      System.out.println("반복문 9.1부터 9까지의 구구단을 출력하는 유효성 검사를 가진 프로그램을 작성하시오\n숫자를 입력하세요");
      
      while(i==0) {
      a=input.nextInt();
      
      if(a>=1&&a<=9) {
         System.out.println("입력하신 숫자"+a+"의 구구단은");
         for(j=1;j<=9;j++) {
            System.out.println(a+"x"+j+"="+a*j);
            
            
         }
         System.out.println("입니다");
         i=1;
      }
      else System.out.println("1~9사이의 정수를 입력하세요");
      }
      i=0;
      j=0;
      a=0;
      str=input.nextLine();
      System.out.println("반복문11. 입력한 수의 약수를 0을 입력할 때 까지 모두 출력하는 프로그램을 작성하시오");
      i=input.nextInt();
      for(j=1;j<=i;j++) {
         if(i%j==0) {
         System.out.print(" "+j);
         }
      }
      while(i!=0){
         System.out.println("가 입력하신 수"+i+"의 약수입니다");
         i=input.nextInt();
         for(j=1;j<=i;j++) {
            if(i%j==0) {
            System.out.print(" "+j);
            }
         }
         
      }
      i=0;
      j=0;
      System.out.println("반복문13. month와 day를 입력 받아, 1월 1일부터의 총 day수를 출력하는 프로그램을 작성하시오. (switch문 사용) //1월 20일은 20일 출력, 2월 5일은 36일 출력. 단 2월은 28일로 계산.\r\n몇 월입니까?\n");
      i=input.nextInt();
      str=input.nextLine();
      System.out.println("며칠인가요?");
      j=input.nextInt();
      switch(i) {
      case 1:a=0;
         break;
      case 2:a=31;
         break;
      case 3:a=59;
         break;
      case 4:a=90;
         break;
      case 5:a=120;
         break;
      case 6:a=151;
         break;
      case 7:a=181;
         break;
      case 8:a=212;
         break;
      case 9:a=243;
         break;
      case 10:a=273;
         break;
      case 11:a=304;
         break;
      case 12:a=334;
         break;
      }
      sum=a+j;
      System.out.println(sum+"일 지났네요");
      a=0;
      i=0;
      j=0;
      sum=0;
      
      System.out.println("15. 1~100 사이의 숫자 하나를 정한 뒤(랜덤으로 생성해도 됨), 10번 이내로 그 숫자를 맞추는 게임을 작성하시오.(10번 이내로 못 맞추었을 경우는 약간 머리가 딸리는 사람이므로 Game Over 처리를 신랄하게 해 주기 바람)");
      a=61;
      while(j<10) {
         
         System.out.println("추측해보세요!");
         i=input.nextInt();
         if(i==a) {System.out.println("축하!맞추셨습니다!");
         j=10;
         }
         if(i!=a) {j++;
         System.out.println("틀리셨네요..."+j+"번 틀렸습니다");
         }
         if(a>i) System.out.println("그것보단 큽니다.");
         else if(a<i) System.out.println("그것보단 작네요.");
         
      }
      if(i!=a&&j>9) {System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋ아직까지도 못 맞춘건 문제가 좀 있네요 ");
      
      }
      i=0;
      a=0;
      j=0;
      
      System.out.println("17. 1부터 100까지의 합을 for loop을 써서 구하는 프로그램을 작성하시오.");
      for(i=0;i<=100;i++) {
         sum+=i;
      }
      System.out.println("1부터 100까지의 합은"+sum);
      i=0;
      sum=0;
      System.out.println("19. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자가 소수인지 아닌지를 검사하는 프로그램을 작성하시오.\r\n" + "");
      System.out.println("입력하시지오");
      i=input.nextInt();
      for(j=2;j<i;j++) {
         if(i%j==0) {
            System.out.println("소수가 아닙니다.");
            a=1;
         }
      
      }
      if(a==0) {
         System.out.println("소수입니다.");
      }
      
      a=0;
      i=0;
      j=0;
      sum=0;
      System.out.println("21. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자 이하의 소수들의 합을 구하는 프로그램을 작성하시오.");
      System.out.println("입력하시지오");
      i=input.nextInt();
      for(k=2;k<=i;k++) {
      for(j=2;j<k;j++) {
         if(k%j==0) {
            a=1;
         }
      
      }
      
      if(a==0) {sum+=k;
      System.out.println(i+"이하의 수"+k+"는 소수입니다. ");
      }
      a=0;
      }
      System.out.println(i+"이하의 소수의 총합은"+sum+"입니다");
      
      System.out.println("23.***** *\r\n" + 
            " *** ***\r\n" + 
            " * *****\r\n" + 
            "\r\n" + 
            "를 출력하시오(반복문 써서!\n\n)");
      
      for(j=0;j<3;j++) {
         if(j==0)a=5;
         if(j==1)a=3;
         if(j==2)a=1;
            for(i=0;i<=6;i++) {
               if(i!=a) {
                  System.out.print("*");
               }
               else System.out.print(" ");
            }
            System.out.println("");
      }
      
      a=0;
      i=0;
      j=0;
      
      System.out.println("25.다음과 같은 출력이 나오도록 프로그램을 작성하시오.\r\n" + 
            " *********** 54321012345\r\n" + 
            " ********* 432101234\r\n" + 
            " ******* 3210123\r\n" + 
            " ***** 21012\r\n" + 
            " *** 101\r\n" + 
            " * 0\r\n" + 
            " *** 101 \r\n" + 
            " ***** 21012 \r\n" + 
            " ******* 3210123 \r\n" + 
            " ********* 432101234 \r\n" + 
            " *********** 54321012345\n\n\n\n");
      i=5;
      j=5;
      loopbouncej=1;
      loopbouncei=1;
      do{
         for(k=0;k<(i*2+1);k++) {
         System.out.print("*");
         }
         System.out.print(" ");
      while(j<=i) {
         System.out.print(j);
         if(j==0)loopbouncej=0;
         if(loopbouncej==1) j--;
         else j++;
      }
      System.out.println("");
      if(i==0)loopbouncei=0;
      if(loopbouncei==1) i--;
      else i++;
      loopbouncej=1;
      j=i;
      }
      while(i<6);
      
      }
   
   }
   
   