package Biblioteca;

/**
 * A Classe Personagem representa um item(lutador).
 * As informações sobre o lutador são armazenadas e podem ser recuperadas.
 * Essa classe serve como uma super-classe para itens mais específicos.
 * 
 * @author Maurício Victor P. de Carvalho & Ricardo Melo Luz
 * @version 2013.07.05
 */
public class Livro  implements java.io.Serializable {
	/*
	A partir da classe Livro crie um Comparator para cada atributo
	do livro. 
	Para a classe CrudLivro crie a implementação de três métodos:
	 ordenaPorCodigo, ordenaPorNome e ordenaPorPreco. 
	Crie um Main para testar.
	 */

	private static int codigolivro=1;
	private int codigo=0;
	private String nome;
	private Escritor autor;
	private String assunto;
	private int ano; 
	private String editora; 
	private boolean lido;
	private String comentario;
	
	/**
	 * inicializando as informações sobre o MONSTRO.
	 * @param cod é numero do monstro.
	 * @param nom é o nome do monstro.
	 */
	public Livro(String nom, Escritor escritor, String assunto, int data, String editora){
		this.codigo = codigolivro++;
		this.nome = nom;
		this.autor = escritor;
		this.assunto = assunto;
		this.ano = data;
		this.editora = editora;
		this.lido = false;
		this.comentario = "";
	}

	/**
	 * inicializando as informações sobre o MONSTRO.
	 * @param cod é numero do monstro.
	 * @param nom é o nome do monstro.
	 */
	public Livro(String nom, String assunto, int data, String editora){
		this.codigo = codigolivro++;
		this.nome = nom;
		this.assunto = assunto;
		this.ano = data;
		this.editora = editora;
		this.lido = false;
		this.comentario = "";
	}
	
	/**
     * @return o codigo do monstro.
     */
	public int getCodigo() {
		return codigo;
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
	public Escritor getAutor() {
		return autor;
	}

	/**
     * @param stamina insere o valor da Stamina do Monstro.
     */
	public void setAutor(Escritor autor) {
		this.autor = autor;
	}

	/**
     * @return o codigo do monstro.
     */
	public String getAssunto() {
		return assunto;
	}

	/**
     * @param stamina insere o valor da Stamina do Monstro.
     */
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	/**
     * @return o codigo do monstro.
     */
	public int getAno() {
		return ano;
	}

	/**
     * @param stamina insere o valor da Stamina do Monstro.
     */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
     * @return o codigo do monstro.
     */
	public String getEditora() {
		return editora;
	}

	/**
     * @param stamina insere o valor da Stamina do Monstro.
     */
	public void setEditora(String editora) {
		this.editora = editora;
	}

	/**
     * @param stamina insere o valor da Stamina do Monstro.
     */
	public boolean isLido() {
		return lido;
	}

	/**
     * @param stamina insere o valor da Stamina do Monstro.
     */
	public void setLido(boolean lido) {
		this.lido = lido;
	}

	/**
     * @return o codigo do monstro.
     */
	public String getIsLido() {
		if (this.lido) {
			return "*";
		}
		return "";
	}
	
	/**
     * @return o codigo do monstro.
     */
	public String getComentario() {
		return comentario;
	}

	/**
     * @param stamina insere o valor da Stamina do Monstro.
     */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
		
	public void imprimir()
    {
        System.out.print("Título: " + nome + " (" + autor + ") / COMENTÁRIO: " + comentario+this.getIsLido() + " [" + ano + "]\n\n");
    }

	@Override
	public String toString() {
		return nome;
	}
	
}
