package OpcionesCurso;

import observer.Observador;

public class Periodista implements Observador {
    private String nombre;

    public Periodista(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("[Periodista - " + nombre + "] recibe notificación: " + mensaje);
    }
}
