package peso;

/**
 *
 * @author Puerta Jullian
 */
public class Kilogramo {

    //Atributos de la clase
    private double valor;

    /**
     * Constructor de Kilogramo
     *
     * @param valor con el cual se inicilizara
     */
    public Kilogramo(double valor) {
        this.valor = valor;
    }

    /**
     * Convierte valor inicial de Kilogramo(s) convertidos a su equivalente en
     * Gramo(s)
     *
     * @return equivalencia en Gramo(s)
     */
    public double toGramo() {
        return valor * 1000;
    }

    /**
     * Convierte valor inicial de Kilogramo(s) convertidos a su equivalente en
     * Libra(s)
     *
     * @return equivalencia en Libra(s)
     */
    public double toLibra() {
        return valor * 2.20462;
    }

    /**
     * Obtiene el valor en la instancia de Kilogramo
     *
     * @return valor contenido en la instancia
     */
    public double getValor() {
        return valor;
    }
}
