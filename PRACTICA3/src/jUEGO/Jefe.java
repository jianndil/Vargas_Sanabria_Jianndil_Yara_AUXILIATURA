package jUEGO;

class Jefe extends Enemigo {
    private double multiplicadorDaño;

    public Jefe(String nombre, int puntosVida, int dañoBase, double multiplicadorDaño) {
        super(nombre, puntosVida, dañoBase);
        this.multiplicadorDaño = multiplicadorDaño;
    }

    public void hablar() {
        System.out.println(nombre + ": ¡Prepárate para enfrentar tu fin!");
    }

    public int ataqueCritico() {
        int daño = (int) (dañoBase * multiplicadorDaño);
        System.out.println(nombre + " ha realizado un ataque crítico con " + daño + " de daño!");
        return daño;
    }
}