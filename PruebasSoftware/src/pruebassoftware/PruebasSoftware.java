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
        Scanner input = new Scanner(System.in);
        int tipoConversion = 0;

        do {
            try {
                System.out.println("¿Que tipo de conversion te gustaria hacer? (1 DISTANCIA | 2 PESO | 3 TEMPERATURA)");
                tipoConversion = input.nextInt();

                if (tipoConversion == 1) {
                    conversionForDistancia(input);
                } else if (tipoConversion == 2) {
                    conversionForPeso();
                } else if (tipoConversion == 3) {
                    conversionForTemperatura();
                } else {
                    System.out.println("Ingresa un valor valido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un valor valido");
                input.nextLine();
                tipoConversion = 0;
            }
        } while (tipoConversion < 1 || tipoConversion > 3);

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

    /*
    Metodo de conversor de unidades de distancia.
     */
    public static void conversionForDistancia(Scanner input) {
        int unidadInicial = 0 ;
        int unidadConvertida = 0 ;

        do{
            try{
                System.out.println("AQUI SE MANEJA LA CONVERSION POR DISTANCIA");
                System.out.println("");
                System.out.println("Seleccione la unidad incial: (1 KILOMETRO | 2 METRO | 3 MILLA) ");
                unidadInicial = input.nextInt();
                System.out.println("Ingrese el valor a convertir: ");
                double valor = input.nextDouble();
                System.out.println("Seleccione la unidad a convertir: (1 KILOMETRO | 2 METRO | 3 MILLA) ");
                unidadConvertida = input.nextInt();

                double resultado = 0;

                switch (unidadInicial) {
                    // En caso de seleccionar Kilometro como la unidad incial.
                    case 1:
                        Kilometro kilometro = new Kilometro(valor);
                        switch (unidadConvertida) {
                            case 1:
                                System.out.println("Se esta realizando una conversion de la misma unidad");
                                throw new Exception() ;
                            case 2:
                                resultado = kilometro.toMetro();
                                System.out.println(valor + " kilometros = " + resultado + " metros");
                                break;
                            case 3:
                                resultado = kilometro.toMilla();
                                System.out.println(valor + " kilometros = " + resultado + " millas");
                                break;
                            default:
                                System.out.println("Ingresa una opcion valida");
                                break;
                        }
                        break;
                    // En caso de seleccionar Metro como la unidad incial.
                    case 2:
                        Metro metro = new Metro(valor);
                        switch (unidadConvertida) {
                            case 1:
                                resultado = metro.toKilometro();
                                System.out.println(valor + " metros = " + resultado + " kilometros");
                                break;
                            case 2:
                                System.out.println("Se esta realizando una conversion de la misma unidad");
                                throw new Exception() ;
                            case 3:
                                resultado = metro.toMilla();
                                System.out.println(valor + " metros = " + resultado + " millas");
                                break;
                            default:
                                System.out.println("Ingresa una opcion valida");
                                break;
                        }
                        break;
                    // En caso de seleccionar Milla como la unidad incial.
                    case 3:
                        Milla milla = new Milla(valor);
                        switch (unidadConvertida) {
                            case 1:
                                resultado = milla.toKilometro();
                                System.out.println(valor + " millas = " + resultado + " kilometros");
                                break;
                            case 2:
                                resultado = milla.toMetro();
                                System.out.println(valor + " millas = " + resultado + " metros");
                                break;
                            case 3:
                                System.out.println("Se esta realizando una conversion de la misma unidad");
                                throw new Exception() ;
                            default:
                                System.out.println("Ingresa una opcion valida");
                                break;
                        }
                        break;

                    // Caso de error.
                    default:
                        System.out.println("Ingresa una opcion valida");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un valor valido");
                input.nextLine();
                unidadInicial = 0;
                unidadConvertida = 0 ;
            } catch (Exception e) {
                System.out.println("Ingresa una opcion valida");
                input.nextLine();
                unidadInicial = 0;
                unidadConvertida = 0 ;
            }
        } while((unidadInicial < 1 || unidadInicial > 3) || (unidadConvertida < 1 || unidadConvertida > 3)) ;

    }

    public static void conversionForPeso() {
        System.out.println("AQUI SE MANEJA LA CONVERSION POR PESO");
    }

    public static void conversionForTemperatura() {
        System.out.println("AQUI SE MANEJA LA CONVERSION POR TEMPERATURA");
    }

}
