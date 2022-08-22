package SsangYong220822;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame1 extends JFrame {
	public MyFrame1() {
		super("계산기");
		JButton btn_sum = new JButton("1에서 10까지 더하기");
		add(btn_sum);
		ActionListener me = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sum = 0;
				for (int i = 1; i < 11; i++)
					sum += i;
				System.out.println(sum);
			}
		};
		btn_sum.addActionListener(me);
		setSize(300,200);
		setVisible(true);
	}
}

public class TeamExam {

	public static void main(String[] args) {
		MyFrame1 f = new MyFrame1();
	}
}
