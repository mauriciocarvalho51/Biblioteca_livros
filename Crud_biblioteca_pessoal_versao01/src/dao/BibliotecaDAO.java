package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import pojo.Escritor;
import pojo.Livro;

public class BibliotecaDAO {

	public Escritor findEscritorByNome(String name) {
		Escritor escritor = null;
		String cmd = "select * from autor where nome= ?";
		
		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			Properties props = new Properties();
			props.load(new FileInputStream("CRUD.properties"));
			String url = props.getProperty("url");
			
			db = DriverManager.getConnection(url, props);
			
			st = db.prepareStatement(cmd);
			st.setString(2, name);
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

	public void insertEscritor(Escritor escritor) {
			String cmd = "insert into autor(nome, nacionalidade) values (?, ?)";

			Connection db = null;
			PreparedStatement st = null;

			try {
				// abrir conexão
				Properties props = new Properties();
				props.load(new FileInputStream("CRUD.properties"));
				String url = props.getProperty("url");

				db = DriverManager.getConnection(url, props);

				st = db.prepareStatement(cmd);
				st.setString(1, escritor.getNome());
				st.setString(2, escritor.getNacionalidade());
				int r = st.executeUpdate();

				if (r != 1) {
					throw new RuntimeException("Erro ao inserir Autor!");
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
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
		
	}
	
	public List<Escritor> findEscritorByNacionalidade(String pais) {
		String cmd = "select * from autor where nacionalidade= ?";
		List<Escritor> autores = new ArrayList<Escritor>();
		
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
				autores.add(new Escritor(codautor, nome, nacionalidade));
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
		return autores;
	}

	public List<Livro> findLivros() {
		//String cmd = "select * from livro";
		String cmd = "select * from livro, autor where livro.cod_autor = autor.cod_autor";
		List<Livro> livros = new ArrayList<Livro>();
		
		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			Properties props = new Properties();
			props.load(new FileInputStream("CRUD.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			//st.setString(1, pais);
			rs = st.executeQuery();

			while (rs.next()) {
				int codlivro = rs.getInt(1);
				String nome = rs.getString(2);
				int codescritor = rs.getInt(3);
				String escritor = rs.getString(5);
				livros.add(new Livro(codlivro, nome, codescritor, escritor));
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
		return livros;
	}
	
}
