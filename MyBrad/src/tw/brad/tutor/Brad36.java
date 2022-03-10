package tw.brad.tutor;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Brad36 extends JFrame{
	private JTextField x, y;
	private JLabel result;
	
	public Brad36() {
		setLayout(new FlowLayout(FlowLayout.LEFT,100,0));
		x = new JTextField(4);
		y = new JTextField(4);
		JLabel addSign = new JLabel("+");
		JButton equ = new JButton("=");
		result = new JLabel();
		
		add(x); add(addSign); add(y); add(equ); add(result);
		
		equ.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doAdd();
			}
		});
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void doAdd() {
		String strX = x.getText();
		String strY = y.getText();
		int intX = Integer.parseInt(strX);
		int intY = Integer.parseInt(strY);
		int intResult = intX + intY;
		result.setText("" + intResult);
		
	}
	
	
	public static void main(String[] args) {
		new Brad36();
	}

}
