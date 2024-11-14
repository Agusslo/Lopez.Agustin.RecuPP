package recuprimerexamen;

public class CruceroEstelar extends Nave {
    private int cantidadPasajeros;

    public CruceroEstelar(String nombre, int capacidadTripulacion, int anioLanzamiento, int cantidadPasajeros) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public String toString() {
        return super.toString() + ", cantidadPasajeros=" + cantidadPasajeros;
    }
}
