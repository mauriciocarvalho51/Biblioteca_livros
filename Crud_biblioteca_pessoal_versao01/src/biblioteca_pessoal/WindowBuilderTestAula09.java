package biblioteca_pessoal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class WindowBuilderTestAula09 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderTestAula09 window = new WindowBuilderTestAula09();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowBuilderTestAula09() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 564, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel painelBotoes = new JPanel();
		FlowLayout flowLayout = (FlowLayout) painelBotoes.getLayout();
		flowLayout.setAlignment(FlowLayout.LEADING);
		
		JPanel painelRegistro = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(painelBotoes, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
						.addComponent(painelRegistro, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(painelBotoes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(painelRegistro, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Id", "Nome", "Escritor"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		painelRegistro.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblId = new JLabel("Id");
		painelRegistro.add(lblId);
		
		textField = new JTextField();
		painelRegistro.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		painelRegistro.add(lblNome);
		
		textField_1 = new JTextField();
		painelRegistro.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEscritor = new JLabel("Escritor");
		painelRegistro.add(lblEscritor);
		
		textField_2 = new JTextField();
		painelRegistro.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setVerticalAlignment(SwingConstants.BOTTOM);
		painelBotoes.add(btnNovo);
		
		JButton btnSalvar = new JButton("Salvar");
		painelBotoes.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		painelBotoes.add(btnCancelar);
		
		JButton btnProcurar = new JButton("Procurar");
		painelBotoes.add(btnProcurar);
		
		JButton btnDeletar = new JButton("Deletar");
		painelBotoes.add(btnDeletar);
		
		JButton btnImprimir = new JButton("imprimir");
		painelBotoes.add(btnImprimir);
		frame.getContentPane().setLayout(groupLayout);
	}
}
