
	package tew;

	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.*;

	public class CalcFrame extends JFrame implements ActionListener {
		
		JButton button; //��� �޼ҵ忡�� ���� ����
		JButton button2;
		JTextField tf;
		int a=0;
		
		CalcFrame() {
			
			JLabel label = new JLabel("��-ȭ");
			this.tf = new JTextField(25);

			tf.setText("���⿡ ���ø� �Է��ϼ���");
			
			this.setLayout(new FlowLayout());//�÷ο� ��ġ �Ŵ��� ���
			this.button = new JButton("FaButton");
			button.setActionCommand("button1");
			this.button2 = new JButton("Able");
			button2.setActionCommand("button2");
			
			button.addActionListener(this);
			button2.addActionListener(this);
			
			add(label);
			add(tf);
			add(button); //���� ��ġ�Ѱ� ����
			add(button2);

			setSize(600,200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Fabulous 3rd frame");
			setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent click) {
			// TODO Auto-generated method stub
			//�Ʒ� ���� getActionCommand�� �������°� ����
			if((click.getActionCommand()).equals("button1")) {
				button.setText("����FaButtion");
				}
			else if((fable.getActionCommand()).equals("button2")) {
				button2.setText("����Able");
			}
			a++;
			System.out.println("��ư�� " + a + "�� ���Ⱦ��");
			tf.setText("��ư ������ ���� ���� �Է������ �Ф�");
		}
	}

