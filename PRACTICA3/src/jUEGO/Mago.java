package jUEGO;

class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    public void lanzarHechizo() {
        System.out.println(nombre + " ha lanzado un hechizo!");
    }
}

class Arquero extends Personaje {
    private int destreza;

    public Arquero(String nombre, int nivel, int puntosVida, int destreza) {
        super(nombre, nivel, puntosVida);
        this.destreza = destreza;
    }

    public void dispararFlecha() {
        System.out.println(nombre + " ha disparado una flecha!");
    }
}

class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int nivel, int puntosVida, int fuerza) {
        super(nombre, nivel, puntosVida);
        this.fuerza = fuerza;
    }

    public void atacar() {
        System.out.println(nombre + " ha realizado un ataque!");
    }
}