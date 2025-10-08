package OpcionesCurso;

import observer.Observador;

public class WebMaster implements Observador {
    private String nombre;

    public WebMaster(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("[Webmaster - " + nombre + "] recibe notificación: " + mensaje);
    }
}
