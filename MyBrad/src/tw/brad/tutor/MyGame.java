package tw.brad.tutor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyGame extends JFrame{
	private MyPanel myPanel;
	
	public MyGame() {
		setLayout(new BorderLayout());
		
		myPanel = new MyPanel();
		add(myPanel, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class MyPanel extends JPanel {
		private BufferedImage ballImg;
		public MyPanel() {
			setBackground(Color.YELLOW);
			try {
			ballImg = ImageIO.read(new File("dir1/ball.png"));
			}catch(Exception e) {}
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D)g;
			g2d.drawImage(ballImg, 100, 100, null);
		}
	}
	
	public static void main(String[] args) {
		new MyGame();
	}

}
