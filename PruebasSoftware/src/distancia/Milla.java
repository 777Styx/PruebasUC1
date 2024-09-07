package distancia;

/**
 *
 * @author Puerta Jullian
 */
public class Milla {

    private double valor;

    public Milla(double valor) {
        this.valor = valor;
    }

    /**
     * Convierte valor inicial de Milla(s) convertido(s) a su equivalente en
     * Metro(s)
     *
     * @return quivalencia en Metro(s)
     */
    public double toMetro() {
        return valor * 1609.34;
    }

    /**
     * Convierte valor inicial de Milla(s) convertido(s) a su equivalente en
     * Kilometro(s)
     *
     * @return quivalencia en Kilometro(s)
     */
    public double toKilometro() {
        return valor * 1.60934;
    }

    /**
     * Obtiene el valor en la instancia de Milla
     *
     * @return valor contenido en la instancia
     */
    public double getValor() {
        return valor;
    }
}
