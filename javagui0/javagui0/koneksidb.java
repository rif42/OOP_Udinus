package javagui0;

import java.sql.*;

public class koneksidb {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1/penjualan";
	static final String USER = "root";
	static final String PASS = " ";
	
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	
	public static void main(String[] args) {
		String kodebarang = "brg14";
		String nama_brg = "penghapus";
		String satuan = "pcs";
		int stock_brg = 50;
		int stock_min = 1;
		
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			String q = "INSERT INTO barang (kodebarang, nama_brg, satuan, stock_brg, stock_min) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(q);
			
			ps.setString(1, kodebarang);
			ps.setString(2, nama_brg);
			ps.setString(3, satuan);
			ps.setInt(4, stock_brg);
			ps.setInt(5, stock_min);
			
			ps.execute();
			
			rs = stmt.executeQuery("SELECT * FROM barang");
			int i = 1;
			while (rs.next()) {
				System.out.println("Data ke-" + i);
				System.out.println("Kode barang: " + rs.getString("kodebarang"));
				System.out.println("Nama barang: " + rs.getString("nama_brg"));
				System.out.println("Satuan : " + rs.getString("satuan"));
				System.out.println("Stock barang: " + rs.getString("stock_brg"));
				System.out.println("Stock minimal: " + rs.getString("stock_min"));
				i++;
			}
			
			stmt.close();
			
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
