package EJRCICIO1;

abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void acelerar();

    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo + ", Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}

// Interfaz Turbo
interface Turbo {
    void activarTurbo();
}