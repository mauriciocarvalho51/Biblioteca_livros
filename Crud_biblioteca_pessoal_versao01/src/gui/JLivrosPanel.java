package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

public class JLivrosPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private JTable table;
	private JFrame frame;

	private CardLayout card;
	public JFrame getFrame() {
		return frame;
	}

	public CardLayout getCard() {
		return card;
	}

	/**
	 * Create the panel.
	 * 
	 * @param card
	 * @param frame
	 */
	public JLivrosPanel(JFrame frame, CardLayout card) {
		this.frame = frame;
		this.card = card;

		setLayout(new BorderLayout());
		table = new JTable(new MyTableModel());

		add(BorderLayout.CENTER, table);

		/*
		JButton button = new JButton(new ExtratoFecharAction(this));
		button.setToolTipText("Cancelar cadastro de ITEM");
		button.setMnemonic(KeyEvent.VK_N);
		add(BorderLayout.SOUTH, button);
*/
	}

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event-dispatching thread.
	 */
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Teste");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new JLivrosPanel(null, null));

		frame.setPreferredSize(new Dimension(800, 200));
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

}
