public class NotificacionPorEmail implements NotificacionStrategy {
    @Override
    public void enviar(String mensaje, Usuario usuario) {
        System.out.println("Enviar promoción por email a " + usuario.getNombre() + ": " + mensaje);
    }
}