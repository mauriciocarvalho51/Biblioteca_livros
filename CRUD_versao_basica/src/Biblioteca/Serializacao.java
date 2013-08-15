package Biblioteca;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import emprestimo.Emprestimo;

public class Serializacao {
	//CrudEscritor listadeescritores;
	
	public Serializacao() {
		//listadeescritores = new CrudEscritor();
	}
	
	public void armazenarListaEscritores( List<Escritor> listinha) throws Exception {
		
		try (FileOutputStream outfile = new FileOutputStream("C:\\PROGRAMA\\listas.txt")) {
			try (ObjectOutputStream outobj = new ObjectOutputStream(outfile)) {
				outobj.writeObject( listinha );
			}
			outfile.close();
		}
	}
	
	public List<Escritor> recuperarListaEscritores() throws Exception {
		List<Escritor> lista = null;
		try (FileInputStream infile = new FileInputStream("C:\\PROGRAMA\\listas.txt")) {
			try (ObjectInputStream inobj = new ObjectInputStream(infile)) {
				lista = (List<Escritor>) inobj.readObject();
			}
			infile.close();
		}
		return lista;
	}
	
	public void armazenarListaLivros( List<Livro> listinha) throws Exception {
		
		try (FileOutputStream outfile = new FileOutputStream("C:\\PROGRAMA\\listas.txt")) {
			try (ObjectOutputStream outobj = new ObjectOutputStream(outfile)) {
				outobj.writeObject( listinha );
			}
			outfile.close();
		}
	}
	
	public List<Livro> recuperarListaLivros() throws Exception {
		List<Livro> lista = null;
		try (FileInputStream infile = new FileInputStream("C:\\PROGRAMA\\listas.txt")) {
			try (ObjectInputStream inobj = new ObjectInputStream(infile)) {
				lista = (List<Livro>) inobj.readObject();
			}
			infile.close();
		}
		return lista;
	}
	
	public void armazenarListaEmprestimos( List<Emprestimo> listinha) throws Exception {
		
		try (FileOutputStream outfile = new FileOutputStream("C:\\PROGRAMA\\listas.txt")) {
			try (ObjectOutputStream outobj = new ObjectOutputStream(outfile)) {
				outobj.writeObject( listinha );
			}
			outfile.close();
		}
	}
	
	public List<Emprestimo> recuperarListaEmprestimos() throws Exception {
		List<Emprestimo> lista = null;
		try (FileInputStream infile = new FileInputStream("C:\\PROGRAMA\\listas.txt")) {
			try (ObjectInputStream inobj = new ObjectInputStream(infile)) {
				lista = (List<Emprestimo>) inobj.readObject();
			}
			infile.close();
		}
		return lista;
	}
}
