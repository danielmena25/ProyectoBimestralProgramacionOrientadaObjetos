/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.poo.semana7.banco;

/**
 * Esta Clase Ahorros va a representar una cuenta de ahorros bancaria personal.
 * En esta clase solo estan representados los atributos y metodos que mas utilizan 
 * la mayoria de bancos del mundo.
 * @author Carlos Daniel Escudero Mena
 * @author Adrián Alessandro Rivera Cueva
 * @version 1.0
 */
public class Ahorro extends Cuenta{
    private double interesAnual;
    /**
     * Con este constructor se crea una cuenta de ahorros.
     * @param interesAnual Con este parametro se ingresa el interes anual.
     * @param numero Con este parametro se ingresa el numero de cuenta de ahorros.
     * @param saldo Con este parametro se ingresa el saldo inicial de la cuenta de ahorros.
     */
    public Ahorro(double interesAnual, String numero, double saldo) {
        super(numero, saldo);
        this.interesAnual = interesAnual;
    }
    /**
     * Con este metodo se puede retirar de la cuenta de ahorros.
     * @param monto Con este parametro se ingresa el valor a retirar.
     * @throws IllegalArgumentException Se lanza cuando el monto ingresado no es valido.
     */
    public void retirar(double monto)throws IllegalArgumentException{
        if(isMontoValido(monto))
            setSaldo(getSaldo() - monto);
        else
            throw new IllegalArgumentException("El monto no es valido");
    }
    /**
     * Con este metodo get se devuelve el numero de cuenta de ahorro.
     * @return Devuelve el numero de cuenta de ahorro.
     */
    @Override
    public String getNumero(){
        return "CTA-AH-".concat(super.getNumero());
    }
    /**
     * Con este metodo get se devuelve el valor del interes anual.
     * @return Devuelve el interes anual.
     */
    public double getInteresAnual() {
        return interesAnual;
    }
    /**
     * Con este metodo se verifica que el monto sea positivo o valido, este metodo 
     * solo se utiliza en el metodo retirar.
     * @param monto Se ingresa el monto a validar.
     * @return Devuelve true si el monto es valido y false si el monto no es valido.
     */
    private boolean isMontoValido(double monto){
        return monto > 0;
    }
}
