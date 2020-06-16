package br.com.salusanaise.gerenciaconsultas.frame;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.salusanalise.gerenciaconsultas.controls.ValidaLogin;

public class TelaLogin extends ValidaLogin{

	private JFrame frame;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
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
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Dialog", Font.BOLD, 18));
		lblLogin.setBounds(145, 69, 67, 30);
		frame.getContentPane().add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setText(this.getUsuario());
		txtLogin.setBounds(130, 100, 216, 30);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Dialog", Font.BOLD, 18));
		lblSenha.setBounds(143, 142, 90, 24);
		frame.getContentPane().add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setText(this.getSenha());
		txtSenha.setBounds(130, 170, 216, 30);
		frame.getContentPane().add(txtSenha);
	
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(getUsuario() == usuario && getSenha() == usuario) {
					JOptionPane.showMessageDialog(null, "Bem Vindo");
					
					
				} else {
					JOptionPane.showMessageDialog(null, "Usuário e senha estão incorretos.");
				}
				
			}
		});
		btnEntrar.setBounds(186, 258, 98, 24);
		frame.getContentPane().add(btnEntrar);
	}
}
