package SsangYong220822;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {
	public MyFrame2() {
		super("계산기");
		JButton btn_sum = new JButton("1에서 10까지 더하기");
		add(btn_sum);
		btn_sum.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int sum = 0;
				for (int i = 1; i < 11; i++) 
					sum += i;
				System.out.println(sum);
			}
		});
		setSize(300,200);
		setVisible(true);
	}
}

public class TeamExam_01 {

	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}
}
