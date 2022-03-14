package tw.brad.tutor;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumber extends JFrame{
	private JTextField input;
	private JButton guess;
	private JTextArea log;
	
	public GuessNumber() {
		super("猜數字遊戲");
		setLayout(new BorderLayout());
		
		input = new JTextField();
		guess = new JButton("猜");
		log = new JTextArea();
		
		add(log, BorderLayout.CENTER);
		
		JPanel top = new JPanel(new BorderLayout());
		add(top, BorderLayout.NORTH);
		
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GuessNumber();
	}

}
