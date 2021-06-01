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
public class Corriente extends Cuenta{
    private int nroMaxCheques;
    private SecuencialCheque secuenciaCh;
    /**
     * Con este constructor se crea la cuenta corriente.
     * @param numero Con este parametro se ingresa el numero de la cuenta corriente.
     * @param saldo Con este parametro se ingresa el saldo inicial de la cuenta corriente.
     */
    public Corriente(String numero, double saldo) {
        super(numero, saldo);
    }
    /**
     * Con este metodo get se obtiene el numero maximo de cheques.
     * @return Devuelve el numero maximo de cheques.
     */
    public int getNroMaxCheques() {
        return nroMaxCheques;
    }
    /**
     * Con este metodo get se obtiene la secuencia numerica del cheque. 
     * @return Devuelve la secuencia numerica del cheque.
     */
    public SecuencialCheque getSecuenciaCh() {
        return secuenciaCh;
    }
    /**
     * Con este metodo set se modifica el numero de cheques.
     * @param nroMaxCheques Devuelve el numero maximo de cheques.
     */
    public void setNroMaxCheques(int nroMaxCheques) {
        this.nroMaxCheques = nroMaxCheques;
    }
}
