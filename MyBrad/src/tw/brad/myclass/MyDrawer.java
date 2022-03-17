package tw.brad.myclass;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	private LinkedList<LinkedList<HashMap<String,Integer>>> lines;
	
	public MyDrawer() {
		setBackground(Color.YELLOW);
		MyListener myListener = new MyListener();
		addMouseListener(myListener);
		addMouseMotionListener(myListener);
		lines = new LinkedList<>();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));
		
		for (LinkedList<HashMap<String,Integer>> line : lines) {
			for (int i=1;i<line.size();i++) {
				HashMap<String, Integer> p1 = line.get(i-1);
				HashMap<String, Integer> p2 = line.get(i);
				g2d.drawLine(p1.get("x"), p1.get("y"), p2.get("x"), p2.get("y"));			
			}			
		}
	}
	
	private class MyListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			HashMap<String, Integer> point = new HashMap<String, Integer>();
			point.put("x", e.getX()); point.put("y", e.getY());
			
			LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
			line.add(point);
			
			lines.add(line);
			repaint();
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			HashMap<String, Integer> point = new HashMap<String, Integer>();
			point.put("x", e.getX()); point.put("y", e.getY());
			lines.getLast().add(point);
			repaint();
		}
	}
	
}
