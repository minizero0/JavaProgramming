package SsangYong220822;
import java.awt.Button;
import java.awt.HeadlessException;

import javax.swing.JFrame;

class MyFrame extends JFrame{
	public MyFrame(String title) throws HeadlessException {
		super(title);
	}
}

public class JframTest {

	public static void main(String[] args) {
		MyFrame f = new MyFrame("창만들기 연습.");
		f.setSize(300, 600);
		System.out.println("hello");
		Button b = new Button("click");
		f.setVisible(true);
		f.add(b);
		
		
	}
}
