package distancia;

/**
 *
 * @author Puerta Jullian
 */
public class Kilometro {

    //Atributos de la clase
    private double valor;

    /**
     * Constructor de kilometro
     *
     * @param valor con el cual se inicilizara
     */
    public Kilometro(double valor) {
        this.valor = valor;
    }

    /**
     * Convierte valor inicial de kilometro convertidos a su equivalente en
     * metro(s)
     *
     * @return equivalencia en metro(s)
     */
    public double toMetro() {
        return valor * 1000;
    }

    /**
     * Convierte valor inicial de kilometro convertidos a su equivalente en
     * milla(s)
     *
     * @return equivalencia en milla(s)
     */
    public double toMilla() {
        return valor / 1.60934;
    }

    /**
     * Obtiene el valor en la instancia de kilometro
     *
     * @return valor contenido en la instancia
     */
    public double getValor() {
        return valor;
    }

}
