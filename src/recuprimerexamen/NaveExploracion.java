package recuprimerexamen;

public class NaveExploracion extends Nave implements Explorable {
    private TipoMision tipoMision;

    public NaveExploracion(String nombre, int capacidadTripulacion, int anioLanzamiento, TipoMision tipoMision) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.tipoMision = tipoMision;
    }

    public TipoMision getTipoMision() {
        return tipoMision;
    }

    @Override
    public void explorar() {
        System.out.println("La nave de exploracion " + nombre + " esta iniciando su mision de " + tipoMision);
    }

    @Override
    public String toString() {
        return super.toString() + ", tipoMision=" + tipoMision;
    }
}
