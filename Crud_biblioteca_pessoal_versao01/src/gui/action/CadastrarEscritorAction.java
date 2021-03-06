package gui.action;

import gui.CadastrarEscritorPanel;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import pojo.Escritor;
import dao.BibliotecaDAO;

	/**
	*
	* @author mauricio.victor.carvalho@gmail.com
	*
	*/
public class CadastrarEscritorAction extends AbstractAction {

	/**
	*
	*/
	private static final long serialVersionUID = 1L;
	
		private CadastrarEscritorPanel panel;
		
		public CadastrarEscritorAction(CadastrarEscritorPanel panel) {
			super("Cadastrar");
			this.panel = panel;
		}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Escritor c = panel.getEscritor();
		//System.out.println(c);
		BibliotecaDAO dao = new BibliotecaDAO();
		dao.insertEscritor(c);
	}
}
