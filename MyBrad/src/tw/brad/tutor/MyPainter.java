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
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import tw.brad.myclass.MyDrawer;

public class MyPainter extends JFrame{
	private JButton clear, undo, redo, saveJPG, saveObj, loadObj;
	private MyDrawer myDrawer;
	
	public MyPainter() {
		super("簽名");
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout());
		
		clear = new JButton("清除");
		undo = new JButton("上一步");
		redo = new JButton("復原");
		saveJPG = new JButton("存檔");
		saveObj = new JButton("存物件");
		loadObj = new JButton("載物件");
		top.add(clear); top.add(undo); top.add(redo);
		top.add(saveJPG); top.add(saveObj); top.add(loadObj);
		
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
		saveObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveObj();
			}
		});
		loadObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loadObj();
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
	
	private void saveObj() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			try {
				myDrawer.saveLines(file);
				JOptionPane.showMessageDialog(null, "存檔成功");
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "存檔失敗");
			}
		}
	}
	
	private void loadObj() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			try {
				myDrawer.loadLines(file);
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "載入失敗");
			}
		}
	}
	
	public static void main(String[] args) {
		new MyPainter();
	}

}
