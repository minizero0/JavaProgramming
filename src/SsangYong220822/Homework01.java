package SsangYong220822;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

class Msdos extends JFrame{
	public Msdos() {
		setTitle("숙제 : 마우스리스너");
		this.setLayout(new FlowLayout());
		JButton b = new JButton("마우스이벤트");
		MyMouseListener listener = new MyMouseListener();
		b.setBackground(Color.YELLOW);
		b.addMouseListener(listener);
		
		add(b);
		
		setSize(400, 300);
		setVisible(true);
	}
}

class MyMouseListener implements MouseListener{
    @Override
	public void mouseClicked(MouseEvent e) {
    	System.out.println("Click");
    	JButton b = (JButton)e.getSource();
    	b.setBackground(Color.RED);
    }

    public void mousePressed(MouseEvent e) {
    	System.out.println("pressed");
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    	System.out.println("Entered");
//        JButton b = (JButton)e.getSource();
//        b.setBackground(Color.RED);
    }

    public void mouseExited(MouseEvent e) {
    	System.out.println("Exited");
//        JButton b = (JButton)e.getSource();
//        b.setBackground(Color.YELLOW);
    }
}

public class Homework01 {

	public static void main(String[] args) {
		new Msdos();

	}
}
