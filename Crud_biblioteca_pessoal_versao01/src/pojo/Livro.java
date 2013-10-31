package pojo;

public class Livro {

	private int codlivro;
	private String nome;
	private int codescritor;
	private String escritor;

	public Livro(int codl, String name, int codautor, String escritor) {
		this.codlivro = codl;
		this.nome = name;
		this.codescritor = codautor;
		this.escritor = escritor;
		
	}
	
	public Livro() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodescritor() {
		return codescritor;
	}

	public void setCodescritor(int codescritor) {
		this.codescritor = codescritor;
	}

	public int getCodlivro() {
		return codlivro;
	}

	public String getEscritor() {
		return escritor;
	}

	@Override
	public String toString() {
		return "Livro [codlivro=" + codlivro + ", nome=" + nome
				+ ", codescritor=" + codescritor + "]";
	}
	
}
