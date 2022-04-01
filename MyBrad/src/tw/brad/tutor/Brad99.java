package tw.brad.tutor;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Brad99 extends JFrame {
	private JTable table;
	private MyModel myModel;
	
	public Brad99() {
		
		setLayout(new BorderLayout());
		
		myModel = new MyModel();
		table = new JTable(myModel);
		JScrollPane jsp = new JScrollPane(table);
		add(jsp, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class MyModel extends DefaultTableModel {
		@Override
		public int getColumnCount() {
			return 4;
		}
		
		@Override
		public String getColumnName(int column) {
			return "Name" + column;
		}
		
		@Override
		public int getRowCount() {
			return 40;
		}

		@Override
		public Object getValueAt(int row, int column) {
			return "data(" + row + "," + column + ")";
		}
		
		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		new Brad99();
	}

}
