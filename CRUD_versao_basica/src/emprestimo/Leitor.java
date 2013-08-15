package emprestimo;

/**
 * A Classe Personagem representa um item(lutador).
 * As informações sobre o lutador são armazenadas e podem ser recuperadas.
 * Essa classe serve como uma super-classe para itens mais específicos.
 * 
 * @author Maurício Victor P. de Carvalho & Ricardo Melo Luz
 * @version 2013.07.05
 */

public class Leitor  implements java.io.Serializable  {

	private static int codigo=1;
	private int cod;
	private String nome;
	private String telefone;
	
	/**
	 * inicializando as informações sobre o MONSTRO.
	 * @param cod é numero do monstro.
	 * @param nom é o nome do monstro.
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
