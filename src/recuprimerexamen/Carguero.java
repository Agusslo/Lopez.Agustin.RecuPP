package recuprimerexamen;

public class Carguero extends Nave implements Explorable {
    private int capacidadCarga;

    public Carguero(String nombre, int capacidadTripulacion, int anioLanzamiento, int capacidadCarga) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        if (capacidadCarga < 100 || capacidadCarga > 500) {
            throw new IllegalArgumentException("La capacidad de carga debe estar entre 100 y 500 toneladas.");
        }
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public void explorar() {
        System.out.println("La nave carguera " + nombre + " esta iniciando su mision de exploracion.");
    }

    @Override
    public String toString() {
        return super.toString() + ", capacidadCarga=" + capacidadCarga + " toneladas";
    }
}
