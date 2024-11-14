package recuprimerexamen;

import java.util.Objects;

public abstract class Nave {
    protected String nombre;
    protected int capacidadTripulacion;
    protected int anioLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, int anioLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadTripulacion() {
        return capacidadTripulacion;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    @Override
    public String toString() {
        return String.format("Nave{nombre='%s', capacidadTripulacion=%d, anioLanzamiento=%d}",
                nombre, capacidadTripulacion, anioLanzamiento);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Nave nave = (Nave) obj;
        return anioLanzamiento == nave.anioLanzamiento && nombre.equals(nave.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, anioLanzamiento);
    }
}
