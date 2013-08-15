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

public class ComparadorEscritor implements Comparator<Escritor> {
	public static final int CODIGO=1;
	public static final int NOME=2;
	public static final int NACIONALIDADE=3;
	private int tipo;
	
	public ComparadorEscritor()
	{
		this.tipo = 1;
	}
	public ComparadorEscritor(int tipo)
	{
		this.tipo = tipo;
	}
	
	@Override
	public int compare(Escritor arg0, Escritor arg1) {
		if(tipo==CODIGO)
			return (int) ( arg0.getCodigo()-(arg1.getCodigo() ));
		else if(tipo==NOME)
			return ( arg0.getNome().compareTo(arg1.getNome() ));
		else if(tipo==NACIONALIDADE)
			return ( arg0.getNacionalidade().compareTo( arg1.getNacionalidade() ));
		throw new IllegalArgumentException("Tipo Inválido");
	}

}
