package biblioteca_pessoal_teste;

import pojo.Escritor;
import dao.BibliotecaDAO;

public class BibliotecaDAOTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BibliotecaDAO dao = new BibliotecaDAO();
		
		/*
		Escritor escritor = new Escritor("E�a", "Portugal");
		dao.insertEscritor(escritor);
		
		System.out.println( dao.findEscritorByNacionalidade("Portugal") );
		*/
		
		System.out.println(dao.findLivros());
	}

}
