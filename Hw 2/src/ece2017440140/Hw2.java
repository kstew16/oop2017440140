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
      System.out.println("4. ����(����)�� �Է� �޾Ƽ� ���(A, B, C, D, E)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.\r\n" + 
            "(A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)");

      System.out.println("������ ������ �Է��Ͻʽÿ�.");
      a=input.nextInt();
      capture=a>=80?('A'):(a>=60?('B'):(a>=40?('C'):(a>=20?('D'):('E'))));
      System.out.println("������"+a+" �����"+capture);
      a=0;
      str=input.nextLine();
      System.out.println("5. �޴��� ����ϰ�, ����ڷκ��� �Է��� �޾� ���õ� �޴��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.\r\n" + 
            "   choose one of the following.\r\n" + 
            "   apple\r\n" + 
            "   orange\r\n" + 
            "   banana\r\n" + 
            "   peach");
      str=input.nextLine();
      if(str.equals("apple")==true) {System.out.println("��� �޴��� �����ϼ̽��ϴ�.");}
      else if(str.equals("orange")==true) {System.out.println("������ �޴��� �����ϼ̽��ϴ�.");}
      else if(str.equals("banana")==true) {System.out.println("�ٳ��� �޴��� �����ϼ̽��ϴ�.");}
      else if(str.equals("peach")==true) {System.out.println("������ �޴��� �����ϼ̽��ϴ�.");}
      else System.out.println("�ùٸ� �Է��� �ʿ��մϴ�.");
      System.out.println("�ݺ���1.1���� 10���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.");
      for(i=1;i<11;i++) {
         System.out.println(i);
         
      }
      i=0;
      System.out.println("�ݺ��� 3.1���� 100������ ���� �߿��� 3�� ������� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�");
      while(i<=100) {
         if(i%3==0) {sum+=i;}
         i++;
         
      }
      System.out.println(sum);
      i=0;
      sum=0;
      System.out.println("�ݺ��� 5.do while ���� ����Ͽ� 1���� 100������ ���� �߿��� 3�� ������� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�");
      do {
         if(i%3==0) {sum+=i;}
         i++;
         
      } while(i<=100);
      System.out.println(sum);
      sum=0;
      i=0;
      System.out.println("�ݺ��� 7.0�� �Էµ� ������ ��� ������ �Է¹ް�, �Էµ� ��� ���ڵ��� ������ ����Ͻÿ�");
      
      do {
         i=input.nextInt();
         sum+=i;
         
      }
      while(i!=0) ;
      System.out.println("������� �Է��Ͻ� ������ �� ����"+sum);
      sum=0;
      i=0;
      System.out.println("�ݺ��� 9.1���� 9������ �������� ����ϴ� ��ȿ�� �˻縦 ���� ���α׷��� �ۼ��Ͻÿ�\n���ڸ� �Է��ϼ���");
      
      while(i==0) {
      a=input.nextInt();
      
      if(a>=1&&a<=9) {
         System.out.println("�Է��Ͻ� ����"+a+"�� ��������");
         for(j=1;j<=9;j++) {
            System.out.println(a+"x"+j+"="+a*j);
            
            
         }
         System.out.println("�Դϴ�");
         i=1;
      }
      else System.out.println("1~9������ ������ �Է��ϼ���");
      }
      i=0;
      j=0;
      a=0;
      str=input.nextLine();
      System.out.println("�ݺ���11. �Է��� ���� ����� 0�� �Է��� �� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�");
      i=input.nextInt();
      for(j=1;j<=i;j++) {
         if(i%j==0) {
         System.out.print(" "+j);
         }
      }
      while(i!=0){
         System.out.println("�� �Է��Ͻ� ��"+i+"�� ����Դϴ�");
         i=input.nextInt();
         for(j=1;j<=i;j++) {
            if(i%j==0) {
            System.out.print(" "+j);
            }
         }
         
      }
      i=0;
      j=0;
      System.out.println("�ݺ���13. month�� day�� �Է� �޾�, 1�� 1�Ϻ����� �� day���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (switch�� ���) //1�� 20���� 20�� ���, 2�� 5���� 36�� ���. �� 2���� 28�Ϸ� ���.\r\n�� ���Դϱ�?\n");
      i=input.nextInt();
      str=input.nextLine();
      System.out.println("��ĥ�ΰ���?");
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
      System.out.println(sum+"�� �����׿�");
      a=0;
      i=0;
      j=0;
      sum=0;
      
      System.out.println("15. 1~100 ������ ���� �ϳ��� ���� ��(�������� �����ص� ��), 10�� �̳��� �� ���ڸ� ���ߴ� ������ �ۼ��Ͻÿ�.(10�� �̳��� �� ���߾��� ���� �ణ �Ӹ��� ������ ����̹Ƿ� Game Over ó���� �Ŷ��ϰ� �� �ֱ� �ٶ�)");
      a=61;
      while(j<10) {
         
         System.out.println("�����غ�����!");
         i=input.nextInt();
         if(i==a) {System.out.println("����!���߼̽��ϴ�!");
         j=10;
         }
         if(i!=a) {j++;
         System.out.println("Ʋ���̳׿�..."+j+"�� Ʋ�Ƚ��ϴ�");
         }
         if(a>i) System.out.println("�װͺ��� Ů�ϴ�.");
         else if(a<i) System.out.println("�װͺ��� �۳׿�.");
         
      }
      if(i!=a&&j>9) {System.out.println("���������������������������� �� ����� ������ �� �ֳ׿� ");
      
      }
      i=0;
      a=0;
      j=0;
      
      System.out.println("17. 1���� 100������ ���� for loop�� �Ἥ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.");
      for(i=0;i<=100;i++) {
         sum+=i;
      }
      System.out.println("1���� 100������ ����"+sum);
      i=0;
      sum=0;
      System.out.println("19. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���ڰ� �Ҽ����� �ƴ����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.\r\n" + "");
      System.out.println("�Է��Ͻ�����");
      i=input.nextInt();
      for(j=2;j<i;j++) {
         if(i%j==0) {
            System.out.println("�Ҽ��� �ƴմϴ�.");
            a=1;
         }
      
      }
      if(a==0) {
         System.out.println("�Ҽ��Դϴ�.");
      }
      
      a=0;
      i=0;
      j=0;
      sum=0;
      System.out.println("21. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���� ������ �Ҽ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.");
      System.out.println("�Է��Ͻ�����");
      i=input.nextInt();
      for(k=2;k<=i;k++) {
      for(j=2;j<k;j++) {
         if(k%j==0) {
            a=1;
         }
      
      }
      
      if(a==0) {sum+=k;
      System.out.println(i+"������ ��"+k+"�� �Ҽ��Դϴ�. ");
      }
      a=0;
      }
      System.out.println(i+"������ �Ҽ��� ������"+sum+"�Դϴ�");
      
      System.out.println("23.***** *\r\n" + 
            " *** ***\r\n" + 
            " * *****\r\n" + 
            "\r\n" + 
            "�� ����Ͻÿ�(�ݺ��� �Ἥ!\n\n)");
      
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
      
      System.out.println("25.������ ���� ����� �������� ���α׷��� �ۼ��Ͻÿ�.\r\n" + 
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
   
   