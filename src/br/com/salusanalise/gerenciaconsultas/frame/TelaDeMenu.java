package br.com.salusanalise.gerenciaconsultas.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDeMenu extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaDeMenu frame = new TelaDeMenu();
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
    public TelaDeMenu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //retirando o redimensionamento da tela e a opção de maximizar a tela
        setResizable(false);
        
        setBounds(100, 100, 538, 379);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnCadastrarCliente = new JButton("Cadastrar cliente");
        btnCadastrarCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                TelaDeCadastro telaDeCadastro = new TelaDeCadastro();
                telaDeCadastro.setVisible(rootPaneCheckingEnabled);
            }
        });
        btnCadastrarCliente.setBounds(193, 103, 157, 24);
        contentPane.add(btnCadastrarCliente);

        
        JButton btnClientesCadastrados = new JButton("Clientes cadastrados");
        btnClientesCadastrados.setBounds(193, 139, 157, 24);
        contentPane.add(btnClientesCadastrados);
        
        JButton btnExames = new JButton("Exames");
        btnExames.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		TelaDeExames te = new TelaDeExames();
        		te.show();
        	}
        });
        btnExames.setBounds(193, 175, 157, 24);
        contentPane.add(btnExames);
    
    }
}
