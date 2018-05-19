
	package tew;

	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.*;

	public class CalcFrame extends JFrame implements ActionListener {
		
		JButton button; //모든 메소드에서 접근 가능
		JButton button2;
		JTextField tf;
		int a=0;
		
		CalcFrame() {
			
			JLabel label = new JLabel("우-화");
			this.tf = new JTextField(25);

			tf.setText("여기에 위시를 입력하세요");
			
			this.setLayout(new FlowLayout());//플로우 배치 매니저 사용
			this.button = new JButton("FaButton");
			button.setActionCommand("button1");
			this.button2 = new JButton("Able");
			button2.setActionCommand("button2");
			
			button.addActionListener(this);
			button2.addActionListener(this);
			
			add(label);
			add(tf);
			add(button); //여기 배치한게 순서
			add(button2);

			setSize(600,200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Fabulous 3rd frame");
			setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent click) {
			// TODO Auto-generated method stub
			//아래 보면 getActionCommand로 가져오는거 있음
			if((click.getActionCommand()).equals("button1")) {
				button.setText("눌린FaButtion");
				}
			else if((fable.getActionCommand()).equals("button2")) {
				button2.setText("눌린Able");
			}
			a++;
			System.out.println("버튼이 " + a + "번 눌렸어요");
			tf.setText("버튼 누르지 말고 위시 입력해줘요 ㅠㅠ");
		}
	}

