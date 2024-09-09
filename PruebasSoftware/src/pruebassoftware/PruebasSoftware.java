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
        int continuar = 0;

        do {
            try {
                System.out.println("¿Que tipo de conversion te gustaria hacer? (1 DISTANCIA | 2 PESO | 3 TEMPERATURA | 4 SALIR)");
                tipoConversion = input.nextInt();

                if (tipoConversion == 1) {
                    conversionForDistancia(input);
                } else if (tipoConversion == 2) {
                    conversionForPeso(input);
                } else if (tipoConversion == 3) {
                    conversionForTemperatura(input);
                } else if(tipoConversion == 4) {
                    System.exit(0);
                } else {
                    System.out.println("Ingresa un valor valido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un valor valido");
                input.nextLine();
                tipoConversion = 0;
            }

            int validador = 0;
            do{

                try{

                    System.out.println("¿Le gustaria hacer otra conversion? (1: Si | 2: No)");
                    continuar = input.nextInt();
                    validador = 1;
                    if(continuar < 1 || continuar > 2){

                        System.out.println("Ingresa un valor valido");
                        validador = 0;

                    }

                }catch (InputMismatchException e) {
                    System.out.println("Ingresa un valor valido");
                    validador = 0;
                    input.nextLine();
                } catch (Exception e) {
                    System.out.println("Ingresa una opcion valida");
                    validador = 0;
                    input.nextLine();
                }

            }while (validador == 0);



        } while ((tipoConversion < 1 || tipoConversion > 4) || (continuar == 1));

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
        int unidadInicial = 0;
        int unidadConvertida = 0;

        do {
            try {
                System.out.println("AQUI SE MANEJA LA CONVERSION POR DISTANCIA");
                System.out.println("");
                int validador = 0;

                // Selección de unidad inicial
                do {
                    try {
                        System.out.println("Seleccione la unidad inicial: (1 KILOMETRO | 2 METRO | 3 MILLA)");
                        unidadInicial = input.nextInt();
                        validador = 1;
                        if (unidadInicial < 1 || unidadInicial > 3) {
                            System.out.println("Ingrese una opción válida");
                            validador = 0;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Ingresa un valor válido");
                        validador = 0;
                        input.next();
                    } catch (Exception e) {
                        System.out.println("Ingresa una opción válida");
                        validador = 0;
                        input.next();
                    }
                } while (validador == 0);

                // Ingreso del valor a convertir
                validador = 0;
                double valor = 0;
                do {
                    try {
                        System.out.println("Ingrese el valor a convertir: ");
                        valor = input.nextDouble();
                        validador = 1;
                    } catch (InputMismatchException e) {
                        System.out.println("Ingresa un valor válido");
                        validador = 0;
                        input.next();
                    } catch (Exception e) {
                        System.out.println("Ingresa una opción válida");
                        validador = 0;
                        input.next();
                    }
                } while (validador == 0);

                // Selección de unidad convertida
                validador = 0;
                do {
                    try {
                        System.out.println("Seleccione la unidad a convertir: (1 KILOMETRO | 2 METRO | 3 MILLA)");
                        unidadConvertida = input.nextInt();
                        validador = 1;
                        if (unidadConvertida < 1 || unidadConvertida > 3) {
                            System.out.println("Ingrese una opción válida");
                            validador = 0;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Ingresa un valor válido");
                        validador = 0;
                        input.next();
                    } catch (Exception e) {
                        System.out.println("Ingresa una opción válida");
                        validador = 0;
                        input.next();
                    }
                } while (validador == 0);

                // Realización de la conversión
                double resultado = 0;
                switch (unidadInicial) {
                    case 1:
                        Kilometro kilometro = new Kilometro(valor);
                        switch (unidadConvertida) {
                            case 1:
                                System.out.println("Se está realizando una conversión de la misma unidad");
                                throw new Exception();
                            case 2:
                                resultado = kilometro.toMetro();
                                System.out.println(valor + " kilómetros = " + resultado + " metros");
                                break;
                            case 3:
                                resultado = kilometro.toMilla();
                                System.out.println(valor + " kilómetros = " + resultado + " millas");
                                break;
                            default:
                                System.out.println("Ingresa una opción válida");
                                break;
                        }
                        break;
                    case 2:
                        Metro metro = new Metro(valor);
                        switch (unidadConvertida) {
                            case 1:
                                resultado = metro.toKilometro();
                                System.out.println(valor + " metros = " + resultado + " kilómetros");
                                break;
                            case 2:
                                System.out.println("Se está realizando una conversión de la misma unidad");
                                throw new Exception();
                            case 3:
                                resultado = metro.toMilla();
                                System.out.println(valor + " metros = " + resultado + " millas");
                                break;
                            default:
                                System.out.println("Ingresa una opción válida");
                                break;
                        }
                        break;
                    case 3:
                        Milla milla = new Milla(valor);
                        switch (unidadConvertida) {
                            case 1:
                                resultado = milla.toKilometro();
                                System.out.println(valor + " millas = " + resultado + " kilómetros");
                                break;
                            case 2:
                                resultado = milla.toMetro();
                                System.out.println(valor + " millas = " + resultado + " metros");
                                break;
                            case 3:
                                System.out.println("Se está realizando una conversión de la misma unidad");
                                throw new Exception();
                            default:
                                System.out.println("Ingresa una opción válida");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Ingresa una opción válida");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Ingresa un valor válido");
                input.nextLine();
                unidadInicial = 0;
                unidadConvertida = 0;
            } catch (Exception e) {
                System.out.println("Ingresa una opción válida");
                input.nextLine();
                unidadInicial = 0;
                unidadConvertida = 0;
            }
        } while ((unidadInicial < 1 || unidadInicial > 3) || (unidadConvertida < 1 || unidadConvertida > 3));
    }


    public static void conversionForPeso(Scanner input) {
        int unidadInicial = 0;
        int unidadConvertida = 0;

        do {
            try {
                System.out.println("AQUI SE MANEJA LA CONVERSION POR PESO");
                System.out.println("");
                int validador = 0;

                // Selección de unidad inicial
                do {
                    try {
                        System.out.println("Seleccione la unidad inicial: (1 GRAMO | 2 KILOGRAMO | 3 LIBRA)");
                        unidadInicial = input.nextInt();
                        validador = 1;
                        if (unidadInicial < 1 || unidadInicial > 3) {
                            System.out.println("Ingrese una opción válida");
                            validador = 0;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Ingresa un valor válido");
                        validador = 0;
                        input.next();
                    } catch (Exception e) {
                        System.out.println("Ingresa una opción válida");
                        validador = 0;
                        input.next();
                    }
                } while (validador == 0);

                // Ingreso del valor a convertir
                validador = 0;
                double valor = 0;
                do {
                    try {
                        System.out.println("Ingrese el valor a convertir: ");
                        valor = input.nextDouble();
                        validador = 1;
                    } catch (InputMismatchException e) {
                        System.out.println("Ingresa un valor válido");
                        validador = 0;
                        input.next();
                    } catch (Exception e) {
                        System.out.println("Ingresa una opción válida");
                        validador = 0;
                        input.next();
                    }
                } while (validador == 0);

                // Selección de unidad convertida
                validador = 0;
                do {
                    try {
                        System.out.println("Seleccione la unidad a convertir: (1 GRAMO | 2 KILOGRAMO | 3 LIBRA)");
                        unidadConvertida = input.nextInt();
                        validador = 1;
                        if (unidadConvertida < 1 || unidadConvertida > 3) {
                            System.out.println("Ingrese una opción válida");
                            validador = 0;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Ingresa un valor válido");
                        validador = 0;
                        input.next();
                    } catch (Exception e) {
                        System.out.println("Ingresa una opción válida");
                        validador = 0;
                        input.next();
                    }
                } while (validador == 0);

                // Realización de la conversión
                double resultado = 0;
                switch (unidadInicial) {
                    case 1:
                        Gramo gramo = new Gramo(valor);
                        switch (unidadConvertida) {
                            case 1:
                                System.out.println("Se está realizando una conversión de la misma unidad");
                                throw new Exception();
                            case 2:
                                resultado = gramo.toKilogramo();
                                System.out.println(valor + " gramos = " + resultado + " kilogramos");
                                break;
                            case 3:
                                resultado = gramo.toLibra();
                                System.out.println(valor + " gramos = " + resultado + " libras");
                                break;
                            default:
                                System.out.println("Ingresa una opción válida");
                                break;
                        }
                        break;
                    case 2:
                        Kilogramo kilogramo = new Kilogramo(valor);
                        switch (unidadConvertida) {
                            case 1:
                                resultado = kilogramo.toGramo();
                                System.out.println(valor + " kilogramos = " + resultado + " gramos");
                                break;
                            case 2:
                                System.out.println("Se está realizando una conversión de la misma unidad");
                                throw new Exception();
                            case 3:
                                resultado = kilogramo.toLibra();
                                System.out.println(valor + " kilogramos = " + resultado + " libras");
                                break;
                            default:
                                System.out.println("Ingresa una opción válida");
                                break;
                        }
                        break;
                    case 3:
                        Libra libra = new Libra(valor);
                        switch (unidadConvertida) {
                            case 1:
                                resultado = libra.toGramo();
                                System.out.println(valor + " libras = " + resultado + " gramos");
                                break;
                            case 2:
                                resultado = libra.toKilogramo();
                                System.out.println(valor + " libras = " + resultado + " kilogramos");
                                break;
                            case 3:
                                System.out.println("Se está realizando una conversión de la misma unidad");
                                throw new Exception();
                            default:
                                System.out.println("Ingresa una opción válida");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Ingresa una opción válida");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Ingresa un valor válido");
                input.nextLine();
                unidadInicial = 0;
                unidadConvertida = 0;
            } catch (Exception e) {
                System.out.println("Ingresa una opción válida");
                input.nextLine();
                unidadInicial = 0;
                unidadConvertida = 0;
            }
        } while ((unidadInicial < 1 || unidadInicial > 3) || (unidadConvertida < 1 || unidadConvertida > 3));
    }


    public static void conversionForTemperatura(Scanner input){

        int unidadInicial = 0;
        int unidadFinal = 0;

        do{

            try{

                System.out.println("AQUI SE MANEJA LA CONVERSION POR TEMPERATURA");
                System.out.println("");
                int validador = 0;
                do{

                    try{

                        System.out.println("Seleccione la unidad incial: (1 CELSIUS | 2 FAHRENHEIT | 3 KELVIN) ");
                        unidadInicial = input.nextInt();
                        validador = 1;
                        if(unidadInicial < 1 || unidadInicial > 3){

                            System.out.println("Ingrese una opcion valida");
                            validador = 0;

                        }

                    } catch (InputMismatchException e) {
                        System.out.println("Ingresa un valor valido");
                        validador = 0;
                        input.next();

                    } catch (Exception e) {
                        System.out.println("Ingresa una opcion valida");
                        validador = 0;
                        input.next();
                    }

                }while (validador == 0);

                validador = 0;
                double valor = 0;
                do{

                    try{

                        System.out.println("Ingrese el valor a convertir: ");
                        valor = input.nextDouble();
                        validador = 1;

                    }catch (InputMismatchException e) {
                        System.out.println("Ingresa un valor valido");
                        validador = 0;
                        input.next();

                    } catch (Exception e) {
                        System.out.println("Ingresa una opcion valida");
                        validador = 0;
                        input.next();
                    }

                }while (validador == 0);


                validador = 0;
                do{
                    try{

                        System.out.println("Seleccione la unidad a convertir: (1 CELSIUS | 2 FAHRENHEIT | 3 KELVIN) ");
                        unidadFinal = input.nextInt();
                        validador = 1;
                        if(unidadFinal < 1 || unidadFinal > 3){

                            System.out.println("Ingrese una opcion valida");
                            validador = 0;

                        }

                    }catch (InputMismatchException e) {
                        System.out.println("Ingresa un valor valido");
                        validador = 0;
                        input.next();

                    } catch (Exception e) {
                        System.out.println("Ingresa una opcion valida");
                        validador = 0;
                        input.next();
                    }

                } while (validador == 0);



                double resultado = 0;

                switch ( unidadInicial ){

                    case 1:
                        Celsius celsisu = new Celsius(valor);
                        switch (unidadFinal){

                            case 1:
                                System.out.println("Se esta realizando una conversion de la misma unidad");
                                throw new Exception();

                            case 2:
                                resultado = celsisu.toFahrenheit();
                                System.out.println(valor + " Celsius = " + resultado + " Fahrenheit");
                                break;

                            case 3:
                                resultado = celsisu.toKelvin();
                                System.out.println(valor + " Celsius = " + resultado + " Kelvin");
                                break;

                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;

                        }

                        break;

                    case 2:
                        Fahrenheit fahrenheit = new Fahrenheit(valor);
                        switch (unidadFinal){

                            case 1:
                                resultado = fahrenheit.toCelsius();
                                System.out.println(valor + " Fahrenheit = " + resultado + " Celsius");
                                break;

                            case 2:
                                System.out.println("Se esta realizando una conversion de la misma unidad");
                                throw new Exception();

                            case 3:
                                resultado = fahrenheit.toKelvin();
                                System.out.println(valor + " Fahrenheit = " + resultado + " Kelvin");
                                break;

                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;

                        }

                        break;

                    case 3:
                        Kelvin kelvin = new Kelvin(valor);
                        switch (unidadFinal){

                            case 1:
                                resultado = kelvin.toCelsius();
                                System.out.println(valor + " Fahrenheit = " + resultado + " Celsius");
                                break;

                            case 2:
                                resultado = kelvin.toFahrenheit();
                                System.out.println(valor + " Kelvin = " + resultado + " Fahrenheit");
                                break;

                            case 3:
                                System.out.println("Se esta realizando una conversion de la misma unidad");
                                throw new Exception();

                            default:
                                System.out.println("Ingrese una opcion valida");
                                break;

                        }

                        break;

                    default:
                        System.out.println("Ingresa una opcion valida");
                        break;

                }

            } catch (InputMismatchException e) {
                System.out.println("Ingresa un valor valido");
                input.nextLine();
                unidadInicial = 0;
                unidadFinal = 0;
            } catch (Exception e) {
                System.out.println("Ingresa una opcion valida");
                input.nextLine();
                unidadInicial = 0;
                unidadFinal = 0;
            }

        } while ((unidadInicial < 1 || unidadInicial > 3) || (unidadFinal < 1 || unidadFinal > 3));

    }

}