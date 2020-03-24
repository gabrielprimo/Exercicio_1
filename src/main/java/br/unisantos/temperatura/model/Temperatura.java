/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.temperatura.model;

/**
 *
 * @author Ciro Cirne Trindade
 */
public class Temperatura  {

    private Double temperatura;
    private String converterPara;
    private Double convertida;
    //private Double stringtemp;
    
   

    public Temperatura() {
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public String getConverterPara() {
        return converterPara;
    }

    public void setConverterPara(String converterPara) {
        this.converterPara = converterPara;
    }

    public Double getConvertida() {
        
        return convertida;
    }

    public void setConvertida(Double convertida) {
        
        this.convertida = convertida;
        
    }

   /* public Double getStringtemp() {
        return stringtemp;
    }

    public void setStringtemp(Double doubletemp) {
        this.stringtemp = 1.234;
    }*/


    
}
