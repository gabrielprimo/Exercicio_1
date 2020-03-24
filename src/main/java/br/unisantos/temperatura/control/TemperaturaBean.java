/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.temperatura.control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.unisantos.temperatura.model.Temperatura;

/**
 *
 * @author Ciro Cirne Trindade
 */
@ManagedBean
@RequestScoped
public class TemperaturaBean {
    private Temperatura temperatura = new Temperatura();
    private static final String[] TEMPERATURAS = { "Celsius", "Fahrenheit" };

    public TemperaturaBean() {
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }


    public String[] getTemperaturas() {
        return TEMPERATURAS;
    }
    
    public String converter() {
        if (temperatura.getConverterPara().equals(TEMPERATURAS[0])) {
            temperatura.setConvertida((temperatura.getTemperatura() - 32) * (5. / 9));
        } 
        else if (temperatura.getConverterPara().equals(TEMPERATURAS[1])) {
            temperatura.setConvertida((temperatura.getTemperatura() * (9. / 5)) + 32);
        }
        //temperatura.setStringtemp().
        return null;
    }
}
