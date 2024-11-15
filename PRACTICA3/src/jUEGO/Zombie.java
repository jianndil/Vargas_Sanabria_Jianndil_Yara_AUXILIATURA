package jUEGO;

class Zombie extends Enemigo {

    public Zombie(String nombre, int puntosVida, int dañoBase) {
        super(nombre, puntosVida, dañoBase);
    }

    @Override
    public int atacar() {
        puntosVida += 5;  // Se regenera
        System.out.println(nombre + " se ha regenerado 5 puntos de vida.");
        return dañoBase;
    }
}