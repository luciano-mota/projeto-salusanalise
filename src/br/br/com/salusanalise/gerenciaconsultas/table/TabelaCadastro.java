package br.com.salusanalise.gerenciaconsultas.table;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;

public class TabelaCadastro extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public TabelaCadastro() {
		setLayout(null);
		
		JLabel lblTabelaDeCadastros = new JLabel("Tabela de Cadastros");
		lblTabelaDeCadastros.setFont(new Font("Dialog", Font.BOLD, 25));
		lblTabelaDeCadastros.setBounds(195, 33, 244, 30);
		add(lblTabelaDeCadastros);
		
		table = new JTable();
		table.setBounds(0, 117, 225, -116);
		add(table);

	}
}
