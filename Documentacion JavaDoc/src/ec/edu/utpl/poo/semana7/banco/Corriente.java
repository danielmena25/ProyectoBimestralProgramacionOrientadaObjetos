/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.poo.semana7.banco;

/**
 *
 * @author adria
 */
public class Corriente extends Cuenta{
    private int nroMaxCheques;
    private SecuencialCheque secuenciaCh;

    public Corriente(String numero, double saldo) {
        super(numero, saldo);
    }

    public int getNroMaxCheques() {
        return nroMaxCheques;
    }

    public SecuencialCheque getSecuenciaCh() {
        return secuenciaCh;
    }

    public void setNroMaxCheques(int nroMaxCheques) {
        this.nroMaxCheques = nroMaxCheques;
    }
}
