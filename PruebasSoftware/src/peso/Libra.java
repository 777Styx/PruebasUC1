package peso;

/**
 *
 * @author Puerta Jullian
 */
public class Libra {

    //Atributos de la clase
    private double valor;

    /**
     * Constructor de Libra
     *
     * @param valor con el cual se inicilizara
     */
    public Libra(double valor) {
        this.valor = valor;
    }

    /**
     * Convierte valor inicial de Libra(s) convertidos a su equivalente en
     * Gramo(s)
     *
     * @return equivalencia en Gramo(s)
     */
    public double toGramo() {
        return valor * 453.592;
    }

    /**
     * Convierte valor inicial de Libra(s) convertidos a su equivalente en
     * Kilogramo(s)
     *
     * @return equivalencia en Kilogramo(s)
     */
    public double toKilogramo() {
        return valor / 2.20462;
    }

    /**
     * Obtiene el valor en la instancia de Libra
     *
     * @return valor contenido en la instancia
     */
    public double getValor() {
        return valor;
    }
}
