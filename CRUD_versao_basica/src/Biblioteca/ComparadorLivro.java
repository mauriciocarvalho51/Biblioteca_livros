package Biblioteca;

import java.util.Comparator;

/**
 * A Classe Personagem representa um item(lutador).
 * As informações sobre o lutador são armazenadas e podem ser recuperadas.
 * Essa classe serve como uma super-classe para itens mais específicos.
 * 
 * @author Maurício Victor P. de Carvalho & Ricardo Melo Luz
 * @version 2013.07.05
 */

public class ComparadorLivro implements Comparator<Livro> {

	public static final int CODIGO=1;
	public static final int NOME=2;
	public static final int AUTOR=3;
	public static final int ASSUNTO=4;
	public static final int ANO=5;
	public static final int EDITORA=6;	
	private int tipo;
	
	public ComparadorLivro()
	{
		this.tipo = 1;
	}
	public ComparadorLivro(int tipo)
	{
		this.tipo = tipo;
	}
	@Override
	public int compare(Livro arg0, Livro arg1) {
		if(tipo==CODIGO)
			return (int) (arg0.getCodigo()-arg1.getCodigo());
		else if(tipo==NOME)
			return (arg0.getNome().compareTo(arg1.getNome()));
		else if(tipo==AUTOR)
			return (arg0.toString().compareTo(arg1.toString()));
		else if (tipo==ASSUNTO)
			return (arg0.getAssunto().compareTo(arg1.getAssunto()));
		else if(tipo==ANO)
			return (int) (arg0.getAno()-(arg1.getAno()));
		else if(tipo==EDITORA)
			return (arg0.getEditora().compareTo(arg1.getEditora() ));
		throw new IllegalArgumentException("Tipo Inválido");	
	}

}
