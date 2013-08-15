package Biblioteca;

/**
 * A Classe Personagem representa um item(lutador).
 * As informações sobre o lutador são armazenadas e podem ser recuperadas.
 * Essa classe serve como uma super-classe para itens mais específicos.
 * 
 * @author Maurício Victor P. de Carvalho & Ricardo Melo Luz
 * @version 2013.07.05
 */

public class Escritor implements java.io.Serializable {

	private static int codigoescritor=1;
	private int cod;
	private String nome;
	private String nacionalidade;
	
	/**
	 * inicializando as informações sobre o MONSTRO.
	 * @param cod é numero do monstro.
	 * @param nom é o nome do monstro.
	 */
	public Escritor(String nom, String pais){
		this.cod = codigoescritor++;
		this.nome = nom;
		this.nacionalidade = pais;
	}
	
	/**
     * @return o codigo do monstro.
     */
	public int getCodigo() {
		return cod;
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
     * @return nacionalisdade.
     */
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	/**
     * @param stamina insere o valor da Stamina do Monstro.
     */
	public void setNacionalidade(String pais) {
		this.nacionalidade = pais;
	}

	@Override
	public String toString() {
		return nome;
	}
}
