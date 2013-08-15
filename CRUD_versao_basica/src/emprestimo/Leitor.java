package emprestimo;

/**
 * A Classe Personagem representa um item(lutador).
 * As informa��es sobre o lutador s�o armazenadas e podem ser recuperadas.
 * Essa classe serve como uma super-classe para itens mais espec�ficos.
 * 
 * @author Maur�cio Victor P. de Carvalho & Ricardo Melo Luz
 * @version 2013.07.05
 */

public class Leitor  implements java.io.Serializable  {

	private static int codigo=1;
	private int cod;
	private String nome;
	private String telefone;
	
	/**
	 * inicializando as informa��es sobre o MONSTRO.
	 * @param cod � numero do monstro.
	 * @param nom � o nome do monstro.
	 */
	public Leitor(String nome, String telefone) 
	{
		this.cod = codigo++;
		this.nome = nome;
		this.telefone = telefone;
	}

	/**
     * @return o codigo do monstro.
     */
	public String getNome() {
		return nome;
	}

	/**
     * @param stamina insere o valor da Stamina do Monstro.
     */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
     * @return o codigo do monstro.
     */
	public String getTelefone() {
		return telefone;
	}

	/**
     * @param stamina insere o valor da Stamina do Monstro.
     */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
     * @return o codigo do monstro.
     */
	public int getCod() {
		return cod;
	}

	@Override
	public String toString() {
		return nome;
	}
	
	
}
