package gui;

import gui.action.CadastrarEscritorAction;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pojo.Escritor;


	/**
	*
	* @author mauricio.victro.carvalho@gmail.com
	*
	*/

public class CadastrarEscritorPanel extends JPanel {

	/**
	*
	*/
	private static final long serialVersionUID = 1L;
	
	private JTextField nome;
	private JTextField nacionalidade;
	
	
	public Escritor getEscritor() {
		return new Escritor(nome.getText(), nacionalidade.getText());
	}
	
	public CadastrarEscritorPanel() {
		JLabel label;
		
		setLayout(new FlowLayout());
		
		label = new JLabel("Nome");
		add(label);
		nome = new JTextField(10);
		add(nome);
		
		label = new JLabel("Nacionalidade");
		add(label);
		nacionalidade = new JTextField(10);
		add(nacionalidade);
		
		JButton button = new JButton(new CadastrarEscritorAction(this));
		button.setToolTipText("Cadastrar conta");
		button.setMnemonic(KeyEvent.VK_C);
		add(button);
	}
}
