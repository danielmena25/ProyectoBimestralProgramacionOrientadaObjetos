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
public class Ahorro extends Cuenta{
    private double interesAnual;

    public Ahorro(double interesAnual, String numero, double saldo) {
        super(numero, saldo);
        this.interesAnual = interesAnual;
    }
    
    public void retirar(double monto){
        if(isMontoValido(monto))
            setSaldo(getSaldo() - monto);
        else
            throw new IllegalArgumentException("El monto no es valido");
    }
    
    @Override
    public String getNumero(){
        return "CTA-AH-".concat(super.getNumero());
    }

    public double getInteresAnual() {
        return interesAnual;
    }
    
    private boolean isMontoValido(double monto){
        return monto > 0;
    }
}
