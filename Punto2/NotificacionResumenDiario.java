public class NotificacionResumenDiario implements NotificacionStrategy {
    @Override
    public void enviar(String mensaje, Usuario usuario) {
        System.out.println("Enviar resumen diario a " + usuario.getNombre() + ": " + mensaje);
    }
}