package distancia;

/**
 *
 * @author Puerta Jullian
 */
public class Metro {

    //Atributos de la clase
    private double valor;

    /**
     *
     * @param valor con el cual se inicilizara
     */
    public Metro(double valor) {
        this.valor = valor;
    }

    /**
     * Convierte valor inicial de Metro(s) convertido(s) a su equivalente en
     * Kilometro(s)
     *
     * @return quivalencia en kilometro(s)
     */
    public double toKilometro() {
        return valor / 1000;
    }

    /**
     * Convierte valor inicial de Metro(s) convertido(s) a su equivalente en
     * Milla(s)
     *
     * @return quivalencia en milla(s)
     */
    public double toMilla() {
        return valor / 1609.34;
    }

    /**
     * Obtiene el valor en la instancia de metro
     *
     * @return valor contenido en la instancia
     */
    public double getValor() {
        return valor;
    }
}
