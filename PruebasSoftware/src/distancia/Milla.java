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

    // Convertir millas a metros
    public double toMetro() {
        return valor * 1609.34;
    }

    // Convertir millas a kilómetros
    public double toKilometro() {
        return valor * 1.60934;
    }

    public double getValor() {
        return valor;
    }
}
