package tw.brad.tutor;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Brad99 extends JFrame {
	private JTable table;
	private MyModel myModel;
	private String[] header = {"編號","名稱","地址","電話"};
	
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
		private ResultSet rs;
		private int rowCount;
		
		public MyModel() {
			getDBData();
		}
		
		private void getDBData() {
			Properties prop = new Properties();
			prop.put("user", "root"); prop.put("password", "root");
			
			String sql = "SELECT * FROM foods";
			try {
				Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/iii", prop);
				PreparedStatement ps = conn.prepareStatement(
						sql,
						ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_READ_ONLY);
				
				rs = ps.executeQuery();
				rs.last();
				rowCount = rs.getRow();
				
				
			}catch(Exception e) {
				System.out.println(e.toString());
			}
			
		}
		
		@Override
		public int getColumnCount() {
			return 4;
		}
		
		@Override
		public String getColumnName(int column) {
			return header[column];
		}
		
		@Override
		public int getRowCount() {
			return rowCount;
		}

		@Override
		public Object getValueAt(int row, int column) {
			String ret;
			try {
				rs.absolute(row + 1);
				ret = rs.getString(column+1);
			}catch(Exception e) {
				ret = "XXX";
			}
			return ret;
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
