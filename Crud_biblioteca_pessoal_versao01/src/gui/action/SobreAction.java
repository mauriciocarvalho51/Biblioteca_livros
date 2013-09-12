package gui.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

	/**
	*
	* @author mauricio.victor.carvalho@gmail.com
	*
	*/
public class SobreAction extends AbstractAction {

	/**
	*
	*/
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	
	public SobreAction(JFrame frame) {
		super("Sobre");
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Sobre");
		JOptionPane.showMessageDialog(frame, "v. 0.2 (c) LAPRO III, FSPOA.",
		"Sobre o cadastro pessoal de livros - Acervo Pr�rpio", JOptionPane.INFORMATION_MESSAGE);
	}

}