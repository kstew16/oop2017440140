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
      System.out.println("4. 繊呪(舛呪)研 脊径 閤焼辞 去厭(A, B, C, D, E)聖 窒径馬澗 覗稽益轡聖 拙失馬獣神.\r\n" + 
            "(A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)");

      System.out.println("舛呪税 繊呪研 脊径馬淑獣神.");
      a=input.nextInt();
      capture=a>=80?('A'):(a>=60?('B'):(a>=40?('C'):(a>=20?('D'):('E'))));
      System.out.println("繊呪澗"+a+" 去厭精"+capture);
      a=0;
      str=input.nextLine();
      System.out.println("5. 五敢研 窒径馬壱, 紫遂切稽採斗 脊径聖 閤焼 識澱吉 五敢研 窒径馬澗 覗稽益轡聖 拙失馬獣神.\r\n" + 
            "   choose one of the following.\r\n" + 
            "   apple\r\n" + 
            "   orange\r\n" + 
            "   banana\r\n" + 
            "   peach");
      str=input.nextLine();
      if(str.equals("apple")==true) {System.out.println("紫引 五敢研 識澱馬写柔艦陥.");}
      else if(str.equals("orange")==true) {System.out.println("神兄走 五敢研 識澱馬写柔艦陥.");}
      else if(str.equals("banana")==true) {System.out.println("郊蟹蟹 五敢研 識澱馬写柔艦陥.");}
      else if(str.equals("peach")==true) {System.out.println("差周焼 五敢研 識澱馬写柔艦陥.");}
      else System.out.println("臣郊献 脊径戚 琶推杯艦陥.");
      System.out.println("鋼差庚1.1採斗 10猿走 尻紗 窒径馬澗 覗稽益轡聖 拙失馬獣神.");
      for(i=1;i<11;i++) {
         System.out.println(i);
         
      }
      i=0;
      System.out.println("鋼差庚 3.1採斗 100紫戚税 舛呪 掻拭辞 3税 壕呪級税 恥杯聖 窒径馬澗 覗稽益轡聖 拙失馬獣神");
      while(i<=100) {
         if(i%3==0) {sum+=i;}
         i++;
         
      }
      System.out.println(sum);
      i=0;
      sum=0;
      System.out.println("鋼差庚 5.do while 庚聖 紫遂馬食 1採斗 100紫戚税 舛呪 掻拭辞 3税 壕呪級税 恥杯聖 窒径馬澗 覗稽益轡聖 拙失馬獣神");
      do {
         if(i%3==0) {sum+=i;}
         i++;
         
      } while(i<=100);
      System.out.println(sum);
      sum=0;
      i=0;
      System.out.println("鋼差庚 7.0戚 脊径吃 凶猿走 域紗 舛呪研 脊径閤壱, 脊径吉 乞窮 収切級税 恥杯聖 窒径馬獣神");
      
      do {
         i=input.nextInt();
         sum+=i;
         
      }
      while(i!=0) ;
      System.out.println("薄仙猿走 脊径馬重 呪級税 恥 杯精"+sum);
      sum=0;
      i=0;
      System.out.println("鋼差庚 9.1採斗 9猿走税 姥姥舘聖 窒径馬澗 政反失 伊紫研 亜遭 覗稽益轡聖 拙失馬獣神\n収切研 脊径馬室推");
      
      while(i==0) {
      a=input.nextInt();
      
      if(a>=1&&a<=9) {
         System.out.println("脊径馬重 収切"+a+"税 姥姥舘精");
         for(j=1;j<=9;j++) {
            System.out.println(a+"x"+j+"="+a*j);
            
            
         }
         System.out.println("脊艦陥");
         i=1;
      }
      else System.out.println("1~9紫戚税 舛呪研 脊径馬室推");
      }
      i=0;
      j=0;
      a=0;
      str=input.nextLine();
      System.out.println("鋼差庚11. 脊径廃 呪税 鉦呪研 0聖 脊径拝 凶 猿走 乞砧 窒径馬澗 覗稽益轡聖 拙失馬獣神");
      i=input.nextInt();
      for(j=1;j<=i;j++) {
         if(i%j==0) {
         System.out.print(" "+j);
         }
      }
      while(i!=0){
         System.out.println("亜 脊径馬重 呪"+i+"税 鉦呪脊艦陥");
         i=input.nextInt();
         for(j=1;j<=i;j++) {
            if(i%j==0) {
            System.out.print(" "+j);
            }
         }
         
      }
      i=0;
      j=0;
      System.out.println("鋼差庚13. month人 day研 脊径 閤焼, 1杉 1析採斗税 恥 day呪研 窒径馬澗 覗稽益轡聖 拙失馬獣神. (switch庚 紫遂) //1杉 20析精 20析 窒径, 2杉 5析精 36析 窒径. 舘 2杉精 28析稽 域至.\r\n護 杉脊艦猿?\n");
      i=input.nextInt();
      str=input.nextLine();
      System.out.println("悟張昔亜推?");
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
      System.out.println(sum+"析 走概革推");
      a=0;
      i=0;
      j=0;
      sum=0;
      
      System.out.println("15. 1~100 紫戚税 収切 馬蟹研 舛廃 及(沓棋生稽 持失背亀 喫), 10腰 戚鎧稽 益 収切研 限蓄澗 惟績聖 拙失馬獣神.(10腰 戚鎧稽 公 限蓄醸聖 井酔澗 鉦娃 袴軒亜 京軒澗 紫寓戚糠稽 Game Over 坦軒研 重偶馬惟 背 爽奄 郊寓)");
      a=61;
      while(j<10) {
         
         System.out.println("蓄著背左室推!");
         i=input.nextInt();
         if(i==a) {System.out.println("逐馬!限蓄写柔艦陥!");
         j=10;
         }
         if(i!=a) {j++;
         System.out.println("堂軒写革推..."+j+"腰 堂携柔艦陥");
         }
         if(a>i) System.out.println("益依左舘 溺艦陥.");
         else if(a<i) System.out.println("益依左舘 拙革推.");
         
      }
      if(i!=a&&j>9) {System.out.println("せせせせせせせせせ焼送猿走亀 公 限秩闇 庚薦亜 岨 赤革推 ");
      
      }
      i=0;
      a=0;
      j=0;
      
      System.out.println("17. 1採斗 100猿走税 杯聖 for loop聖 潤辞 姥馬澗 覗稽益轡聖 拙失馬獣神.");
      for(i=0;i<=100;i++) {
         sum+=i;
      }
      System.out.println("1採斗 100猿走税 杯精"+sum);
      i=0;
      sum=0;
      System.out.println("19. 紫遂切稽採斗 廃 収切研 脊径閤焼, 脊径閤精 収切亜 社呪昔走 焼観走研 伊紫馬澗 覗稽益轡聖 拙失馬獣神.\r\n" + "");
      System.out.println("脊径馬獣走神");
      i=input.nextInt();
      for(j=2;j<i;j++) {
         if(i%j==0) {
            System.out.println("社呪亜 焼鑑艦陥.");
            a=1;
         }
      
      }
      if(a==0) {
         System.out.println("社呪脊艦陥.");
      }
      
      a=0;
      i=0;
      j=0;
      sum=0;
      System.out.println("21. 紫遂切稽採斗 廃 収切研 脊径閤焼, 脊径閤精 収切 戚馬税 社呪級税 杯聖 姥馬澗 覗稽益轡聖 拙失馬獣神.");
      System.out.println("脊径馬獣走神");
      i=input.nextInt();
      for(k=2;k<=i;k++) {
      for(j=2;j<k;j++) {
         if(k%j==0) {
            a=1;
         }
      
      }
      
      if(a==0) {sum+=k;
      System.out.println(i+"戚馬税 呪"+k+"澗 社呪脊艦陥. ");
      }
      a=0;
      }
      System.out.println(i+"戚馬税 社呪税 恥杯精"+sum+"脊艦陥");
      
      System.out.println("23.***** *\r\n" + 
            " *** ***\r\n" + 
            " * *****\r\n" + 
            "\r\n" + 
            "研 窒径馬獣神(鋼差庚 潤辞!\n\n)");
      
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
      
      System.out.println("25.陥製引 旭精 窒径戚 蟹神亀系 覗稽益轡聖 拙失馬獣神.\r\n" + 
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
   
   