/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.salusanalise.gerenciaconsultas.dal;

import java.sql.*;

/**
 *
 * @author Oberdran
 */
public class Conexao {

    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        //chamando o drive
        String driver = "com.mysql.jdbc.Driver";
        
        //armazenando informações referentes ao banco
        String url = "jdbc:mysql://db4free.net:3306/bd2019";
        String user = "oberdran";
        String password = "teste2019";
        
        //estabelecendo a conexao com o banco
        try {
            //executa o arquivo do drive
            Class.forName(driver);
            
            //caso a conexão com o banco seja bem sucedida
            //ele conecta no banco com o usuario e senha
            //retornando a conexão
            conexao = DriverManager.getConnection(url,user,password);
            
            return conexao;
        } catch (Exception e) {
            
            //mostrando qual o erro na hora de conectar
            //pode ser retirado essa opção mais na frente
            
            System.out.println("Erro de Conexao:"+e);
            
            return null;
        }
    }

}
