

package tew;

import java.awt.FlowLayout;

import javax.swing.*;

public class MyFrame extends JFrame {
	MyFrame() {
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Fabulous 2nd frame");
		
		//���ο� ������Ʈ�� ����־��
		FlowLayout f1 = new FlowLayout();
		setLayout(f1);
		//���Ʒ��� ���� ���
		//setLayout(new FlowLayout());//�÷ο� ��ġ �Ŵ��� ���
		JButton button = new JButton("FaButton");//��ư ��ü ����
		JLabel label = new JLabel("��-ȭ");//���̺� ��ü�� ����
		JTextField tf = new JTextField(15);//�ؽ�Ʈ ��Ʈ
		
		button.addActionListener(new MyListener());
		
		tf.setText("���⿡ ���ø� �Է��ϼ���");
		
		
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(tf);
		
		//add(label);//���̺� ��ü�� Ǫ���ӿ� �߰�
		//add(tf);
		add(button); //���� ��ġ�Ѱ� ����
		add(panel);
		pack();
		
		tf.getText();
		
	}
}