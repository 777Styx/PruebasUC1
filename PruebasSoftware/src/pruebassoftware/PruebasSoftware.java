package pruebassoftware;

import distancia.Kilometro;
import distancia.Metro;
import distancia.Milla;
import peso.Gramo;
import peso.Kilogramo;
import peso.Libra;
import temperatura.Celsius;
import temperatura.Fahrenheit;
import temperatura.Kelvin;

/**
 *
 * @author Puerta Jullian
 */
public class PruebasSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Conversión de 5000 metros
        Metro metro = new Metro(5000);
        System.out.println("5000 metros son " + metro.toKilometro() + " kilometros");
        System.out.println("5000 metros son " + metro.toMilla() + " millas");

        // Conversión de 5 kilómetros
        Kilometro kilometro = new Kilometro(5);
        System.out.println("5 kilometros son " + kilometro.toMetro() + " metros");
        System.out.println("5 kilometros son " + kilometro.toMilla() + " millas");

        // Conversión de 3 millas
        Milla milla = new Milla(3);
        System.out.println("3 millas son " + milla.toMetro() + " metros");
        System.out.println("3 millas son " + milla.toKilometro() + " kilometros");

        // Conversión de 1000 gramos
        Gramo gramo = new Gramo(1000);
        System.out.println("1000 gramos son " + gramo.toKilogramo() + " kilogramos");
        System.out.println("1000 gramos son " + gramo.toLibra() + " libras");

        // Conversión de 2 kilogramos
        Kilogramo kilogramo = new Kilogramo(2);
        System.out.println("2 kilogramos son " + kilogramo.toGramo() + " gramos");
        System.out.println("2 kilogramos son " + kilogramo.toLibra() + " libras");

        // Conversión de 5 libras
        Libra libra = new Libra(5);
        System.out.println("5 libras son " + libra.toGramo() + " gramos");
        System.out.println("5 libras son " + libra.toKilogramo() + " kilogramos");

        // Conversión de 25 grados Celsius
        Celsius celsius = new Celsius(25);
        System.out.println("25 grados Celsius son " + celsius.toFahrenheit() + " Fahrenheit");
        System.out.println("25 grados Celsius son " + celsius.toKelvin() + " Kelvin");

        // Conversión de 77 grados Fahrenheit
        Fahrenheit fahrenheit = new Fahrenheit(77);
        System.out.println("77 grados Fahrenheit son " + fahrenheit.toCelsius() + " Celsius");
        System.out.println("77 grados Fahrenheit son " + fahrenheit.toKelvin() + " Kelvin");

        // Conversión de 300 Kelvin
        Kelvin kelvin = new Kelvin(300);
        System.out.println("300 Kelvin son " + kelvin.toCelsius() + " Celsius");
        System.out.println("300 Kelvin son " + kelvin.toFahrenheit() + " Fahrenheit");

    }

}
