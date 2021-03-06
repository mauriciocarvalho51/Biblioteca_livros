package biblioteca_pessoal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import pojo.Escritor;

public class JDBCTeste {

	// http://jdbc.postgresql.org/documentation/head/connect.html
	public static void main(String[] args) throws SQLException,
		FileNotFoundException, IOException {
		Properties props = new Properties();
		props.load(new FileInputStream("CRUD.properties"));
		String url = props.getProperty("url");
		
		Connection db = DriverManager.getConnection(url, props);
		System.out.println("Conectado!");
		
		String nacio = "Alemanha";
		String cmd = "select * from autor where nacionalidade = ?";
		PreparedStatement st = db.prepareStatement(cmd);
		st.setString(1, nacio);
		ResultSet rs = st.executeQuery();
		
		
		while (rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}	
		
		
		
		rs.close();
		st.close();
	}
}
