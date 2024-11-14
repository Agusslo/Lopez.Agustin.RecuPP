package recuprimerexamen;

public class Main {
    public static void main(String[] args) {
        try {
            // Instancia de la agencia espacial
            NaveExploracion exploracion1 = new NaveExploracion("Voyager", 10, 1977, TipoMision.CARTOGRAFIA);
            Carguero carguero1 = new Carguero("Galactica", 20, 2001, 300);
            CruceroEstelar crucero1 = new CruceroEstelar("Enterprise", 100, 2020, 500);

            // Instancia de la agencia espacial
            AgenciaEspacial agencia = new AgenciaEspacial();

            // Agregar naves
            agencia.agregarNave(exploracion1);
            agencia.agregarNave(carguero1);
            agencia.agregarNave(crucero1);

            // Mostrar naves
            agencia.mostrarNaves();

            // Iniciar exploración
            agencia.iniciarExploracion();
        } catch (NaveYaExisteException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
