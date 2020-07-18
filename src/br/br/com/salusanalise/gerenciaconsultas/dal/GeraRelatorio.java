package br.com.salusanalise.gerenciaconsultas.dal;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class GeraRelatorio {
	
	//Método para conectar ao DB e gerar o relatório!
	
	public void gerar() {
		try {
			Connection con = new Conexao().conector();
			HashMap param = new HashMap();
			
			JasperPrint jp = JasperFillManager.fillReport("RelatorioClinica.jasper", param, con);
			JasperViewer mostrarNaTela = new JasperViewer(jp, false);
			mostrarNaTela.setVisible(true);

			//con.close();
		} catch (JRException ex) {
			Logger.getLogger(GeraRelatorio.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	
	// Método main criado apenas para testar se o relatório funcionaria.
	/*
	 * public static void main(String[] args) {
	 * 
	 * GeraRelatorio gerar = new GeraRelatorio(); gerar.gerar();
	 * 
	 * }
	 */
}
