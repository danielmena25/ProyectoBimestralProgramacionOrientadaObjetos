package ec.edu.utpl.poo.semana7.banco;

/**
 * Esta Clase Corriente va a representar una cuenta corriente bancaria.
 * En esta clase solo estan representados los atributos y métodos que mas utilizan 
 * la mayoria de bancos del mundo.
 * @author Carlos Daniel Escudero Mena
 * @author Adrián Alessandro Rivera Cueva
 * @version 1.0
 */
public class Corriente extends Cuenta{
    private int nroMaxCheques;
    private SecuencialCheque secuenciaCh;
    
    /**
     * Con este constructor se crea la cuenta corriente.
     * @param numero Con este parámetro se ingresa el número de la cuenta corriente.
     * @param saldo Con este parámetro se ingresa el saldo inicial de la cuenta corriente.
     */
    public Corriente(String numero, double saldo) {
        super(numero, saldo);
    }
    
    /**
     * Con este método get se obtiene el numero máximo de cheques.
     * @return Devuelve el número máximo de cheques.
     */
    public int getNroMaxCheques() {
        return nroMaxCheques;
    }
    
    /**
     * Con este método get se obtiene las secuencias numéricas de los cheques. 
     * @return Devuelve la secuencia numérica del cheque.
     */
    public SecuencialCheque getSecuenciaCh() {
        return secuenciaCh;
    }
    /**
     * Con este método get se devuelve el número de cuenta de ahorro.
     * @return Devuelve el número de cuenta corriente.
     */
    @Override
    public String getNumero() {
        return "CTA-CO-".concat(super.getNumero());
    }
    
    /**
     * Con este método set se modifica el número máximo de cheques.
     * @param nroMaxCheques Devuelve el numero máximo de cheques.
     */
    public void setNroMaxCheques(int nroMaxCheques) {
        this.nroMaxCheques = nroMaxCheques;
    }
}
