/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpe.recife.airbntruta.model.negocio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ALUNO
 */
public class Interesse {
    
    private int codigo;
    private long realizado;
    private String proposta;
    private int tempoPermanencia;
    private Fugitivo interessado;
    private Hospedagem interesse;
    
    public Interesse(){
        this.realizado = new Date().getTime();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public long getRealizado() {
        return realizado;
    }

    public void setRealizado(long realizado) {
        this.realizado = realizado;
    }

    public String getProposta() {
        return proposta;
    }

    public void setProposta(String proposta) {
        this.proposta = proposta;
    }

    public int getTempoPermanencia() {
        return tempoPermanencia;
    }

    public void setTempoPermanencia(int tempoPermanencia) {
        this.tempoPermanencia = tempoPermanencia;
    }

    public Fugitivo getInteressado() {
        return interessado;
    }

    public void setInteressado(Fugitivo interessado) {
        this.interessado = interessado;
    }

    public Hospedagem getInteresse() {
        return interesse;
    }

    public void setInteresse(Hospedagem interesse) {
        this.interesse = interesse;
    }
    
    public void setRealizado(String data){
        
        try {
            this.realizado = new SimpleDateFormat("dd/MM/yyyy").parse(data).getTime();
        } catch (ParseException ex) {
            System.getLogger(Interesse.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
    }
    
    public String getRealizadoFormatado(){
        return new SimpleDateFormat("dd/MM/yyyy").format(new Date(this.realizado));
    }
    
    
    
}
