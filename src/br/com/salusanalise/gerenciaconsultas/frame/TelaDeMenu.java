package br.com.salusanalise.gerenciaconsultas.frame;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.salusanalise.gerenciaconsultas.dal.GeraRelatorio;

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

        
        JButton btnClientesCadastrados = new JButton("Relatório de Clientes");
        btnClientesCadastrados.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		//abrir os relatórios
        		
        		GeraRelatorio abrirRelatorios = new GeraRelatorio();
        		abrirRelatorios.gerar();
        		
        	}
        });
        btnClientesCadastrados.setBounds(193, 175, 157, 24);
        contentPane.add(btnClientesCadastrados);
        
        JButton btnExames = new JButton("Cadastrar exames");
        btnExames.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		TelaDeExames te = new TelaDeExames();
        		te.show();
        		
        		this.dispose();
        	}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
        });
        btnExames.setBounds(193, 139, 157, 24);
        contentPane.add(btnExames);
    
    }
}
