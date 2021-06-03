package ec.edu.utpl.poo.semana7.banco;

/**
 * Esta Clase Ahorros va a representar una cuenta de ahorros bancaria personal.
 * En esta clase solo están representados los atributos y métodos que más utilizan 
 * la máyoria de bancos del mundo.
 * @author Carlos Daniel Escudero Mena
 * @author Adrián Alessandro Rivera Cueva
 * @version 1.0
 */
public class Ahorro extends Cuenta{
    private double interesAnual;
    
    /**
     * Con este constructor se crea una cuenta de ahorros.
     * @param interesAnual Con este parámetro se ingresa el interés anual.
     * @param numero Con este parámetro se ingresa el número de cuenta de ahorros.
     * @param saldo Con este parámetro se ingresa el saldo inicial de la cuenta de ahorros.
     */
    public Ahorro(double interesAnual, String numero, double saldo) {
        super(numero, saldo);
        this.interesAnual = interesAnual;
    }
    
    /**
     * Con este método se puede retirar de la cuenta de ahorros.
     * @param monto Con este parámetro se ingresa el valor a retirar.
     * @throws IllegalArgumentException Se lanza cuando el monto ingresado no es valido.
     */
    public void retirar(double monto)throws IllegalArgumentException{
        if(isMontoValido(monto))
            setSaldo(getSaldo() - monto);
        else
            throw new IllegalArgumentException("El monto no es valido");
    }
    
    /**
     * Con este método get se devuelve el número de cuenta de ahorro.
     * @return Devuelve el número de cuenta de ahorro.
     */
    @Override
    public String getNumero(){
        return "CTA-AH-".concat(super.getNumero());
    }
    
    /**
     * Con este método get se devuelve el valor del interés anual.
     * @return Devuelve el interés anual.
     */
    public double getInteresAnual() {
        return interesAnual;
    }
    
    /**
     * Con este método se verifica que el monto sea positivo o válido, este metodo 
     * solo se utiliza en el método retirar.
     * @param monto Se ingresa el monto a validar.
     * @return Devuelve true si el monto es válido y false si el monto no es válido.
     */
    private boolean isMontoValido(double monto){
        return monto > 0;
    }
}
