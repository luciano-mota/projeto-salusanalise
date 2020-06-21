package br.com.salusanalise.gerenciaconsultas.frame;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaDeCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtDataDeNascimento;
	private JTextField txtEndereo;
	private JTextField txtN;
	private JTextField txtTelefone;
	private JTextField txtTelefone_2;
	private JTextField txtBairro;
	private JTextField textDataDoAtendimento;
	private JTextField textDataDeEntrega;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeCadastro frame = new TelaDeCadastro();
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
	public TelaDeCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(45, 21, 55, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(35, 12, 360, 32);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(413, 21, 55, 14);
		contentPane.add(lblCpf);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(407, 12, 192, 32);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setBounds(45, 75, 120, 14);
		contentPane.add(lblDataDeNascimento);
		
		txtDataDeNascimento = new JTextField();
		txtDataDeNascimento.setBounds(35, 66, 135, 32);
		contentPane.add(txtDataDeNascimento);
		txtDataDeNascimento.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endereço:");
		lblEndereo.setBounds(193, 75, 62, 14);
		contentPane.add(lblEndereo);
		
		txtEndereo = new JTextField();
		txtEndereo.setBounds(183, 66, 338, 32);
		contentPane.add(txtEndereo);
		txtEndereo.setColumns(10);
		
		JLabel lblN = new JLabel("Nº");
		lblN.setBounds(541, 75, 55, 14);
		contentPane.add(lblN);
		
		txtN = new JTextField();
		txtN.setBounds(533, 66, 66, 32);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(45, 130, 163, 14);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(35, 121, 173, 32);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblTelefone_2 = new JLabel("Telefone 2:");
		lblTelefone_2.setBounds(244, 130, 159, 14);
		contentPane.add(lblTelefone_2);
		
		txtTelefone_2 = new JTextField();
		txtTelefone_2.setBounds(234, 121, 169, 32);
		contentPane.add(txtTelefone_2);
		txtTelefone_2.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(440, 130, 158, 14);
		contentPane.add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(431, 121, 167, 32);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblDataDoAtendimento = new JLabel("Data do atendimento:");
		lblDataDoAtendimento.setBounds(150, 235, 120, 14);
		contentPane.add(lblDataDoAtendimento);
		
		textDataDoAtendimento = new JTextField();
		textDataDoAtendimento.setBounds(138, 227, 143, 31);
		contentPane.add(textDataDoAtendimento);
		textDataDoAtendimento.setColumns(10);
		
		JLabel lblDataDeEntrega = new JLabel("Data de entrega:");
		lblDataDeEntrega.setBounds(363, 236, 100, 14);
		contentPane.add(lblDataDeEntrega);
		
		textDataDeEntrega = new JTextField();
		textDataDeEntrega.setColumns(10);
		textDataDeEntrega.setBounds(340, 227, 143, 31);
		contentPane.add(textDataDeEntrega);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(258, 306, 107, 31);
		contentPane.add(btnSalvar);
	}

}
