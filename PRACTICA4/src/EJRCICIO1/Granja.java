package EJRCICIO1;

class Granja {
    private List<Animal> animales = new ArrayList<>();

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public void mostrarAnimales() {
        for (Animal animal : animales) {
            animal.mostrarInfo();
            animal.hacerSonido();
            if (animal instanceof Productor) {
                ((Productor) animal).producir();
            }
        }
    }
}