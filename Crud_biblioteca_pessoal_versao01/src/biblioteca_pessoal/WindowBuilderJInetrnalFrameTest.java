package biblioteca_pessoal;

import gui.JLivrosPanel;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class WindowBuilderJInetrnalFrameTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtAutor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderJInetrnalFrameTest frame = new WindowBuilderJInetrnalFrameTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowBuilderJInetrnalFrameTest() {
		setBounds(100, 100, 612, 394);

		JPanel painelRegistro = new JPanel();

		JPanel panelBotoes = new JPanel();

		JPanel scrollPane = new JLivrosPanel(null, null);

		//JScrollPane scrollPane = new JScrollPane(new JLivrosPanel(null, null));
		//scrollPane.setPreferredSize(new Dimension(200,100));
		
		
		// scrollPane.setLayout(new BorderLayout());
		// scrollPane.add(BorderLayout.CENnew JLivrosPanel(null, null));

		// JPanel scrollPane = new JPanel();
		// scrollPane.setLayout(new BorderLayout());
		// scrollPane.add(BorderLayout.CENTER, new JLivrosPanel(null, null));

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout
				.createParallelGroup(Alignment.LEADING)
				.addComponent(panelBotoes, GroupLayout.DEFAULT_SIZE, 596,
						Short.MAX_VALUE)
				.addGroup(
						Alignment.TRAILING,
						groupLayout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(scrollPane,
										GroupLayout.DEFAULT_SIZE, 586,
										Short.MAX_VALUE))
				.addComponent(painelRegistro, GroupLayout.DEFAULT_SIZE, 596,
						Short.MAX_VALUE));
		getContentPane().setLayout(groupLayout);
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
				Alignment.LEADING).addGroup(
				Alignment.TRAILING,
				groupLayout
						.createSequentialGroup()
						.addComponent(painelRegistro, GroupLayout.DEFAULT_SIZE,
								156, Short.MAX_VALUE)
						.addGap(18)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE,
								145, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelBotoes, GroupLayout.PREFERRED_SIZE,
								40, GroupLayout.PREFERRED_SIZE)));

		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		JButton btnSalvar = new JButton("Salvar");

		JButton btnCancelar = new JButton("Cancelar");

		JButton btnProcurar = new JButton("Procurar");

		JButton btnExcuir = new JButton("Excuir");

		JButton btnImprimir = new JButton("Imprimir");
		GroupLayout gl_panelBotoes = new GroupLayout(panelBotoes);
		gl_panelBotoes.setHorizontalGroup(gl_panelBotoes.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panelBotoes
						.createSequentialGroup()
						.addGap(18)
						.addComponent(btnNovo, GroupLayout.PREFERRED_SIZE, 79,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE,
								94, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE,
								92, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnProcurar, GroupLayout.PREFERRED_SIZE,
								87, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnExcuir, GroupLayout.PREFERRED_SIZE,
								83, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnImprimir, GroupLayout.PREFERRED_SIZE,
								89, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(24, Short.MAX_VALUE)));
		gl_panelBotoes.setVerticalGroup(gl_panelBotoes.createParallelGroup(
				Alignment.LEADING)
				.addGroup(
						gl_panelBotoes
								.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										gl_panelBotoes
												.createParallelGroup(
														Alignment.BASELINE)
												.addComponent(btnImprimir)
												.addComponent(btnExcuir)
												.addComponent(btnProcurar)
												.addComponent(btnCancelar)
												.addComponent(btnSalvar)
												.addComponent(btnNovo))
								.addContainerGap(GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		panelBotoes.setLayout(gl_panelBotoes);

		JLabel lblId = new JLabel("Id");

		txtId = new JTextField();
		txtId.setColumns(10);

		JLabel lblNome = new JLabel("Livro");

		txtNome = new JTextField();
		txtNome.setColumns(10);

		JLabel lblAutor = new JLabel("Autor");

		txtAutor = new JTextField();
		txtAutor.setColumns(10);
		GroupLayout gl_painelRegistro = new GroupLayout(painelRegistro);
		painelRegistro.setLayout(gl_painelRegistro);

		gl_painelRegistro
				.setHorizontalGroup(gl_painelRegistro
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_painelRegistro
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_painelRegistro
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(lblId)
														.addComponent(
																txtId,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblNome)
														.addComponent(
																txtNome,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblAutor)
														.addComponent(
																txtAutor,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addContainerGap(500, Short.MAX_VALUE)));
		gl_painelRegistro.setVerticalGroup(gl_painelRegistro
				.createParallelGroup(Alignment.LEADING).addGroup(
						gl_painelRegistro
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblId)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtId,
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblNome)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtNome,
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(lblAutor)
								.addPreferredGap(ComponentPlacement.RELATED,
										GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(txtAutor,
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		pack();

	}
}
