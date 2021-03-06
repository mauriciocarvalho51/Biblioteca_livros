package pojo;

public class Escritor {

	private int codautor;
	private String nome;
	private String nacionalidade;
	
	public Escritor(int cod, String name, String pais) {
		this.codautor = cod;
		this.nome =name;
		this.nacionalidade = pais;
	}
	
	public Escritor(String name, String pais) {
		//this.codautor = cod;
		this.nome =name;
		this.nacionalidade = pais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getCodautor() {
		return codautor;
	}

	@Override
	public String toString() {
		return "Escritor [codautor=" + codautor + ", nome=" + nome
				+ ", nacionalidade=" + nacionalidade + "]";
	}
	
}
