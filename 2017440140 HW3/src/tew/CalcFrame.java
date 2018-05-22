
	package tew;

	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.*;

	public class CalcFrame extends JFrame implements ActionListener {
		
		JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0; //모든 메소드에서 접근 가능
		JButton plus,c,equal;
		JTextField numberField;
		int result=0;
		
		public String tostring() {
			return("="+result);
			
		}
		CalcFrame() {
			
			JLabel label = new JLabel("Calculator(Plus only)");
			this.numberField = new JTextField(25);

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
			add(button1); //여기 배치한게 순서
			add(button2);
			add(button3);
			add(button4);
			add(button5);
			add(button6);
			add(button7);
			add(button8);
			add(button9);
			add(button0);
			add(plus);
			add(c);
			add(equal);

			setSize(300,200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//EXIT_ON_CLOSE Static Variable 
			setTitle("Calculator(+only)");
			setVisible(true);
			//프레임은 최상위 컨테이너, 다른 컨테이너 안에 포함될 수 없다.
			//JFrame JDialog JApplet
			pack();
		}

		@Override
		public void actionPerformed(ActionEvent click) {
			// TODO Auto-generated method stub
			//아래 보면 getActionCommand로 가져오는거 있음
			if((click.getActionCommand()).equals("button1")) {
				
				}
			if((click.getActionCommand()).equals("button2")) {
				
			}
			String result;
			result =this.tostring();
			numberField.setText(result);
		}
	}

