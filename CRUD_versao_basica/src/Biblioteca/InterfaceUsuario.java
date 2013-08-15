package Biblioteca;

import java.util.List;

import emprestimo.CrudEmprestimo;
import emprestimo.DatabaseLeitor;
import emprestimo.Emprestimo;
import emprestimo.Leitor;

/**
 * A Classe Personagem representa um item(lutador).
 * As informações sobre o lutador são armazenadas e podem ser recuperadas.
 * Essa classe serve como uma super-classe para itens mais específicos.
 * 
 * @author Maurício Victor P. de Carvalho & Ricardo Melo Luz
 * @version 2013.07.05
 */

public class InterfaceUsuario {
	CrudLivro cadastrodelivros;
	CrudEscritor cadastrodeescritores;
	DatabaseLeitor amigos;
	CrudEmprestimo listadeemprestimos;
	
	
	
	public InterfaceUsuario()
	{
		cadastrodelivros = new CrudLivro();
		cadastrodeescritores = new CrudEscritor();
		//cadastrodeescritores.iniciarEscritores();
		//cadastrodelivros.iniciarLivros();
		amigos = new DatabaseLeitor();
		listadeemprestimos = new CrudEmprestimo();
		//amigos.iniciarLeitores();
	}

	public void executar()
	{
		int opcao = 0;
		do{
			System.out.println(Menu.getOpcoes());
			opcao = Console.scanInt("Digite sua opção:");
			switch(opcao)
			{
			case Menu.OP_CADASTRAR:
				Cadastrar();
				break;
			case Menu.OP_LISTAR:
				Listar();
				break;
			case Menu.OP_COMENTAR:
				inserirComentario();
				break;
			case Menu.OP_MARCAR_LIDO:
				Possuir();
				break;
			case Menu.OP_REMOVER:
				Remover();
				break;
			case Menu.OP_EMPRESTIMOS:
				emprestimos();
				break;
			case Menu.OP_ATUALIZAR:
				atualizar();
				break;
			case Menu.OP_SAIR:
				System.out.println("[Aplicação finalizada!!!]");
				break;
			default: 
				System.out.println("Opção inválida..");
				
			}
		}while(opcao != Menu.OP_SAIR);
	}

	public void Cadastrar()
	{
		int opcao = 0;
		do{
			System.out.println(Menu.getOpcoesNoCadastro());
			opcao = Console.scanInt("Digite sua opção:");
			switch(opcao)
			{
			case Menu.OP_CADASTRAR_LIVRO:
				cadastrarLivro();
				break;
			case Menu.OP_CADASTRAR_AUTOR:
				cadastrarEscritor();
				break;
			case Menu.OP_VOLTAR_MENU_02:
				executar();
				break;
			default:
				System.out.println("Opção inválida..");
			}
		}while(opcao != Menu.OP_VOLTAR_MENU_02);
	}
	
	public void Listar()
	{
		int opcao = 0;
		do{
			System.out.println(Menu.getOpcoesNoListar());
			opcao = Console.scanInt("Digite sua opção:");
			switch(opcao)
			{
			case Menu.OP_LISTAR_LIVROS:
				mostrarLivros();
				ordenarLivros();
				break;
			case Menu.OP_LISTAR_AUTORES:
				mostrarEscritores();
				ordenarAutores();
				break;
			case Menu.OP_VOLTAR_MENU_03:
				executar();
				break;
			default:
				System.out.println("Opção inválida..");
			}
		}while(opcao != Menu.OP_VOLTAR_MENU_03);
	}
	
	public void emprestimos()
	{
		int opcao = 0;
		do{
			System.out.println(Menu.getOpcoesemprestimo());
			opcao = Console.scanInt("Digite sua opção:");
			switch(opcao)
			{
			case Menu.OP_EMPRESTIMO_NOVO:
				cadastrarEmprestimo();
				break;
			case Menu.OP_EMPRESTIMO_ALTERAR:
				mostrarEmprestimos();
				break;
			case Menu.OP_VOLTAR_MENU_06:
				executar();
				break;
			default:
				System.out.println("Opção inválida..");
			}
		}while(opcao != Menu.OP_VOLTAR_MENU_06);
	}
	
