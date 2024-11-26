package jUEGO;

public class Enemigo {
    protected String nombre;
    protected int puntosVida;
    protected int dañoBase;

    public Enemigo(String nombre, int puntosVida, int dañoBase) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.dañoBase = dañoBase;
    }

    public int atacar() {
        return dañoBase;
    }

    public void recibirDaño(int daño) {
        puntosVida -= daño;
        System.out.println(nombre + " ha recibido " + daño + " puntos de daño.");
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }
}