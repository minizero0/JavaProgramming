package SsangYong220822;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyEvent implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		System.out.println("눌러짐");
	}
}

class MyFrame1 extends JFrame {
	public MyFrame1() {
		super("계산기");
		JButton btn_sum = new JButton("1~10까지 더하기");
		JButton btn_sum1 = new JButton("Test");
		add(btn_sum, BorderLayout.NORTH);
		add(btn_sum1, BorderLayout.SOUTH);
		MyEvent me = new MyEvent();
		btn_sum.addActionListener(me);
		setSize(300,200);
		setVisible(true);

	}
	
}

public class JFrameTest02 {

	public static void main(String[] args) {
		MyFrame1 f = new MyFrame1();
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
