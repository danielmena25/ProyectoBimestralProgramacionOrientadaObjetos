/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.poo.semana7.banco;

/**
 * @author Carlos Daniel Escudero Mena
 * @author Adrián Alessandro Rivera Cueva
 */
public class SecuencialCheque {
    private String inicio;
    private String fin;
    
    /**
     * Con este metodo get se obtiene el valor del atributo inicio.
     * @return Se devuelve el valor almacenado en el atributo inicio.
     */
    public String getInicio() {
        return inicio;
    }
    /**
     * Con este metodo set se obtiene el valor del atributo fin.
     * @return Se devuelve el valor almacenado en el atributo fin.
     */
    public String getFin() {
        return fin;
    }
    /**
     * Con este metodo set se modifica el valor del atributo inicio.
     * @param inicio Se introduce el valor a reasignar al atributo inicio.
     */
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }
    /**
     * Con este metodo set se modifica el valor del atributo fin.
     * @param fin Se introduce el valor a reasignar al atributo fin.
     */
    public void setFin(String fin) {
        this.fin = fin;
    }
}
