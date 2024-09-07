package temperatura;

/**
 *
 * @author Puerta Jullian
 */
public class Kelvin {

    //Atributos de clase
    private double valor;

    /**
     * Constructor de Kelvin
     *
     * @param valor con el cual se inicilizara
     */
    public Kelvin(double valor) {
        this.valor = valor;
    }

    /**
     * Convierte valor inicial de Kelvin a su equivalente en Celsius
     *
     * @return equivalencia en Celsius
     */
    public double toCelsius() {
        return valor - 273.15;
    }

    /**
     * Convierte valor inicial de Kelvin a su equivalente en Fahrenheit
     *
     * @return equivalencia en Fahrenheit
     */
    public double toFahrenheit() {
        return (valor - 273.15) * 9 / 5 + 32;
    }

    /**
     * Obtiene el valor en la instancia de Kelvin
     *
     * @return valor contenido en la instancia
     */
    public double getValor() {
        return valor;
    }
}
