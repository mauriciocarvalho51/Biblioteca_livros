package gui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import pojo.Livro;
import dao.BibliotecaDAO;

public class MyTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Livro> listadelivros;

	public MyTableModel() {
		BibliotecaDAO dao = new BibliotecaDAO();
		listadelivros = dao.findLivros();
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		return listadelivros.size();
	}

	@Override
	public Object getValueAt(int lin, int col) {
		Livro l = listadelivros.get(lin);
		switch (col) {
		case 0:
			return l.getCodlivro();
		case 1:
			return l.getNome();
		case 2:
			return l.getEscritor();
		default:
			return "*ERRO*";
		}		
	}
	
	@Override
	public String getColumnName(int col) {
		switch (col) {
		case 0:
			return "cod";
		case 1:
			return "nom";
		case 2:
			return "desc";
		default:
			return "*ERRO*";
		}
	}
}
