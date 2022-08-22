package SsangYong220822;
import java.awt.Button;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
class MyFrame1 extends JFrame{
	public MyFrame1() {
		super("계산기");
		setSize(300,200);
		setVisible(true);
	}
}

public class JFrameTest02 {

	public static void main(String[] args) {
		MyFrame1 f = new MyFrame1();
		JButton btn_sum = new JButton("1~10까지 더하기");
		f.add(btn_sum);
	}
}


//class MyFrame1 {
//	JFrame frame = new JFrame("계산기");
//	public void createFrame() {
//		frame.setSize(300, 200);
//		frame.setVisible(true);
//	}
//}
//
//public class JFrameTest02 {
//
//	public static void main(String[] args) {
//		MyFrame1 f = new MyFrame1();
//		f.createFrame();
//
//		
//		
//	}
//}
