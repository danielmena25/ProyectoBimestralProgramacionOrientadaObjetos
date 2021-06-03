/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.poo.semana7.banco;

/**
 * En esta clase SecuencialCheque se representan las secuencias validas para los cheques de las cuentas corrientes.
 * En esta clase solo estan representados los atributos y metodos que mas utilizan 
 * los seriales de los cheques en la mayoria de bancos del mundo.
 * @author Carlos Daniel Escudero Mena
 * @author Adrián Alessandro Rivera Cueva
 * @version 1.0
 */
public class SecuencialCheque {
    private String inicio;
    private String fin;
    
    /**
     * Con este metodo get se obtiene el serial inicial de los cheque.
     * @return Se devuelve el valor almacenado en el atributo inicio.
     */
    public String getInicio() {
        return inicio;
    }
    /**
     * Con este metodo set se obtiene el serial final de los cheques.
     * @return Se devuelve el valor almacenado en el atributo fin.
     */
    public String getFin() {
        return fin;
    }
    /**
     * Con este metodo set se modifica el serial inicial de los cheques.
     * @param inicio Se introduce el valor a reasignar al inicio del serial de los cheques.
     */
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }
    /**
     * Con este metodo set se modifica el serial final de los cheques.
     * @param fin Se introduce el valor a reasignar al fin del serial de los cheques.
     */
    public void setFin(String fin) {
        this.fin = fin;
    }
}
