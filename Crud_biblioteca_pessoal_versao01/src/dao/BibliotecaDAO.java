package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import pojo.Escritor;

public class BibliotecaDAO {

	public Escritor findEscritorByNacionalidade(String pais) {
		Escritor escritor = null;
		String cmd = "select * from autor where nacionalidade= ?";
		
		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			Properties props = new Properties();
			props.load(new FileInputStream("CRUD.properties"));
			String url = props.getProperty("url");
			
			db = DriverManager.getConnection(url, props);
			
			st = db.prepareStatement(cmd);
			st.setString(1, pais);
			rs = st.executeQuery();
			
			while (rs.next()) {
				int codautor = rs.getInt(1);
				String nome = rs.getString(2);
				String nacionalidade = rs.getString(3);
				escritor = new Escritor(codautor, nome, nacionalidade);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		try {
			if (rs != null) {
			rs.close();
			}
			if (st != null) {
			
			st.close();
			}
			if (db != null) {
			
			db.close();
			}
			} catch (Exception e2) {
			e2.printStackTrace();
			}
			}
		return escritor;
		}

	public void insertEscritor(Escritor c) {
		// TODO Auto-generated method stub
		
	}
}
