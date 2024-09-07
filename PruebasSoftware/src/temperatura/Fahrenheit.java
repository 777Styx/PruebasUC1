package temperatura;

/**
 *
 * @author Puerta Jullian
 */
public class Fahrenheit {

    //Atributos de clase
    private double valor;

    /**
     * Constructor de Fahrenheit
     *
     * @param valor con el cual se inicilizara
     */
    public Fahrenheit(double valor) {
        this.valor = valor;
    }

    /**
     * Convierte valor inicial de Fahrenheit  a su equivalente en
     * Celsius
     *
     * @return equivalencia en Celsius
     */
    public double toCelsius() {
        return (valor - 32) * 5 / 9;
    }

    /**
     * Convierte valor inicial de Fahrenheit a su equivalente en
     * Kelvin
     *
     * @return equivalencia en Kelvin
     */
    public double toKelvin() {
        return (valor - 32) * 5 / 9 + 273.15;
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
