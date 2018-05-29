

package tew;

import java.awt.FlowLayout;

import javax.swing.*;

public class MyFrame extends JFrame {
	MyFrame() {
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Fabulous 2nd frame");
		
		//새로운 컴포넌트를 집어넣어보자
		FlowLayout f1 = new FlowLayout();
		setLayout(f1);
		//위아래가 같은 얘기
		//setLayout(new FlowLayout());//플로우 배치 매니저 사용
		JButton button = new JButton("FaButton");//버튼 객체 생성
		JLabel label = new JLabel("우-화");//레이블 객체를 생성
		JTextField tf = new JTextField(15);//텍스트 필트
		
		button.addActionListener(new MyListener());
		
		tf.setText("여기에 위시를 입력하세요");
		
		
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(tf);
		
		//add(label);//레이블 객체를 푸레임에 추가
		//add(tf);
		add(button); //여기 배치한게 순서
		add(panel);
		pack();
		
		tf.getText();
		
	}
}