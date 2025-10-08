public class NotificacionResumenSemanal implements NotificacionStrategy {
    @Override
    public void enviar(String mensaje, Usuario usuario) {
        System.out.println("Enviar resumen semanal a " + usuario.getNombre() + ": " + mensaje);
    }
}
