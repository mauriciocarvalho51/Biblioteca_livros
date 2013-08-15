package Biblioteca;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


/**
 * A Classe Personagem representa um item(lutador).
 * As informações sobre o lutador são armazenadas e podem ser recuperadas.
 * Essa classe serve como uma super-classe para itens mais específicos.
 * 
 * @author Maurício Victor P. de Carvalho & Ricardo Melo Luz
 * @version 2013.07.05
 */

public class CrudLivro {
	private List<Livro> listadelivros;
	
	public CrudLivro(){
		listadelivros = new LinkedList<Livro>();
		Serializacao serial = new Serializacao();
		try {
			serial.armazenarListaLivros(listadelivros);
			listadelivros = serial.recuperarListaLivros();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Livro> getListadelivros() {
		return listadelivros;
	}
		
	public boolean livroExiste(int codigo)
	{
		for(Livro correr: listadelivros)
		{
			if(correr.getCodigo()==(codigo))
			{
					return true;			
			}
		}
		return false;
	}
	
	public Livro buscarLivro(int num)
	{
		for(Livro it: listadelivros)
		{
			if(it.getCodigo()==(num))
				return it;			
		}
		return null;
	}
	
	private List<Livro> ordenaPorTipo(int tipo)
	{
		List<Livro> livrosOrdenados = new LinkedList<Livro>(listadelivros);
		Collections.sort(livrosOrdenados,new ComparadorLivro(tipo));
		return(livrosOrdenados);
	}

	public List<Livro> getAllOrdenadosPorCodigo()
	{
		return ( ordenaPorTipo(ComparadorLivro.CODIGO) );
	}
	
	public List<Livro> getAllOrdenadosPorNome()
	{
		return ( ordenaPorTipo(ComparadorLivro.NOME) );
	}
	
	public List<Livro> getAllOrdenadosPorAutor()
	{
		return ( ordenaPorTipo(ComparadorLivro.AUTOR) );
	}
	
	public List<Livro> getAllOrdenadosPorAssunto()
	{
		return ( ordenaPorTipo(ComparadorLivro.ASSUNTO) );
	}
	
	public List<Livro> getAllOrdenadosPorAno()
	{
		return ( ordenaPorTipo(ComparadorLivro.ANO) );
	}
	
	public List<Livro> getAllOrdenadosPorEditora()
	{
		return ( ordenaPorTipo(ComparadorLivro.EDITORA) );
	}
	
	private List<Livro> ordenaPorTipoInverso(int tipo)
	{
		List<Livro> livrosOrdenados = new LinkedList<Livro>(listadelivros);
		Collections.sort(livrosOrdenados,new ComparadorLivro(tipo));
		Collections.reverse(livrosOrdenados);
		return(livrosOrdenados);
	}

	public List<Livro> getAllOrdenadosPorCodigoInverso()
	{
		return ( ordenaPorTipoInverso(ComparadorLivro.CODIGO) );
	}
	
	public List<Livro> getAllOrdenadosPorNomeInverso()
	{
		return ( ordenaPorTipoInverso(ComparadorLivro.NOME) );
	}
	
	public List<Livro> getAllOrdenadosPorAutorInverso()
	{
		return ( ordenaPorTipoInverso(ComparadorLivro.AUTOR) );
	}
	
	public List<Livro> getAllOrdenadosPorAssuntoInverso()
	{
		return ( ordenaPorTipoInverso(ComparadorLivro.ASSUNTO) );
	}
	
	public List<Livro> getAllOrdenadosPorAnoInverso()
	{
		return ( ordenaPorTipoInverso(ComparadorLivro.ANO) );
	}
	
	public List<Livro> getAllOrdenadosPorEditoraInversa()
	{
		return ( ordenaPorTipoInverso(ComparadorLivro.EDITORA) );
	}
	/*
	public void iniciarLivros(){
		listadelivros.add(new Livro("Ferdinand Galliani", "Filosofia", 1719, "Homo'Sapiens"));
		listadelivros.add(new Livro("Primo Basílio", "Romance", 1929, "LPM Pocket"));
		listadelivros.add(new Livro("Odisséia", "Mitologia", 560, "Moderna"));
		listadelivros.add(new Livro("Crepúsculo dos Ídolos", "Filosofia", 1900, "LPM Pocket"));
		listadelivros.add(new Livro("Fausto", "Aforísmo", 1790, "LPM Pocket"));
		listadelivros.add(new Livro("O Anticristo", "Filosofia", 1896, "LPM Pocket"));
		listadelivros.add(new Livro("Crime & Castigo", "Romance", 1872, "SUMA de letras"));
		listadelivros.add(new Livro("O Discurso do método", "Filosofia", 1900, "Moderna"));
		listadelivros.add(new Livro("The Secret", "Filosofia", 2006, "LPM Pocket"));
		listadelivros.add(new Livro("Illíada", "Mitologia", 465, "De Bolso"));
	}*/
}
