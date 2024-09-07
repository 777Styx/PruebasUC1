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

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Puerta Jullian
 */
public class PruebasSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int tipoConversion = 0 ;

        do {
            try {
                System.out.println("¿Que tipo de conversión te gustaria hacer? (1 DISTANCIA | 2 PESO | 3 TEMPERATURA)");
                tipoConversion = input.nextInt();

                if(tipoConversion == 1) {
                    conversionForDistancia();
                } else if(tipoConversion == 2) {
                    conversionForPeso();
                } else if(tipoConversion == 3) {
                    conversionForTemperatura();
                } else {
                    System.out.println("Ingresa un valor valido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un valor valido");
                input.nextLine() ;
                tipoConversion = 0 ;
            }
        } while(tipoConversion < 1 || tipoConversion > 3) ;









//        // Conversión de 5000 metros
//        Metro metro = new Metro(5000);
//        System.out.println("5000 metros son " + metro.toKilometro() + " kilometros");
//        System.out.println("5000 metros son " + metro.toMilla() + " millas");
//
//        // Conversión de 5 kilómetros
//        Kilometro kilometro = new Kilometro(5);
//        System.out.println("5 kilometros son " + kilometro.toMetro() + " metros");
//        System.out.println("5 kilometros son " + kilometro.toMilla() + " millas");
//
//        // Conversión de 3 millas
//        Milla milla = new Milla(3);
//        System.out.println("3 millas son " + milla.toMetro() + " metros");
//        System.out.println("3 millas son " + milla.toKilometro() + " kilometros");
//
//        // Conversión de 1000 gramos
//        Gramo gramo = new Gramo(1000);
//        System.out.println("1000 gramos son " + gramo.toKilogramo() + " kilogramos");
//        System.out.println("1000 gramos son " + gramo.toLibra() + " libras");
//
//        // Conversión de 2 kilogramos
//        Kilogramo kilogramo = new Kilogramo(2);
//        System.out.println("2 kilogramos son " + kilogramo.toGramo() + " gramos");
//        System.out.println("2 kilogramos son " + kilogramo.toLibra() + " libras");
//
//        // Conversión de 5 libras
//        Libra libra = new Libra(5);
//        System.out.println("5 libras son " + libra.toGramo() + " gramos");
//        System.out.println("5 libras son " + libra.toKilogramo() + " kilogramos");
//
//        // Conversión de 25 grados Celsius
//        Celsius celsius = new Celsius(25);
//        System.out.println("25 grados Celsius son " + celsius.toFahrenheit() + " Fahrenheit");
//        System.out.println("25 grados Celsius son " + celsius.toKelvin() + " Kelvin");
//
//        // Conversión de 77 grados Fahrenheit
//        Fahrenheit fahrenheit = new Fahrenheit(77);
//        System.out.println("77 grados Fahrenheit son " + fahrenheit.toCelsius() + " Celsius");
//        System.out.println("77 grados Fahrenheit son " + fahrenheit.toKelvin() + " Kelvin");
//
//        // Conversión de 300 Kelvin
//        Kelvin kelvin = new Kelvin(300);
//        System.out.println("300 Kelvin son " + kelvin.toCelsius() + " Celsius");
//        System.out.println("300 Kelvin son " + kelvin.toFahrenheit() + " Fahrenheit");

    }

    public static void conversionForDistancia() {
        System.out.println("AQUI SE MANEJA LA CONVERSION POR DISTANCIA");
    }

    public static void conversionForPeso() {
        System.out.println("AQUI SE MANEJA LA CONVERSION POR PESO");
    }

    public static void conversionForTemperatura() {
        System.out.println("AQUI SE MANEJA LA CONVERSION POR TEMPERATURA");
    }

}
