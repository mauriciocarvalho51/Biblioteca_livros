package emprestimo;

import Biblioteca.Livro;

/**
 * A Classe Personagem representa um item(lutador).
 * As informa��es sobre o lutador s�o armazenadas e podem ser recuperadas.
 * Essa classe serve como uma super-classe para itens mais espec�ficos.
 * 
 * @author Maur�cio Victor P. de Carvalho & Ricardo Melo Luz
 * @version 2013.07.05
 */

public class Emprestimo  implements java.io.Serializable {
	
	private static int codigo=1;
	private int cod;
	private Leitor leitor;
	private Livro livroemprestado;
	private String dataemprestimo;
	private String datadevolucao;
	
	/**
	 * inicializando as informa��es sobre o MONSTRO.
	 * @param cod � numero do monstro.
	 * @param nom � o nome do monstro.
	 */
	public Emprestimo(Leitor leitor, Livro livro, String dia) {
		this.cod = codigo++;
		this.leitor = leitor;
		this.livroemprestado = livro;
		this.dataemprestimo = dia;
		this.datadevolucao = dia+90;
	}

	/**
     * @return o codigo do monstro.
     */
	public Leitor getLeitor() {
		return leitor;
	}

	/**
     * @param stamina insere o valor da Stamina do Monstro.
     */
	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}

	/**
     * @return o codigo do monstro.
     */
	public Livro getLivroemprestado() {
		return livroemprestado;
	}

	/**
     * @return o codigo do monstro.
     */
	public String getDataemprestimo() {
		return dataemprestimo;
	}

	/**
     * @param stamina insere o valor da Stamina do Monstro.
     */
	public void setDataemprestimo(String dataemprestimo) {
		this.dataemprestimo = dataemprestimo;
	}

	/**
     * @return o codigo do monstro.
     */
	public String getDevolucao() {
		return datadevolucao;
	}

	/**
     * @param stamina insere o valor da Stamina do Monstro.
     */
	public void setDevolucao(String devolucao) {
		this.datadevolucao = devolucao;
	}

	/**
     * @return o codigo do monstro.
     */
	public int getCod() {
		return cod;
	}
	
	public void emprestarLivro()
	{
		
	}

	@Override
	public String toString() {
		return "Emprestimo [leitor=" + leitor + ", livroemprestado="
				+ livroemprestado + ", dataemprestimo=" + dataemprestimo + "]";
	}
	

}
