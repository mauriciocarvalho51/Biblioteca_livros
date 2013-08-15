package emprestimo;

import java.util.ArrayList;
import java.util.List;

import Biblioteca.Serializacao;

/**
 * A Classe Personagem representa um item(lutador).
 * As informações sobre o lutador são armazenadas e podem ser recuperadas.
 * Essa classe serve como uma super-classe para itens mais específicos.
 * 
 * @author Maurício Victor P. de Carvalho & Ricardo Melo Luz
 * @version 2013.07.05
 */

public class CrudEmprestimo {
	private List<Emprestimo> listadeemprestimos;
	
	public CrudEmprestimo() {
		listadeemprestimos = new ArrayList<Emprestimo>();
		Serializacao serial = new Serializacao();
		try {
			serial.armazenarListaEmprestimos(listadeemprestimos);
			listadeemprestimos = serial.recuperarListaEmprestimos();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Emprestimo> getListadeemprestimos() {
		return listadeemprestimos;
	}
	
	public boolean emprestimoExiste(int codigo)
	{
		for(Emprestimo correr: listadeemprestimos)
		{
			if(correr.getCod()==(codigo))
			{
					return true;			
			}
		}
		return false;
	}
	
	public Emprestimo buscarEmprestimo(int num)
	{
		for(Emprestimo it: listadeemprestimos)
		{
			if(it.getCod()==(num))
				return it;			
		}
		return null;
	}
}
