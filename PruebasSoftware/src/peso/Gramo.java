package peso;

/**
 *
 * @author julli
 */
public class Gramo {

    //Atributos de la clase
    private double valor;

    /**
     * Constructor de Gramo
     *
     * @param valor con el cual se inicilizara
     */
    public Gramo(double valor) {
        this.valor = valor;
    }

    /**
     * Convierte valor inicial de Gramo(s) convertidos a su equivalente en
     * Kilogramo(s)
     *
     * @return equivalencia en Kilogramo(s)
     */
    public double toKilogramo() {
        return valor / 1000;
    }

    /**
     * Convierte valor inicial de Gramo(s) convertidos a su equivalente en
     * Libra(s)
     *
     * @return equivalencia en Libra(s)
     */
    public double toLibra() {
        return valor / 453.592;
    }

    /**
     * Obtiene el valor en la instancia de Gramo
     *
     * @return valor contenido en la instancia
     */
    public double getValor() {
        return valor;
    }
}
