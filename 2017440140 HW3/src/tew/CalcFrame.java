
	package tew;

	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.*;

	public class CalcFrame extends JFrame implements ActionListener {
		
		JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0; //모든 메소드에서 접근 가능
		JButton plus,c,equal;
		JTextField numberField;
		int a=0,b=0,result=0;
		
		CalcFrame() {
			
			JLabel label = new JLabel("Calculator(Plus only)");
			this.numberField = new JTextField(10);
			JPanel p123 = new JPanel();
			JPanel p456 = new JPanel();
			JPanel p789 = new JPanel();
			JPanel p0ce = new JPanel();
			numberField.setText("0");
			
			this.setLayout(new FlowLayout());//플로우 배치 매니저 사용
			this.button1 = new JButton("1");
			button1.setActionCommand("button1");
			this.button2 = new JButton("2");
			button2.setActionCommand("button2");
			this.button3 = new JButton("3");
			button3.setActionCommand("button3");
			this.button4 = new JButton("4");
			button4.setActionCommand("button4");
			this.button5 = new JButton("5");
			button5.setActionCommand("button5");
			this.button6 = new JButton("6");
			button6.setActionCommand("button6");
			this.button7 = new JButton("7");
			button7.setActionCommand("button7");
			this.button8 = new JButton("8");
			button8.setActionCommand("button8");
			this.button9 = new JButton("9");
			button9.setActionCommand("button9");
			this.button0 = new JButton("0");
			button0.setActionCommand("button0");
			this.plus = new JButton("+");
			plus.setActionCommand("plus");
			this.c = new JButton("C");
			c.setActionCommand("c");
			this.equal = new JButton("=");
			equal.setActionCommand("equal");
			
			button1.addActionListener(this);
			button2.addActionListener(this);
			button3.addActionListener(this);
			button4.addActionListener(this);
			button5.addActionListener(this);
			button6.addActionListener(this);
			button7.addActionListener(this);
			button8.addActionListener(this);
			button9.addActionListener(this);
			button0.addActionListener(this);
			
			
			
			add(label);
			add(numberField);
			p123.add(button1); //여기 배치한게 순서
			p123.add(button2);
			p123.add(button3);
			p456.add(button4);
			p456.add(button5);
			p456.add(button6);
			p789.add(button7);
			p789.add(button8);
			p789.add(button9);
			p0ce.add(button0);
			p0ce.add(c);
			p0ce.add(plus);
			
			add(p0ce);
			add(p123);
			add(p456);
			add(p789);
			add(equal);
			

			setSize(200,300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//EXIT_ON_CLOSE Static Variable 
			setTitle("Calculator(+only)");
			setVisible(true);
			//프레임은 최상위 컨테이너, 다른 컨테이너 안에 포함될 수 없다.
			//JFrame JDialog JApplet
			
		}
		
		
		@Override
		public void actionPerformed(ActionEvent click) {
			// TODO Auto-generated method stub
			String mode = "a";
			String resultS;
			//아래 보면 getActionCommand로 가져오는거 있음
			if((click.getActionCommand()).equals("button1")) {
					if(mode.equals("a")) {
						a=a*10+1;
					}
					if(mode.equals("result")) {
						mode="a";
						a=1;
						b=0;
					}
				}
			if((click.getActionCommand()).equals("button2")) {
				if(mode.equals("a")) {
					a=a*10+2;
				}
				if(mode.equals("result")) {
					mode="a";
					a=2;
					b=0;
				}
				
			}
			
			if((click.getActionCommand()).equals("button3")) {
				if(mode.equals("a")) {
					a=a*10+3;
				}

				if(mode.equals("result")) {
					mode="a";
					a=3;
					b=0;
				}
			}
			if((click.getActionCommand()).equals("button4")) {
				if(mode.equals("a")) {
					a=a*10+4;
				}
				if(mode.equals("result")) {
					mode="a";
					a=4;
					b=0;
				}
			}
			if((click.getActionCommand()).equals("button5")) {
				if(mode.equals("a")) {
					a=a*10+5;
				}
				if(mode.equals("result")) {
					mode="a";
					a=5;
					b=0;
				}
				
			}
			if((click.getActionCommand()).equals("button6")) {
				if(mode.equals("a")) {
					a=a*10+6;
				}
				if(mode.equals("result")) {
					mode="a";
					a=6;
					b=0;
				}
			}
			if((click.getActionCommand()).equals("button7")) {
				if(mode.equals("a")) {
					a=a*10+7;
				}
				if(mode.equals("result")) {
					mode="a";
					a=7;
					b=0;
				}
			}
			if((click.getActionCommand()).equals("button8")) {
				if(mode.equals("a")) {
					a=a*10+8;
				}
				if(mode.equals("result")) {
					mode="a";
					a=8;
					b=0;
				}
			}
			if((click.getActionCommand()).equals("button9")) {
				if(mode.equals("a")) {
					a=a*10+9;
				}
				if(mode.equals("result")) {
					mode="a";
					a=9;
					b=0;
				}
			}
			if((click.getActionCommand()).equals("button0")) {
				if(mode.equals("a")) {
					a=a*10;
				}
				if(mode.equals("result")) {
					mode="a";
					a=0;
					b=0;
				}
			}
			if((click.getActionCommand()).equals("c")) {
				numberField.setText(null);
				mode="a";
				a=b=0;
				System.out.println("c눌림");
			}
			if((click.getActionCommand()).equals("equal")) {
				mode="result";
				numberField.setText(null);
				numberField.setText(toString(b));
				System.out.println("e누림");
			}
			if((click.getActionCommand()).equals("plus")) {
				if(mode.equals("result")) {
					a=b;
					b=0;
					numberField.setText(null);
					mode="a";
					System.out.println("p눌림");
				}
				if(mode.equals("a")) {
					b+=a;
					a=0;
					numberField.setText(null);
					numberField.setText(b+"+");
				}
			}
			
			
			//출력부
			if(mode.equals("a")){
				resultS = toString(a);
				numberField.setText(null);
				numberField.setText(resultS);
			}
			if(mode.equals("result")) {
			resultS = toString(result);
			numberField.setText(null);
			numberField.setText(resultS);
			}
		}


		private String toString(int result2) {
			// TODO Auto-generated method stub
			return ""+result2;
		}
	}

