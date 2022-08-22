package SsangYong220822;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

class Msdos extends JFrame{
	public Msdos() {
		setTitle("숙제 : 마우스리스너");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b = new JButton("마우스이벤트");
		MyMouseListener listener = new MyMouseListener();
		b.setBackground(new Color(255,128,0));
		b.addMouseListener(listener);
		
		add(b);
		
		setSize(400, 300);
		setVisible(true);
	}
}

class MyMouseListener implements MouseListener{  //MouseLister의 추상 메소드 모두 오버라이딩
    @Override
	public void mouseClicked(MouseEvent e) { //마우스 클릭
    	System.out.println("Click"); 		
    	JButton b = (JButton)e.getSource();
    	b.setBackground(Color.RED);
    }

    public void mousePressed(MouseEvent e) {  //마우스 눌러졌을때
    	System.out.println("pressed");
    }

    public void mouseReleased(MouseEvent e) { //눌러진 버튼이 떨어질때
    }

    public void mouseEntered(MouseEvent e) {  //마우스가 컴포넌트 위에 올라갈때
    	System.out.println("Entered");
//        JButton b = (JButton)e.getSource();
//        b.setBackground(Color.RED);
    }

    public void mouseExited(MouseEvent e) {  //마우스가 컴포넌트에서 내려올때
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
