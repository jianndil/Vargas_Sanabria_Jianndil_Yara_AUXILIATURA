package EJRCICIO1;

class Mazo {
    private List<Carta> cartas = new ArrayList<>();

    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    public void barajar() {
        Collections.shuffle(cartas);
        System.out.println("El mazo ha sido barajado.");
    }
}