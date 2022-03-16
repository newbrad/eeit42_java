package tw.brad.tutor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPainter extends JFrame{
	private JButton clear;
	
	public MyPainter() {
		super("簽名");
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout());
		
		clear = new JButton("清除");
		top.add(clear);
		
		add(top, BorderLayout.NORTH);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyPainter();
	}

}
