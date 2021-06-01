/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.poo.semana7.banco;
import java.time.LocalDate;
/**
 *
 * @author adria
 */
public class Cuenta {
    private double saldo;
    protected String numero;
    private LocalDate fechaApertura;

    /**
     * Este constructor inicializa las variables que dan vida al objeto creado
     * @param numero Se almacena el número de cuenta tal cual fue mandado.
     * @param saldo Se verifica el saldo con el metodo setSaldo y se lo almacena
     */
    public Cuenta(String numero, double saldo) {
        setSaldo(saldo);
        this.numero = numero;
        fechaApertura = LocalDate.now();
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setSaldo(double saldo) {
        if (!validarSaldoNoNegativo(saldo)) 
            this.saldo = saldo;
        else
            throw new IllegalArgumentException("Saldo Negativo");
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void depositar(double monto){
        if(monto > 0)
            saldo += monto;
        else
            throw new IllegalArgumentException("Monto negativo");
    }
    
    private boolean validarSaldoNoNegativo(double monto){
        monto =- saldo;
        return monto < 0;
    }
}
