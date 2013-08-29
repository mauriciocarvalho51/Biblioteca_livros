package pojo;

public class Livro {

	private int codlivro;
	private String nome;
	private int codescritor;
	
	public Livro(int codl, String name, int codautor) {
		this.codlivro = codl;
		this.nome = name;
		this.codescritor = codautor;
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

	@Override
	public String toString() {
		return "Livro [codlivro=" + codlivro + ", nome=" + nome
				+ ", codescritor=" + codescritor + "]";
	}
	
}
