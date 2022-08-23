package SsangYong220823;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame1 extends JFrame {
	public MyFrame1() {
		setTitle("마우스이벤트");
//		setLayout(new FlowLayout());
		JButton b = new JButton("이벤트");
		b.addMouseListener(new MouseListener() {  //익명클래스 
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("click");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("pressed");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		b.setBackground(Color.RED);
		add(b);
		setSize(400,300);
		setVisible(true);
	}
}

public class MouseEventTest02 {

	public static void main(String[] args) {
		MyFrame1 m = new MyFrame1();
	}
}
