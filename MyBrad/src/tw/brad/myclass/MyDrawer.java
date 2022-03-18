package tw.brad.myclass;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	private LinkedList<LinkedList<HashMap<String,Integer>>> lines, recycle;
	
	public MyDrawer() {
		setBackground(Color.YELLOW);
		MyListener myListener = new MyListener();
		addMouseListener(myListener);
		addMouseMotionListener(myListener);
		lines = new LinkedList<>();
		recycle = new LinkedList<>();
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
			
			recycle.clear();
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			HashMap<String, Integer> point = new HashMap<String, Integer>();
			point.put("x", e.getX()); point.put("y", e.getY());
			lines.getLast().add(point);
			repaint();
		}
	}
	
	public void clear() {
		lines.clear();
		repaint();
	}
	public void undo() {
		if (lines.size()>0) {
			recycle.add(lines.removeLast());
			repaint();
		}
	}
	public void redo() {
		if (recycle.size()>0) {
			lines.add(recycle.removeLast());
			repaint();
		}
	}
	
	public void saveV2() {
		BufferedImage img = new BufferedImage(
				getWidth(), getHeight(), 
				BufferedImage.TYPE_INT_RGB);
		Graphics g = img.createGraphics();
		paint(g);
		
		try {
			ImageIO.write(img, "jpg", new File("dir1/brad.jpg"));
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void saveLines(File svaeFile) throws Exception {
		ObjectOutputStream oout = 
			new ObjectOutputStream(new FileOutputStream(svaeFile));
		oout.writeObject(lines);
		oout.flush();
		oout.close();
	}
	
	public void loadLines(File loadFile) throws Exception{
		ObjectInputStream oin = 
			new ObjectInputStream(new FileInputStream(loadFile));
		Object obj = oin.readObject();
		oin.close();
		
		lines = (LinkedList<LinkedList<HashMap<String,Integer>>>)obj;
		repaint();
		
	}
	
	
	
	
	
}
