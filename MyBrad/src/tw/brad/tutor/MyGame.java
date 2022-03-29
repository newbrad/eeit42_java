package tw.brad.tutor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

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
		private Timer timer;
		private BufferedImage ballImg;
		private int viewW, viewH, ballW, ballH;
		private LinkedList<BallTask> balls;
		
		public MyPanel() {
			setBackground(Color.YELLOW);
			try {
				ballImg = ImageIO.read(new File("dir1/ball.png"));
				ballW = ballImg.getWidth(); ballH = ballImg.getHeight();
			}catch(Exception e) {}
			
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					createBall(e.getX(), e.getY());
				}
			});
			balls = new LinkedList<>();
			timer = new Timer();
			timer.schedule(new RefreshTask(), 0, 30);
		}
		
		private void createBall(int clickX, int clickY) {
			BallTask ball = new BallTask(clickX, clickY, 
					(int)Math.random()*9-4, (int)Math.random()*9-4);
			balls.add(ball);
			timer.schedule(ball, 1*1000, 20);
		}
		
		private class BallTask extends TimerTask {
			private int ballX, ballY, dx, dy;
			BallTask(int ballX,int ballY,int dx,int dy){
				this.ballX = ballX - ballW/2; this.ballY = ballY - ballH/2;
				this.dx = dx; this.dy = dy;
			}
			@Override
			public void run() {
				if (ballX < 0 || ballX + ballW > viewW) {
					dx *= -1;
				}
				if (ballY < 0 || ballY + ballH > viewH) {
					dy *= -1;
				}
				ballX += dx;
				ballY += dy;
			}
		}
		
		private class RefreshTask extends TimerTask {
			@Override
			public void run() {
				repaint();
			}
		}
		
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			viewW = getWidth(); viewH = getHeight();
			Graphics2D g2d = (Graphics2D)g;
			for(BallTask ball : balls) {
				g2d.drawImage(ballImg, ball.ballX, ball.ballY, null);
			}
		}
	}
	
	public static void main(String[] args) {
		new MyGame();
	}

}
