package emprestimo;

import java.util.ArrayList;
import java.util.List;

/**
 * A Classe Personagem representa um item(lutador).
 * As informações sobre o lutador são armazenadas e podem ser recuperadas.
 * Essa classe serve como uma super-classe para itens mais específicos.
 * 
 * @author Maurício Victor P. de Carvalho & Ricardo Melo Luz
 * @version 2013.07.05
 */

public class DatabaseLeitor {
	List<Leitor> amigos;
	
	public DatabaseLeitor() {
		amigos = new ArrayList<Leitor>();
	}

	public List<Leitor> getAmigos() {
		return amigos;
	}
	
	public boolean amigoExiste(int codigo)
	{
		for(Leitor correr: amigos)
		{
			if(correr.getCod()==(codigo))
			{
					return true;			
			}
		}
		return false;
	}
	
	public Leitor buscarLeitor(int num)
	{
		for(Leitor it: amigos)
		{
			if(it.getCod()==(num))
				return it;			
		}
		return null;
	}
	/*
	public void iniciarLeitores(){
		amigos.add(new Leitor("Fulano", "8437-94-96"));
		amigos.add(new Leitor("Ciclano", "5836-65-96"));
		amigos.add(new Leitor("Ricardo", "5836-65-96"));
		amigos.add(new Leitor("Maurício", "5836-65-96"));
		amigos.add(new Leitor("Beltrano", "0000-00-00"));
		amigos.add(new Leitor("Leonardo", "9836-85-96"));
	}*/
	
}
