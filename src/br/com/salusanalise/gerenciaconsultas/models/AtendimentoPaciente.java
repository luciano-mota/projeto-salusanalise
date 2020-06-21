/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.salusanalise.gerenciaconsultas.models;

/**
 *
 * @author Oberdran
 */
public class AtendimentoPaciente {
    private int id;
    private String nomepaciente,exame,dataatendimento,dataentregaexame;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomepaciente() {
        return nomepaciente;
    }

    public void setNomepaciente(String nomepaciente) {
        this.nomepaciente = nomepaciente;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }

    public String getDataatendimento() {
        return dataatendimento;
    }

    public void setDataatendimento(String dataatendimento) {
        this.dataatendimento = dataatendimento;
    }

    public String getDataentregaexame() {
        return dataentregaexame;
    }

    public void setDataentregaexame(String dataentregaexame) {
        this.dataentregaexame = dataentregaexame;
    }
}
