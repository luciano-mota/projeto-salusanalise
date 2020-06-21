/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.salusanalise.gerenciaconsultas.principal;

import br.com.salusanalise.gerenciaconsultas.frame.TelaDeCadastro;
import br.com.salusanalise.gerenciaconsultas.frame.TelaDeMenu;
import br.com.salusanalise.gerenciaconsultas.frame.TelaLogin;
import com.sun.org.apache.bcel.internal.generic.AALOAD;

/**
 *
 * @author Oberdran
 * @author Luciano
 */
public class Prjclinica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TelaDeCadastro tc  = new TelaDeCadastro();
       
        tc.show();
        
        TelaDeMenu tm = new TelaDeMenu();
        
        tm.show();
        
        TelaLogin tl = new TelaLogin();
       
        
   }
    
}
