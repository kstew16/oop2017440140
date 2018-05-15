package tew;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Fabulous frame");
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//EXIT_ON_CLOSE Static Variable 
		frame.setVisible(true);
		//프레임은 최상위 컨테이너, 다른 컨테이너 안에 포함될 수 없다.
		//JFrame JDialog JApplet

	}

}
