package tew;

   import java.awt.FlowLayout;
   import java.awt.event.ActionEvent;
   import java.awt.event.ActionListener;
   import javax.swing.*;

   public class CalcFrame extends JFrame implements ActionListener {
      JButton bn[] = new JButton[10];
      JButton arithbutton[] = new JButton[4];
      JButton   buttonc,buttonequal;
      JTextField numberField;
      int a=0,b=0,result=0;
      int lastAction=0;
      
      //int���� �����ϴ� ���� integer�� ����. ������ ���������Ƿ�...
      private String toString(int numb) {
          return (""+numb);
       }
      
      CalcFrame() {
         JLabel label = new JLabel("���ϱ� �ϴ� ����)");
         this.numberField = new JTextField(15);
         JPanel p123 = new JPanel();
         JPanel p456 = new JPanel();
         JPanel p789 = new JPanel();
         JPanel p0ce = new JPanel();
         
         for(int i=0;i<10;i++) {
            this.bn[i]=new JButton(this.toString(i));
            bn[i].setActionCommand("button"+this.toString(i));
            bn[i].addActionListener(this);
         }       
         
         //Arithmetics
         this.arithbutton[0] = new JButton("+");
         this.arithbutton[1] = new JButton("-");
         this.arithbutton[2] = new JButton("*");
         this.arithbutton[3] = new JButton("/");
         
         for(int i=0;i<4;i++) {
             arithbutton[i].setActionCommand(this.toString(i));
             arithbutton[i].addActionListener(this);
          }
         
         this.setLayout(new FlowLayout());
         ///ce�κ�
         
         this.buttonc = new JButton("C");
         buttonc.setActionCommand("buttonc");
         this.buttonequal = new JButton("=");
         buttonequal.setActionCommand("buttonequal");  
         


         

         buttonequal.addActionListener(this);
         buttonc.addActionListener(this);
         
         add(label);
         add(numberField);
         
         
         for(int i=0;i<10;i++) {
            if(i<4&&i>0)
               p123.add(bn[i]);
            if(i>3&&i<7)
               p456.add(bn[i]);
            if(i>6&&i<10)
               p789.add(bn[i]);
         }
         
         p0ce.add(bn[0]);
         p0ce.add(buttonc);
         p0ce.add(buttonequal);
         add(p0ce);
         add(p123);
         add(p456);
         add(p789);
         
         //Arith ��ư �� �ٿ� �߰�
         p0ce.add(arithbutton[0]);
         p123.add(arithbutton[1]);
         p456.add(arithbutton[2]);
         p789.add(arithbutton[3]);
         
         
         setSize(200,270);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setTitle("J����by������");
         setVisible(true);   
      }
      
      @Override
      public void actionPerformed(ActionEvent click) {
    	  
         String arith = "a",answer;
         int lastinput=0;
         
        //��Ģ�����ư 0�� ���ϱ� 1�� ���� 2�� ���ϱ� 3�� ������
         
         if((click.getActionCommand()).equals("0")) {
        	 System.out.println("������������ �Ƹ����� �޶�?"+ arith);
        	 System.out.println("����������"+"a"+a+"b"+b+lastAction+arith);
            if(arith.equals("result")) {
               b=result;
              // numberField.setText(toString(a));
              // b=0;
               arith="a";
            }
            else if(arith.equals("a")) {
               b=a;
               a=0;
               arith="plus";
               numberField.setText("+");
            }
            else if(arith.equals("plus")) {
                b+=a;
                a=0;
                arith="plus";
                numberField.setText("+");
             }
            lastAction=0;
            System.out.println(lastAction);
         }   
         if((click.getActionCommand()).equals("1")) {
             if(arith.equals("result")) {
                b=result;
               // numberField.setText(toString(a));
               // b=0;
                arith="a";
             }
             else if(arith.equals("a")) {
            	
                b=a;
                a=0;
                arith="minus";
                numberField.setText("-");
             }
             else if(arith.equals("minus")) {
                 b-=a;
                 a=0;
                 arith="minus";
                 numberField.setText("-");
              }
             lastAction=1;
             System.out.println(lastAction);
          }
         
         if((click.getActionCommand()).equals("2")) {
        	 System.out.println(arith);
             if(arith.equals("result")) {
            	 System.out.println("�ٲ�ºκи���");
                b=result;
               // numberField.setText(toString(a));
               // b=0;
                arith="a";
             }
             else if(arith.equals("a")) {
                b=a;
                a=0;
                arith="complex";
                numberField.setText("*");
             }
             else if(arith.equals("complex")) {
                 b*=a;
                 a=0;
                 arith="complex";
                 numberField.setText("x");
              }
             lastAction=2;
             System.out.println(lastAction);
          }
         
         if((click.getActionCommand()).equals("3")) {
             if(arith.equals("result")) {
                b=result;
               // numberField.setText(toString(a));
                //b=0;
                arith="a";
             }
             else if(arith.equals("a")) {
                b=a;
                a=0;
                arith="divide";
                numberField.setText("/");
             }
             else if(arith.equals("divide")) {
                 b/=a;
                 a=0;
                 arith="divide";
                 numberField.setText("/");
              }
             lastAction=3;
             System.out.println(lastAction);
          }
         //�����Էº�
         for(int i=0;i<10;i++) {
            if((click.getActionCommand()).equals(("button"+this.toString(i)))) {
               if(arith.equals("a")) {
                  a=a*10+i;
               }
               if(arith.equals("result")) {
                  //arith="a";
                  a=i;
                  //b=0;
               }
            }
         }
         //C��ư
         if((click.getActionCommand()).equals("buttonc")) {
            numberField.setText(null);
            a=b=result=0;
            arith="a";
         }
         //=��ư
         if((click.getActionCommand()).equals("buttonequal")) {
        	 
        	 lastinput=a;
            System.out.println("����������"+"a"+a+"b"+b+lastAction+arith);
            
            switch(lastAction) {
            case 0 : b=b+a+result;
            	break;
            case 1 : b=b-a+result;
            	break;
            case 2 : b=b*a+result;
            	break;
            case 3 : b=b/a+result;
            	break;
            }
            arith="result";
            result=b;
            numberField.setText(toString(b));
            a=b=0;
            System.out.println("����� �������žƳľƸ���"+ arith);
         }
 
         
         
         if(arith.equals("a")){
            answer = toString(a);
            numberField.setText(answer);
         }
         
         if(arith.equals("result")) {
            answer = toString(result);
         numberField.setText(answer);
         }
         System.out.println(" a�� "+a+" b�� "+b+" result�� "+result+arith);
      }
      //���ӿ����� �������� �̤�
   }