package recuprimerexamen;

import java.util.ArrayList;
import java.util.List;

public class AgenciaEspacial {
    private List<Nave> naves;

    public AgenciaEspacial() {
        naves = new ArrayList<>();
    }

    public void agregarNave(Nave nave) throws NaveYaExisteException {
        for (Nave n : naves) {
            if (n.nombre.equals(nave.nombre) && n.anioLanzamiento == nave.anioLanzamiento) {
                throw new NaveYaExisteException("La nave ya existe.");
            }
        }
        naves.add(nave);
    }

    public void mostrarNaves() {
    if (naves.isEmpty()) {
        System.out.println("No hay naves disponibles.");
    } else {
        System.out.println("Lista de naves:");
        for (Nave nave : naves) {
            System.out.println("- " + nave.toString());
        }
    }
}


    public void iniciarExploracion() {
    for (Nave nave : naves) {
        if (nave instanceof Explorable) {
            ((Explorable) nave).explorar();
        } else {
            System.out.println(nave.nombre + " no puede iniciar una mision de exploracion, solo transporta pasajeros.");
        }
    }
}


}