	public void atualizar()
	{
		int opcao = 0;
		do{
			System.out.println(Menu.getOpcoesNoAtualizar());
			opcao = Console.scanInt("Digite sua opção:");
			switch(opcao)
			{
			case Menu.OP_ATUALIZAR_LIVRO:
				try {
					new Serializacao().armazenarListaLivros(cadastrodelivros.getListadelivros()) ;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case Menu.OP_ATUALIZAR_ESCRITOR:
				try {
					new Serializacao().armazenarListaEscritores(cadastrodeescritores.getListadeescritores()) ;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case Menu.OP_ATUALIZAR_EMPRESTIMO:
				try {
					new Serializacao().armazenarListaEmprestimos(listadeemprestimos.getListadeemprestimos()) ;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case Menu.OP_VOLTAR_MENU_07:
				executar();
				break;
			default:
				System.out.println("Opção inválida..");
			}
		}while(opcao != Menu.OP_VOLTAR_MENU_07);
	}
	
	private void ordenarLivros()
	{
		int opcao=0;
		do{
		System.out.println(Menu.getOpcoesNoOrdenarLivro());
		opcao = Console.scanInt("Digite a opção:");
		List<Livro> livross = null;
		
		if (opcao==Menu.OP_ORDENAR_NOME_CRESCENTE) {
			livross = cadastrodelivros.getAllOrdenadosPorNome();
		} else if (opcao==Menu.OP_ORDENAR_NOME_DECRESCENTE) {
			livross = cadastrodelivros.getAllOrdenadosPorNomeInverso();
		} else if (opcao==Menu.OP_ORDENAR_AUTOR_CRESCENTE) {
			livross = cadastrodelivros.getAllOrdenadosPorAutor();
		} else if (opcao==Menu.OP_ORDENAR_AUTOR_DECRESCENTE) {
			livross = cadastrodelivros.getAllOrdenadosPorAutorInverso();
		} else if (opcao==Menu.OP_ORDENAR_ASSUNTO_CRESCENTE) {
			livross = cadastrodelivros.getAllOrdenadosPorAssunto();
		} else if (opcao==Menu.OP_ORDENAR_ANO_CRESCENTE) {
			livross = cadastrodelivros.getAllOrdenadosPorAno();
		} else if (opcao==Menu.OP_ORDENAR_ANO_DECRESCENTE) {
			livross = cadastrodelivros.getAllOrdenadosPorAnoInverso();
		} else if (opcao==Menu.OP_ORDENAR_EDITORA_CRESCENTE) {
			livross = cadastrodelivros.getAllOrdenadosPorEditora();
		} else {
			System.out.println("Opção inválida");
			return;
		}
		System.out.println("-----------------------------\n");
		System.out.println(String.format("%-10s", "COD") + "\t"
				+ String.format("%-20s", "|NOME") + "\t"
				+ String.format("%-20s", "|AUTOR") + "\t"
				+ String.format("%-10s", "|ASSUNTO") + "\t"
				+ String.format("%-10s", "|ANO") + "\t"
				+ String.format("%-10s", "|EDITORA") + "\t"
				+ String.format("%-10s", "|LIDO") + "\t"
				+ String.format("%-10s", "|COMENTÁRIO"));
		for(Livro it: livross)
		{
			if (it instanceof Livro)
			{
			Livro livro = (Livro) it;
					
			System.out.println(String.format("%-10s", livro.getCodigo() ) + "\t"
					+ String.format("%-20s", "|"+ livro.getNome() ) + "\t"
					+ String.format("%-20s", "|"+ livro.getAutor() ) + "\t"
					+ String.format("%-10s", "|"+ livro.getAssunto() ) + "\t"
					+ String.format("%-10s", "|"+ livro.getAno() ) + "\t"
					+ String.format("%-10s", "|"+ livro.getEditora() ) + "\t"
					+ String.format("%-10s", "|"+ livro.getIsLido() ) + "\t"
					+ String.format("%-10s", "|"+ livro.getComentario() ));
			}
		}
		}while(opcao != Menu.OP_VOLTAR_MENU_04);
			
		
	}
	
	private void ordenarAutores()
	{
		int opcao=0;
		do{
		System.out.println(Menu.getOpcoesNoOrdenarAutor());
		opcao = Console.scanInt("Digite a opção:");
		List<Escritor> autores = null;
		
		if (opcao==Menu.OP_ORDENAR_AUTOR_COD_CRESCENTE) {
			autores = cadastrodeescritores.getAllOrdenadosPorCodigo();
		} else if (opcao==Menu.OP_ORDENAR_AUTOR_COD_DECRESCENTE) {
			autores = cadastrodeescritores.getAllOrdenadosPorCodigoInverso();
		} else if (opcao==Menu.OP_ORDENAR_AUTOR_NOME_CRESCENTE) {
			autores = cadastrodeescritores.getAllOrdenadosPorNome();
		} else if (opcao==Menu.OP_ORDENAR_AUTOR_NOME_DECRESCENTE) {
			autores = cadastrodeescritores.getAllOrdenadosPorNomeInverso();
		} else if (opcao==Menu.OP_ORDENAR_AUTOR_PAIS_CRESCENTE) {
			autores = cadastrodeescritores.getAllOrdenadosPorNacionalidade();
		} else if (opcao==Menu.OP_ORDENAR_AUTOR_PAIS_DECRESCENTE) {
			autores = cadastrodeescritores.getAllOrdenadosPorNacionalidadeInversa();
		} else {
			System.out.println("Opção inválida");
			return;
		}
		System.out.println("-----------------------------\n");
		System.out.println(String.format("%-10s", "COD") + "\t"
				+ String.format("%-30s", "|NOME") + "\t"
				+ String.format("%-20s", "|PAÍS"));
		for(Escritor it: autores)
		{
			if (it instanceof Escritor)
			{
			Escritor escritor = (Escritor) it;
					
			System.out.println(String.format("%-10s", escritor.getCodigo() ) + "\t"
					+ String.format("%-30s", "|"+ escritor.getNome() ) + "\t"
					+ String.format("%-20s", "|"+ escritor.getNacionalidade() ));
			}
		}
		}while(opcao != Menu.OP_VOLTAR_MENU_05);
			
		
	}
	
	public void mostrarLivros() 
	{
		System.out.println("-----------------------------\n");
		System.out.println(String.format("%-10s", "COD") + "\t"
				+ String.format("%-20s", "|NOME") + "\t"
				+ String.format("%-20s", "|AUTOR") + "\t"
				+ String.format("%-10s", "|ASSUNTO") + "\t"
				+ String.format("%-10s", "|ANO") + "\t"
				+ String.format("%-10s", "|EDITORA") + "\t"
				+ String.format("%-10s", "|LIDO") + "\t"
				+ String.format("%-10s", "|COMENTÁRIO"));
	    for(Livro correr: cadastrodelivros.getListadelivros())
		{
			if (correr instanceof Livro)
			{
				Livro livro = (Livro) correr;
					System.out.println(String.format("%-10s", livro.getCodigo() ) + "\t"
							+ String.format("%-20s", "|"+ livro.getNome() ) + "\t"
							+ String.format("%-20s", "|"+ livro.getAutor() ) + "\t"
							+ String.format("%-10s", "|"+ livro.getAssunto() ) + "\t"
							+ String.format("%-10s", "|"+ livro.getAno() ) + "\t"
							+ String.format("%-10s", "|"+ livro.getEditora() ) + "\t"
							+ String.format("%-10s", "|"+ livro.getIsLido() ) + "\t"
							+ String.format("%-10s", "|"+ livro.getComentario() ));
			}
		}
	}
	
	public void mostrarEscritores() 
	{
		System.out.println("-----------------------------\n");
		System.out.println(String.format("%-10s", "COD") + "\t"
				+ String.format("%-30s", "|NOME") + "\t"
				+ String.format("%-20s", "|PAÍS"));
	    for(Escritor correr: cadastrodeescritores.getListadeescritores())
		{
			if (correr instanceof Escritor)
			{
			Escritor escritor = (Escritor) correr;
					System.out.println(String.format("%-10s", escritor.getCodigo() ) + "\t"
					+ String.format("%-30s", "|"+ escritor.getNome() ) + "\t"
					+ String.format("%-20s", "|"+ escritor.getNacionalidade() ));
			}
		}
	}
	
	public void cadastrarEscritor()
	{ 
		String nome = Console.scanString("Digite Nome do Escritor:");
		String pais = Console.scanString("Digite País do escritor:");
		cadastrodeescritores.getListadeescritores().add(new Escritor(nome, pais));
		mostrarEscritores();
	}
	
	public void cadastrarLivro()
	{
		System.out.println("-----------------------------\n");
		String nome = Console.scanString("Digite o nome do livro:");			
		Escritor escritor = atribuirAutor();
		String assunto = Console.scanString("Digite o assunto do livro:");			
		int data = Console.scanInt("Digite o ano de lançamento do livro:");			
		String editora = Console.scanString("Digite o nome da editora:");			
		cadastrodelivros.getListadelivros().add(new Livro(nome, escritor, assunto, data, editora));
		mostrarLivros();
	}
	
	private Escritor atribuirAutor()
	{
		mostrarEscritores();
		int codigo=0;
		do {
		System.out.println("\nAtribua ao livro um dos autores acima digitando seu código");
		codigo = Console.scanInt("ou crie um novo autor digitando 0:");
		if ( cadastrodeescritores.escritorExiste(codigo) ) {
			Escritor autor = cadastrodeescritores.buscarEscritor(codigo);
			return autor;
		} else if ( codigo==0 ) {
			cadastrarEscritor();
		} else {
			System.out.println("Autor não existente!!!");
		}
		} while (!cadastrodeescritores.escritorExiste(codigo));
		return null;
	}
	
	private void inserirComentario()
	{
		System.out.println("-----------------------------\n");
		mostrarLivros();
		int codigo = Console.scanInt("Digite código do livro:");
		if ( cadastrodelivros.livroExiste(codigo) ) 
		{
			System.out.println("Livro encontrada com sucesso!");
			cadastrodelivros.buscarLivro(codigo).imprimir();
			String comentario = Console.scanString("Digite Comentário:");			
			cadastrodelivros.buscarLivro(codigo).setComentario(comentario);
            System.out.println("COMENTÁRIO ATRIBUÍDO!");
		} else {
            	System.out.println("Livro não encontrado!!!!");
        }
	}
	
	
	private void Possuir()
	{
		mostrarLivros();
		System.out.println("-----------------------------\n");
		int codigo = Console.scanInt("Digite o código livro ha ser marcado:");
		if ( cadastrodelivros.livroExiste(codigo))
		{
		    	System.out.println("Livro encontrado com sucesso!");
		    	cadastrodelivros.buscarLivro(codigo).imprimir();
		    	cadastrodelivros.buscarLivro(codigo).getComentario();
            	cadastrodelivros.buscarLivro(codigo).setLido(true);
            	System.out.println("LIVRO MARCADO COMO LIDO!");
         } else {
            	System.out.println("Livro não encontrado!!!!");
         }
	}
	
	private void Remover()
	{
		mostrarLivros();
		System.out.println("-----------------------------\n");
		int codigo = Console.scanInt("Digite código do livro ha ser REMOVIDO:");
		if ( cadastrodelivros.livroExiste(codigo))
		{
			System.out.println("Livro encontrado com sucesso!");
			cadastrodelivros.buscarLivro(codigo).imprimir();
			cadastrodelivros.getListadelivros().remove(codigo-1);
	    	System.out.println("removido com sucesso!");
			
		} else {
            	System.out.println("Livro não encontrado!!!!");
        }
	}
	
	private void cadastrarEmprestimo()
	{
		System.out.println("-----------------------------\n");
		Leitor leitor = atribuirLeitor();
		Livro livreto = selecionarLivro();
		String data = Console.scanString("Data de hoje:");			
		listadeemprestimos.getListadeemprestimos().add(new Emprestimo(leitor, livreto, data));
	}
	
	private Livro selecionarLivro()
	{
		System.out.println("-----------------------------\n");
		mostrarLivros();
		int codigo = Console.scanInt("Digite código do livro:");
		if ( cadastrodelivros.livroExiste(codigo) ) 
		{
			System.out.println("Livro encontrada com sucesso!");
			cadastrodelivros.buscarLivro(codigo).imprimir();
			return cadastrodelivros.buscarLivro(codigo);
		} else {
            	System.out.println("Livro não encontrado!!!!");
        }
		return null;
	}
	
	public void mostrarLeitores() 
	{
		System.out.println("-----------------------------\n");
		System.out.println(String.format("%-10s", "COD") + "\t"
				+ String.format("%-30s", "|NOME") + "\t"
				+ String.format("%-20s", "|TELEFONE"));
	    for(Leitor correr: amigos.getAmigos() )
		{
			if (correr instanceof Leitor)
			{
			Leitor leitor = (Leitor) correr;
					System.out.println(String.format("%-10s", leitor.getCod() ) + "\t"
					+ String.format("%-30s", "|"+ leitor.getNome() ) + "\t"
					+ String.format("%-20s", "|"+ leitor.getTelefone() ));
			}
		}
	}
	
	private Leitor atribuirLeitor()
	{
		mostrarLeitores();
		int codigo=0;
		do {
		System.out.println("\nAtribua ao emprétimo um dos leitores acima digitando seu código");
		codigo = Console.scanInt("ou crie um novo leitor digitando 0:");
		if ( amigos.amigoExiste(codigo)) {
			Leitor amigo = amigos.buscarLeitor(codigo);
			return amigo;
		} else if ( codigo==0 ) {
			cadastrarLeitor();
		} else {
			System.out.println("Leitor não existente!!!");
		}
		} while (!amigos.amigoExiste(codigo));
		return null;
	}
	
	public void cadastrarLeitor()
	{ 
		String nome = Console.scanString("Digite Nome do Leitor:");
		String fone = Console.scanString("Digite TELEFONE:");
		amigos.getAmigos().add(new Leitor(nome, fone));
		mostrarLeitores();
	}
	
	public void mostrarEmprestimos() 
	{
		System.out.println("-----------------------------\n");
		System.out.println(String.format("%-10s", "COD") + "\t"
				+ String.format("%-30s", "|LEITOR") + "\t"
				+ String.format("%-30s", "|LIVRO") + "\t"
				+ String.format("%-20s", "|DATA EMPRÉSTIMO") + "\t"
				+ String.format("%-20s", "|DATA DEVOLUÇÃO"));
	    for(Emprestimo correr: listadeemprestimos.getListadeemprestimos())
		{
			if (correr instanceof Emprestimo)
			{
				Emprestimo emprestimo = (Emprestimo) correr;
					System.out.println(String.format("%-10s", emprestimo.getCod() ) + "\t"
							+ String.format("%-30s", "|"+ emprestimo.getLeitor() ) + "\t"
							+ String.format("%-30s", "|"+ emprestimo.getLivroemprestado() ) + "\t"
							+ String.format("%-20s", "|"+ emprestimo.getDataemprestimo() ) + "\t"
							+ String.format("%-20s", "|"+ emprestimo.getDevolucao() ));
			}
		}
	}
	
}
