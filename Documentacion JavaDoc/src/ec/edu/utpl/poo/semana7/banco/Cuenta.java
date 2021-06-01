/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.poo.semana7.banco;
import java.time.LocalDate;
/**
 * @author Adrián Alessandro Rivera Cueva
 * @author Carlos Daniel Escudero Mena 
 */
public class Cuenta {
    private double saldo;
    protected String numero;
    private LocalDate fechaApertura;

    /**
     * Este constructor inicializa las variables que dan vida al objeto creado.
     * @param numero Se almacena el número de cuenta tal cual fue mandado.
     * @param saldo Se verifica el saldo con el metodo setSaldo y se lo almacena.
     */
    public Cuenta(String numero, double saldo) {
        setSaldo(saldo);
        this.numero = numero;
        fechaApertura = LocalDate.now();
    }
    
    /**
     * Con este metodo get se devuelve el saldo que tiene la cuenta.
     * @return Devuelve el valor de saldo.
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Con este metodo get se devuelve el numero de cuenta.
     * @return Devuelve el valor de numero.
     */
    public String getNumero() {
        return numero;
    }
    /**
     * Con este metodo se cambia el valor de saldo.
     * @param saldo Con este parametro mandas el valor que quieres asignar a saldo.
     * @throws IllegalArgumentException Se lanza cuando el saldo es negativo.
     */
    public void setSaldo(double saldo) throws IllegalArgumentException{
        if (!validarSaldoNoNegativo(saldo)) 
            this.saldo = saldo;
        else
            throw new IllegalArgumentException("Saldo Negativo");
    }
    /**
     * Con este metodo se cambia el número de cuenta.
     * @param numero Con este parametro se manda el valor a asignar a numero.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    /**
     * Con este metodo se puede depositar en la cuenta.
     * @param monto Con este parametro se ingresa el valor a depositar.
     * @throws IllegalArgumentException Se lanza cuando el monto ingresado es negativo.
     */
    public void depositar(double monto) throws IllegalArgumentException{
        if(monto > 0)
            saldo += monto;
        else
            throw new IllegalArgumentException("Monto negativo");
    }
    /**
     * Con este metodo se valida si el saldo ingresado es negativo.
     * @param saldo Con este parametro se manda el valor a verificar si es positivo.
     * @return Devuelve true si el saldo es negativo o false si no es negetivo.
     */
    private boolean validarSaldoNoNegativo(double saldo){
        saldo =- this.saldo;
        return saldo < 0;
    }
}
