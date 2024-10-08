package temperatura;

/**
 *
 * @author Puerta Jullian
 */
public class Celsius {

    //Atributos de clase
    private double valor;

    /**
     * Constructor de Celsius
     *
     * @param valor con el cual se inicilizara
     */
    public Celsius(double valor) {
        this.valor = valor;
    }

    /**
     * Convierte valor inicial de Celisus a su equivalente en
     * Fahrenheit
     *
     * @return equivalencia en Fahrenheit
     */
    public double toFahrenheit() {
        return (valor * 9 / 5) + 32;
    }

    /**
     * Convierte valor inicial de Celisus a su equivalente en Kelvin
     *
     * @return equivalencia en Kelvin
     */
    public double toKelvin() {
        return valor + 273.15;
    }

    /**
     * Obtiene el valor en la instancia de Celsius
     *
     * @return valor contenido en la instancia
     */
    public double getValor() {
        return valor;
    }
}
