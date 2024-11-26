package EJRCICIO1;

class Vaca extends Animal implements Productor {
    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("La vaca hace muuu.");
    }

    @Override
    public void producir() {
        System.out.println("La vaca está produciendo leche.");
    }
}