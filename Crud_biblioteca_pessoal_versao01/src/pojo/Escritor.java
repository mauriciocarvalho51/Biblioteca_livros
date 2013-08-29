package pojo;

public class Escritor {

	private int codautor;
	private String Nome;
	private String nacionalidade;
	
	public Escritor(int cod, String name, String pais) {
		this.codautor = cod;
		this.Nome =name;
		this.nacionalidade = pais;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
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
		return "Escritor [codautor=" + codautor + ", Nome=" + Nome
				+ ", nacionalidade=" + nacionalidade + "]";
	}
	
}
