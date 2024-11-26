package EJRCICIO1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSeleccione el juego que desea jugar:");
            System.out.println("1. Juego de Cartas");
            System.out.println("2. Juego de Carreras");
            System.out.println("3. Juego de Simulación de Granjas");
            System.out.println("4. Salir");

            int opcionJuego = scanner.nextInt();

            switch (opcionJuego) {
                case 1:
                    // Juego de Cartas
                    System.out.println("Ha elegido el Juego de Cartas.");
                    CartaNormal cartaNormal = new CartaNormal(5, "Corazones");
                    CartaEspecial cartaEspecial = new CartaEspecial(10, "Diamantes");

                    System.out.println("Elija una carta:");
                    System.out.println("1. Carta Normal");
                    System.out.println("2. Carta Especial");

                    int opcionCarta = scanner.nextInt();
                    if (opcionCarta == 1) {
                        cartaNormal.jugar();
                        cartaNormal.mostrarCarta();
                    } else if (opcionCarta == 2) {
                        cartaEspecial.jugar();
                        cartaEspecial.mostrarCarta();
                        cartaEspecial.realizarAccion();
                    }
                    break;

                case 2:
                    // Juego de Carreras
                    System.out.println("Ha elegido el Juego de Carreras.");
                    Coche coche = new Coche("Ferrari", "F8", 340);
                    Moto moto = new Moto("Yamaha", "YZF", 220);

                    System.out.println("Elija un vehículo:");
                    System.out.println("1. Coche");
                    System.out.println("2. Moto");

                    int opcionVehiculo = scanner.nextInt();
                    if (opcionVehiculo == 1) {
                        coche.acelerar();
                        coche.mostrarInfo();
                    } else if (opcionVehiculo == 2) {
                        moto.acelerar();
                        moto.activarTurbo();
                        moto.mostrarInfo();
                    }
                    break;

                case 3:
                    // Juego de Simulación de Granjas
                    System.out.println("Ha elegido el Juego de Simulación de Granjas.");
                    Vaca vaca = new Vaca("Margarita", 4);
                    Oveja oveja = new Oveja("Lana", 2);

                    System.out.println("Elija un animal:");
                    System.out.println("1. Vaca");
                    System.out.println("2. Oveja");

                    int opcionAnimal = scanner.nextInt();
                    if (opcionAnimal == 1) {
                        vaca.hacerSonido();
                        vaca.producir();
                    } else if (opcionAnimal == 2) {
                        oveja.hacerSonido();
                        oveja.producir();
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del juego...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }

        scanner.close();
    }
}