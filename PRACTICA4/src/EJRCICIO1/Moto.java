package EJRCICIO1;

class Moto extends Vehiculo implements Turbo {
    public Moto(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void acelerar() {
        System.out.println("La moto está acelerando.");
    }

    @Override
    public void activarTurbo() {
        System.out.println("Turbo activado en la moto.");
    }
}
