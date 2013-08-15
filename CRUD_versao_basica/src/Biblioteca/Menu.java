package Biblioteca;

/**
 * A Classe Personagem representa um item(lutador).
 * As informações sobre o lutador são armazenadas e podem ser recuperadas.
 * Essa classe serve como uma super-classe para itens mais específicos.
 * 
 * @author Maurício Victor P. de Carvalho & Ricardo Melo Luz
 * @version 2013.07.05
 */

public class Menu {
	
	public static final int OP_CADASTRAR=1;
	public static final int OP_LISTAR=2;
	public static final int OP_COMENTAR=3;
	public static final int OP_MARCAR_LIDO=4;
	public static final int OP_REMOVER=5;
	public static final int OP_EMPRESTIMOS=6;
	public static final int OP_ATUALIZAR=7;
	public static final int OP_SAIR=8;
	
	public static final int OP_CADASTRAR_LIVRO=1;
	public static final int OP_CADASTRAR_AUTOR=2;
	public static final int OP_VOLTAR_MENU_02=3;
	
	public static final int OP_LISTAR_LIVROS=1;
	public static final int OP_LISTAR_AUTORES=2;	
	public static final int OP_VOLTAR_MENU_03=3;
	
	public static final int OP_ORDENAR_NOME_CRESCENTE=1;
	public static final int OP_ORDENAR_NOME_DECRESCENTE=2;
	public static final int OP_ORDENAR_AUTOR_CRESCENTE=3;
	public static final int OP_ORDENAR_AUTOR_DECRESCENTE=4;
	public static final int OP_ORDENAR_ASSUNTO_CRESCENTE=5;
	public static final int OP_ORDENAR_ANO_CRESCENTE=6;
	public static final int OP_ORDENAR_ANO_DECRESCENTE=7;
	public static final int OP_ORDENAR_EDITORA_CRESCENTE=8;
	public static final int OP_VOLTAR_MENU_04=9;
	
	public static final int OP_ORDENAR_AUTOR_COD_CRESCENTE=1;
	public static final int OP_ORDENAR_AUTOR_COD_DECRESCENTE=2;
	public static final int OP_ORDENAR_AUTOR_NOME_CRESCENTE=3;
	public static final int OP_ORDENAR_AUTOR_NOME_DECRESCENTE=4;
	public static final int OP_ORDENAR_AUTOR_PAIS_CRESCENTE=5;
	public static final int OP_ORDENAR_AUTOR_PAIS_DECRESCENTE=6;
	public static final int OP_VOLTAR_MENU_05=7;
	
	public static final int OP_EMPRESTIMO_NOVO=1;
	public static final int OP_EMPRESTIMO_ALTERAR=2;
	public static final int OP_VOLTAR_MENU_06=3;
	
	public static final int OP_ATUALIZAR_LIVRO=1;
	public static final int OP_ATUALIZAR_ESCRITOR=2;
	public static final int OP_ATUALIZAR_EMPRESTIMO=3;
	public static final int OP_VOLTAR_MENU_07=4;
	
	
	public static String getOpcoes()
	{
		return(	"\n--------------------------------------\n" +
				"1- CADASTRAR\n" +
				"2- LISTAR\n" +
				"3- COMENTAR\n" +
				"4- MARCAR COMO LIDO\n" +
				"5- REMOVER\n" +
				"6- EMPRESTIMOS\n" +
				"7- ATUALIZAR\n" +
				"8- Sair da Aplicação" +
				"\n--------------------------------------");
	}
	
	public static String getOpcoesNoCadastro()
	{
		return(	"\n--------------------------------------\n" +
				"1- Cadastrar Livro\n" +
				"2- Cadastrar Escritor\n" +
				"3- Voltar\n"+
				"--------------------------------------");
	}
	
	public static String getOpcoesNoListar()
	{
		return(	"\n--------------------------------------\n" +
				"1- Mostrar Livros\n" +
				"2- Mostrar Autores\n" +
				"3- Voltar\n"+
				"--------------------------------------");
	}
	
	public static String getOpcoesNoOrdenarLivro()
	{
		return(	"\n--------------------------------------\n" +
				"1- Ordenar livro por Nome(Crescente)\n" +
				"2- Ordenar livro por Nome(Decrescente)\n" +
				"3- Ordenar livro por Autor(Crescente)\n" +
				"4- Ordenar livro por Autor(Decrescente)\n" +
				"5- Ordenar livro por Assunto\n"+
				"6- Ordenar livro por Ano(Crescente)\n" +
				"7- Ordenar livro por Ano(Decrescente)\n" +
				"8- Ordenar livro por Editora\n"+
				"9- Voltar\n"+
				"--------------------------------------");
	}
	
	public static String getOpcoesNoOrdenarAutor()
	{
		return(	"\n--------------------------------------\n" +
				"1- Ordenar Autor por Código(Crescente)\n" +
				"2- Ordenar Autor por Código(Decrescente)\n" +
				"3- Ordenar Autor por Nome(Crescente)\n" +
				"4- Ordenar Autor por Nome(Decrescente)\n" +
				"5- Ordenar Autor por País(Crescente)\n"+
				"6- Ordenar Autor por País(Decrescente)\n"+
				"7- Voltar\n"+
				"--------------------------------------");
	}
	
	public static String getOpcoesemprestimo()
	{
		return(	"\n--------------------------------------\n" +
				"1- Novo empréstimo\n" +
				"2- Alterar empréstimo\n" +
				"3- Voltar\n"+
				"--------------------------------------");
	}
	
	public static String getOpcoesNoAtualizar()
	{
		return(	"\n--------------------------------------\n" +
				"1- Atualizar lista de Livros\n" +
				"2- Atualizar lista de Escritores\n" +
				"3- Atualizar Emprestimos\n" +
				"4- Voltar\n"+
				"--------------------------------------");
	}
}
