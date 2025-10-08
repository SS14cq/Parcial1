package OpcionesCurso;

import observer.Observador;

public class CommunityManager implements Observador {
    private String nombre;

    public CommunityManager(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("[CommunityManager - " + nombre + "] recibe notificación: " + mensaje);
    }
}
