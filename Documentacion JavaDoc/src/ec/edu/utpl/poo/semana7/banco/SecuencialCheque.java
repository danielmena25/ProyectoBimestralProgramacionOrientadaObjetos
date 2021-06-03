package ec.edu.utpl.poo.semana7.banco;

/**
 * En esta clase SecuencialCheque se representan las secuencias válidas para los cheques de las cuentas corrientes.
 * En esta clase solo estan representados los atributos y métodos que mas utilizan 
 * los seriales de los cheques en la mayoría de bancos del mundo.
 * @author Carlos Daniel Escudero Mena
 * @author Adrián Alessandro Rivera Cueva
 * @version 1.0
 */
public class SecuencialCheque {
    private String inicio;
    private String fin;
    
    /**
     * Con este método get se obtiene el serial inicial de los cheques.
     * @return Se devuelve el valor almacenado en el atributo inicio.
     */
    public String getInicio() {
        return inicio;
    }
    
    /**
     * Con este método set se obtiene el serial final de los cheques.
     * @return Se devuelve el valor almacenado en el atributo fin.
     */
    public String getFin() {
        return fin;
    }
    
    /**
     * Con este método set se modifica el serial inicial de los cheques.
     * @param inicio Se introduce el valor a reasignar al inicio del serial de los cheques.
     */
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }
    
    /**
     * Con este método set se modifica el serial final de los cheques.
     * @param fin Se introduce el valor a reasignar al fin del serial de los cheques.
     */
    public void setFin(String fin) {
        this.fin = fin;
    }
}
