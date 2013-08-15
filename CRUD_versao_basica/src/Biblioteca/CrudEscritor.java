package Biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A Classe Personagem representa um item(lutador).
 * As informações sobre o lutador são armazenadas e podem ser recuperadas.
 * Essa classe serve como uma super-classe para itens mais específicos.
 * 
 * @author Maurício Victor P. de Carvalho & Ricardo Melo Luz
 * @version 2013.07.05
 */

public class CrudEscritor {
	private List<Escritor> listadeescritores;

	public CrudEscritor() {
		listadeescritores = new ArrayList<Escritor>();
		Serializacao serial = new Serializacao();
		try {
			serial.armazenarListaEscritores(listadeescritores);
			listadeescritores = serial.recuperarListaEscritores();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//ESSE ARMAZENA
		
		
	}
	
	public List<Escritor> getListadeescritores() {
		return listadeescritores;
	}
	/*
	public void iniciarEscritores(){
		listadeescritores.add(new Escritor("F.Nietzsche", "Alemanha"));
		listadeescritores.add(new Escritor("Edgar Allan Poe", "EUA"));
		listadeescritores.add(new Escritor("Arthur Schopenhauer", "Alemanha"));
		listadeescritores.add(new Escritor("Homero", "Grécia"));
		listadeescritores.add(new Escritor("Machado de Assis", "Brasil"));
		listadeescritores.add(new Escritor("Rene Descartes", "França"));
		listadeescritores.add(new Escritor("Sófocles", "Grécia"));
		listadeescritores.add(new Escritor("Eça de Queiroz", "Portugal"));
		listadeescritores.add(new Escritor("F.Dostóiésky", "Russia"));
		listadeescritores.add(new Escritor("Platão", "Grécia"));
		listadeescritores.add(new Escritor("Charles Bukoski", "Russia"));
		listadeescritores.add(new Escritor("Lima Barreto", "Brasil"));
	}*/
	
	public boolean escritorExiste(int codigo)
	{
		for(Escritor correr: listadeescritores)
		{
			if(correr.getCodigo()==(codigo))
			{
					return true;			
			}
		}
		return false;
	}
	
	public Escritor buscarEscritor(int num)
	{
		for(Escritor it: listadeescritores)
		{
			if(it.getCodigo()==(num))
				return it;			
		}
		return null;
	}
	
	private List<Escritor> ordenaPorTipo(int tipo)
	{
		List<Escritor> escritoresOrdenados = new ArrayList<Escritor>(listadeescritores);
		Collections.sort(escritoresOrdenados,new ComparadorEscritor(tipo));
		return(escritoresOrdenados);
	}

	public List<Escritor> getAllOrdenadosPorCodigo()
	{
		return ( ordenaPorTipo(ComparadorEscritor.CODIGO) );
	}
	
	public List<Escritor> getAllOrdenadosPorNome()
	{
		return ( ordenaPorTipo(ComparadorEscritor.NOME) );
	}
	
	public List<Escritor> getAllOrdenadosPorNacionalidade()
	{
		return ( ordenaPorTipo(ComparadorEscritor.NACIONALIDADE) );
	}
	
	private List<Escritor> ordenaPorTipoInverso(int tipo)
	{
		List<Escritor> escritoresOrdenados = new ArrayList<Escritor>(listadeescritores);
		Collections.sort(escritoresOrdenados,new ComparadorEscritor(tipo));
		Collections.reverse(escritoresOrdenados);
		return(escritoresOrdenados);
	}
	
	public List<Escritor> getAllOrdenadosPorCodigoInverso()
	{
		return ( ordenaPorTipoInverso(ComparadorEscritor.CODIGO) );
	}
	
	public List<Escritor> getAllOrdenadosPorNomeInverso()
	{
		return ( ordenaPorTipoInverso(ComparadorEscritor.NOME) );
	}
	
	public List<Escritor> getAllOrdenadosPorNacionalidadeInversa()
	{
		return ( ordenaPorTipoInverso(ComparadorEscritor.NACIONALIDADE) );
	}
	
	
}
