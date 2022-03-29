package tw.brad.tutor;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame{
	private JButton goButton;
	private JLabel[] lanes = new JLabel[8];
	private Car[] cars = new Car[8];
	
	public Racing() {
		setLayout(new GridLayout(9, 1));
	
		goButton = new JButton("Go!");
		add(goButton);
		
		for (int i=0; i<lanes.length; i++) {
			lanes[i] = new JLabel((i+1) + ". ");
			add(lanes[i]);
		}
		
		goButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		
		setSize(1024, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void go() {
		for (int i=0; i<8; i++) {
			cars[i] = new Car(i);
			cars[i].start();
		}
	}
	
	private class Car extends Thread {
		private int lane;
		private StringBuffer sb;
		
		Car(int lane){
			this.lane = lane;
			sb = new StringBuffer(" " +(lane + 1) + ". ");
		}
		
		@Override
		public void run() {
			for (int i=0; i<100; i++) {
				sb.append(">");
				lanes[lane].setText(sb.toString());
				try {
					Thread.sleep(10 + (int)(Math.random()*200));
				}catch (InterruptedException e) {
				}
			}
		}
	}

	public static void main(String[] args) {
		new Racing();
	}

}
