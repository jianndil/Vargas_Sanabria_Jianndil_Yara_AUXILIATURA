package jUEGO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosVida;
    protected Inventario inventario;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.inventario = new Inventario();
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + ", Nivel: " + nivel + ", Puntos de Vida: " + puntosVida);
    }

    public void recibirDaño(int daño) {
        puntosVida -= daño;
        System.out.println(nombre + " ha recibido " + daño + " puntos de daño.");
    }

    public void curar() {
        puntosVida += 20;
        System.out.println(nombre + " ha sido curado, puntos de vida aumentados en 20.");
    }
}