package jUEGO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        // Elección de personaje por el jugador
        System.out.println("Elige tu personaje:");
        System.out.println("1. Mago");
        System.out.println("2. Guerrero");
        System.out.println("3. Arquero");
        int opcion = scanner.nextInt();
        Personaje jugador;

        switch(opcion) {
            case 1:
                jugador = new Mago("Mago", rand.nextInt(10) + 1, 100, 50);
                break;
            case 2:
                jugador = new Guerrero("Guerrero", rand.nextInt(10) + 1, 100, 30);
                break;
            case 3:
                jugador = new Arquero("Arquero", rand.nextInt(10) + 1, 100, 40);
                break;
            default:
                System.out.println("Opción inválida, se elige el Guerrero por defecto.");
                jugador = new Guerrero("Guerrero", rand.nextInt(10) + 1, 100, 30);
        }

        // Mostrar estado inicial del jugador
        System.out.println("Has elegido: ");
        jugador.mostrarEstado();

        // Enemigos a enfrentar
        Enemigo[] enemigos = {
            new Zombie("Zombie", 50, 15),
            new Vampiro("Vampiro", 70, 20),
            new Jefe("Dragón", 200, 25, 2.5)
        };

        // Combate con cada enemigo
        for (Enemigo enemigo : enemigos) {
            System.out.println("\n¡Un " + enemigo.nombre + " ha aparecido!");
            if (enemigo instanceof Jefe) {
                ((Jefe) enemigo).hablar();
            }

            while (jugador.puntosVida > 0 && enemigo.estaVivo()) {
                System.out.println("\n¿Qué deseas hacer?");
                System.out.println("1. Atacar");
                System.out.println("2. Curar");
                int accion = scanner.nextInt();

                if (accion == 1) {
                    int dañoJugador = rand.nextInt(11) + 10; // Daño aleatorio entre 10 y 20
                    System.out.println("Atacas al " + enemigo.nombre);
                    enemigo.recibirDaño(dañoJugador);

                    if (enemigo.estaVivo()) {
                        int dañoEnemigo = (enemigo instanceof Jefe) ? ((Jefe) enemigo).ataqueCritico() : enemigo.atacar();
                        System.out.println(enemigo.nombre + " te ataca causando " + dañoEnemigo + " puntos de daño.");
                        jugador.recibirDaño(dañoEnemigo);
                    }
                } else if (accion == 2) {
                    jugador.curar();
                } else {
                    System.out.println("Opción inválida.");
                }

                // Mostrar el estado actual de ambos
                System.out.println("\nEstado del jugador:");
                jugador.mostrarEstado();
                System.out.println("Estado del enemigo:");
                System.out.println(enemigo.nombre + " - Puntos de Vida: " + enemigo.puntosVida);
            }

            // Verificar si el jugador ha ganado o perdido
            if (jugador.puntosVida <= 0) {
                System.out.println("\n¡Has sido derrotado por " + enemigo.nombre + "!");
                break;
            } else {
                System.out.println("\n¡Has derrotado a " + enemigo.nombre + "!");
            }
        }

        // Final del juego
        if (jugador.puntosVida > 0) {
            System.out.println("\n¡Felicitaciones, has vencido a todos los enemigos y ganado el juego!");
        } else {
            System.out.println("\nEl juego ha terminado. ¡Inténtalo de nuevo!");
        }

        scanner.close();
    }
}
