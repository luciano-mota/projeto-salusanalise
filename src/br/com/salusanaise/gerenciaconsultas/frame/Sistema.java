package br.com.salusanaise.gerenciaconsultas.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sistema {

	private JFrame frame;
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textDataDeNascimento;
	private JTextField textEndereco;
	private JTextField textBairro;
	private JTextField textN;
	private JTextField textTelefone;
	private JTextField textDataDoAtendimento;
	private JTextField textDataDeEntrega;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema window = new Sistema();
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
	public Sistema() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCadastro = new JLabel("CADASTRO");
		lblCadastro.setFont(new Font("Dialog", Font.BOLD, 30));
		lblCadastro.setBounds(242, 12, 178, 41);
		frame.getContentPane().add(lblCadastro);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(63, 69, 55, 18);
		frame.getContentPane().add(lblNome);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(53, 66, 338, 30);
		frame.getContentPane().add(textNome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(433, 118, 55, 14);
		frame.getContentPane().add(lblCpf);
		
		textCpf = new JTextField();
		textCpf.setColumns(10);
		textCpf.setBounds(426, 112, 169, 30);
		frame.getContentPane().add(textCpf);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setBounds(434, 73, 128, 14);
		frame.getContentPane().add(lblDataDeNascimento);
		
		textDataDeNascimento = new JTextField();
		textDataDeNascimento.setColumns(10);
		textDataDeNascimento.setBounds(428, 67, 147, 32);
		frame.getContentPane().add(textDataDeNascimento);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setBounds(64, 117, 95, 14);
		frame.getContentPane().add(lblEndereco);
		
		textEndereco = new JTextField();
		textEndereco.setColumns(10);
		textEndereco.setBounds(53, 112, 338, 30);
		frame.getContentPane().add(textEndereco);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(63, 160, 55, 14);
		frame.getContentPane().add(lblBairro);
		
		textBairro = new JTextField();
		textBairro.setColumns(10);
		textBairro.setBounds(54, 155, 178, 30);
		frame.getContentPane().add(textBairro);
		
		JLabel lblN = new JLabel("nº");
		lblN.setBounds(259, 157, 37, 14);
		frame.getContentPane().add(lblN);
		
		textN = new JTextField();
		textN.setColumns(10);
		textN.setBounds(253, 154, 40, 30);
		frame.getContentPane().add(textN);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(386, 160, 55, 14);
		frame.getContentPane().add(lblTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(373, 155, 169, 30);
		frame.getContentPane().add(textTelefone);
		
		JLabel lblDataDoAtendimento = new JLabel("Data do Atendimento:");
		lblDataDoAtendimento.setBounds(119, 218, 128, 14);
		frame.getContentPane().add(lblDataDoAtendimento);
		
		textDataDoAtendimento = new JTextField();
		textDataDoAtendimento.setColumns(10);
		textDataDoAtendimento.setBounds(110, 213, 155, 30);
		frame.getContentPane().add(textDataDoAtendimento);
		
		JLabel lblDataDeEntrega = new JLabel("Data de Entrega:");
		lblDataDeEntrega.setBounds(357, 217, 95, 14);
		frame.getContentPane().add(lblDataDeEntrega);
		
		textDataDeEntrega = new JTextField();
		textDataDeEntrega.setColumns(10);
		textDataDeEntrega.setBounds(347, 213, 162, 30);
		frame.getContentPane().add(textDataDeEntrega);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSalvar.setBounds(258, 294, 124, 41);
		frame.getContentPane().add(btnSalvar);
	}
}
