package tw.brad.tutor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.brad.myclass.MyDrawer;

public class MyPainter extends JFrame implements ActionListener{
	private JButton clear, undo, redo;
	private MyDrawer myDrawer;
	
	public MyPainter() {
		super("簽名");
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout());
		
		clear = new JButton("清除");
		undo = new JButton("上一步");
		redo = new JButton("復原");
		top.add(clear); top.add(undo); top.add(redo);
		
		add(top, BorderLayout.NORTH);
		myDrawer = new MyDrawer();
		add(myDrawer, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setListener();
	}
	
	private void setListener() {
		clear.addActionListener(this);
		undo.addActionListener(this);
		redo.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new MyPainter();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
