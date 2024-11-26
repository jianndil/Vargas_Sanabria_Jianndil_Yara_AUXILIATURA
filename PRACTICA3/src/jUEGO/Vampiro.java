package jUEGO;

class Vampiro extends Enemigo {

    public Vampiro(String nombre, int puntosVida, int dañoBase) {
        super(nombre, puntosVida, dañoBase);
    }

    @Override
    public int atacar() {
        int daño = dañoBase;
        puntosVida += daño / 2;  // Roba vida
        System.out.println(nombre + " ha robado " + (daño / 2) + " puntos de vida.");
        return daño;
    }
}