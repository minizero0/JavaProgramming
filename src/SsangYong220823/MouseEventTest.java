package SsangYong220823;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("마우스이벤트");
//		setLayout(new FlowLayout());
		JButton b = new JButton("이벤트");
		MyMouse ms = new MyMouse();
		b.setBackground(Color.RED);
		b.addMouseListener(ms);
		add(b);
		setSize(400,300);
		setVisible(true);
		
		
		
		
	}
}

class MyMouse implements MouseListener{
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("hello");
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public class MouseEventTest {

	public static void main(String[] args) {
		MyFrame m = new MyFrame();
	}
}
