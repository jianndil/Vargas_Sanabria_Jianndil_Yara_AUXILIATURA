package EJRCICIO1;

class Carrera {
    private List<Vehiculo> participantes = new ArrayList<>();

    public void agregarParticipante(Vehiculo vehiculo) {
        participantes.add(vehiculo);
    }

    public void iniciarCarrera() {
        System.out.println("La carrera ha comenzado.");
        for (Vehiculo vehiculo : participantes) {
            vehiculo.acelerar();
            vehiculo.mostrarInfo();
        }
    }
}