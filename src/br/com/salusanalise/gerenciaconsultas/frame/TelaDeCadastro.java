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

import java.sql.*;
import br.com.salusanalise.gerenciaconsultas.dal.Conexao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.util.*;

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
        private JTextField textIdade;
  
        
    //informações sobre conexão
    Connection conexao = null;

     //executar instrucoes sql
    PreparedStatement pst = null;
    
    //executar instrucoes sql
    ResultSet rs = null;
    private JTextField txtIdade;
        
        
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 640, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setBounds(45, 38, 55, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(35, 53, 325, 32);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(388, 38, 55, 14);
		contentPane.add(lblCpf);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(379, 53, 126, 32);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("DATA DE NASC.");
		lblDataDeNascimento.setBounds(45, 108, 120, 14);
		contentPane.add(lblDataDeNascimento);
		
		txtDataDeNascimento = new JTextField();
		txtDataDeNascimento.setBounds(35, 123, 135, 32);
		contentPane.add(txtDataDeNascimento);
		txtDataDeNascimento.setColumns(10);
		
		JLabel lblEndereo = new JLabel("ENDEREÇO:");
		lblEndereo.setBounds(193, 109, 73, 14);
		contentPane.add(lblEndereo);
		
		txtEndereo = new JTextField();
		txtEndereo.setBounds(183, 123, 338, 32);
		contentPane.add(txtEndereo);
		txtEndereo.setColumns(10);
		
		JLabel lblN = new JLabel("Nº");
		lblN.setBounds(541, 132, 55, 14);
		contentPane.add(lblN);
		
		txtN = new JTextField();
		txtN.setBounds(533, 123, 66, 32);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		JLabel lblTelefone = new JLabel("TELEFONE:");
		lblTelefone.setBounds(45, 171, 163, 14);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(35, 185, 173, 32);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblTelefone_2 = new JLabel("TELEFONE 2:");
		lblTelefone_2.setBounds(244, 171, 159, 14);
		contentPane.add(lblTelefone_2);
		
		txtTelefone_2 = new JTextField();
		txtTelefone_2.setBounds(235, 185, 169, 32);
		contentPane.add(txtTelefone_2);
		txtTelefone_2.setColumns(10);
		
		JLabel lblBairro = new JLabel("BAIRRO:");
		lblBairro.setBounds(440, 171, 158, 14);
		contentPane.add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(431, 185, 167, 32);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblIdade = new JLabel("IDADE:");
		lblIdade.setBounds(524, 38, 55, 14);
		contentPane.add(lblIdade);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(514, 53, 82, 32);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
          
                
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(264, 258, 107, 31);
		contentPane.add(btnSalvar);
              
                btnSalvar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        if(txtNome.getText().isEmpty() || txtCpf.getText().isEmpty() || txtIdade.getText().isEmpty()){
                            JOptionPane.showMessageDialog(null, "Preencha os campos!");
                        }else{
                            salvarPaciente();
                            limparCampos();
                        }
                    }
                });
                     
        
            //informações para poder salvar no banco            
            conexao = Conexao.conector();
       
        }
                 
    private void salvarPaciente(){
        //String sql = "insert into paciente (nome,cpf,dtnascimento,idade,tel1,tel2,endereco,bairro,numeroendereco)values(?,?,?,?,?,?,?,?,?)";
   
        //para salvar no banco que roda junto com a aplicação
        String sql = "insert into root.paciente2 (nome,cpf,dtnascimento,idade,tel1,tel2,endereco,bairro,numeroendereco)values(?,?,?,?,?,?,?,?,?)";
   
        try {
            
            pst = conexao.prepareStatement(sql);
            
            //pegar o conteúdo dos campos 
            //esse numero, é o campo no banco de dados
            pst.setString(1, txtNome.getText());
            
            pst.setString(2, txtCpf.getText());
           
            pst.setString(3, txtDataDeNascimento.getText());
            
            pst.setString(4, txtIdade.getText());
            
            
            //contatos
            
            pst.setString(5, txtTelefone.getText());
            
            pst.setString(6, txtTelefone_2.getText());
            
            
            //endereco
            
            pst.setString(7, txtEndereo.getText());
            
            pst.setString(8, txtBairro.getText());
            
            pst.setString(9, txtN.getText());
            
           // pst.setString(9, t.getText());
            
           
            //a linha abaixo atualiza a tabela usuario com os dados do formulario
            //confirmar se os dados foram salvos
            
            int add = pst.executeUpdate();
            
            if(add >0){
                JOptionPane.showMessageDialog(null, "Cadastro realizado!");
            }
            
        } catch (Exception e) {  
            JOptionPane.showMessageDialog(null, "Termine o cadastro!");
        }
    
    }
    
    private void limparCampos(){
        
	txtNome.setText("");
	txtCpf.setText("");
	txtDataDeNascimento.setText("");
	txtEndereo.setText("");
	txtN.setText("");
	txtTelefone.setText("");
	txtTelefone_2.setText("");
	txtBairro.setText("");
        textIdade.setText("");   
    }
}
