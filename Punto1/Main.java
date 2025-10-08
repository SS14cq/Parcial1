import subject.OfertasCursos;
import OpcionesCurso.*;    

public class Main {
    public static void main(String[] args) {

        // Crear sujeto
        OfertasCursos ofertas = new OfertasCursos();

        // Crear observadores
        WebMaster andrea = new WebMaster("Andrea Mahecha");
        Periodista luzDary = new Periodista("Luz Dary Varela");
        CommunityManager laura = new CommunityManager("Laura Molano");

        // Suscribirlos
        ofertas.agregarObservador(andrea);
        ofertas.agregarObservador(luzDary);
        ofertas.agregarObservador(laura);

        // Cambios en la oferta
        ofertas.agregarCurso("Inteligencia Artificial aplicada a la educación");
        ofertas.agregarCurso("Pedagogía Decolonial");
        ofertas.actualizarCurso("Pedagogía Decolonial", "Pedagogía Decolonial Avanzada");
        ofertas.eliminarCurso("Inteligencia Artificial aplicada a la educación");
    }
}

