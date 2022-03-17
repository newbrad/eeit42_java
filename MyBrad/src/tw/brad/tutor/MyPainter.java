package tw.brad.tutor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.brad.myclass.MyDrawer;

public class MyPainter extends JFrame{
	private JButton clear, undo, redo, saveJPG;
	private MyDrawer myDrawer;
	
	public MyPainter() {
		super("簽名");
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout());
		
		clear = new JButton("清除");
		undo = new JButton("上一步");
		redo = new JButton("復原");
		saveJPG = new JButton("存檔");
		top.add(clear); top.add(undo); top.add(redo);
		top.add(saveJPG);
		
		add(top, BorderLayout.NORTH);
		myDrawer = new MyDrawer();
		add(myDrawer, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setListener();
	}
	
	private void setListener() {
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				undo();
			}
		});
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				redo();
			}
		});
		saveJPG.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveJPG();
			}
		});
	}
	
	private void clear() {
		myDrawer.clear();
	}
	private void undo() {
		myDrawer.undo();
	}
	private void redo() {
		myDrawer.redo();
	}
	private void saveJPG() {
		BufferedImage img = new BufferedImage(
				myDrawer.getWidth(), myDrawer.getHeight(), 
				BufferedImage.TYPE_INT_RGB);
		Graphics g = img.createGraphics();
		myDrawer.paint(g);
		
		try {
			ImageIO.write(img, "jpg", new File("dir1/brad.jpg"));
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
	}
	
	public static void main(String[] args) {
		new MyPainter();
	}

}
