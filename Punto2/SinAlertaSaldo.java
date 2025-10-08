public class SinAlertaSaldo implements NotificacionStrategy {
    @Override
    public void enviar(String mensaje, Usuario usuario) {
        System.out.println("No se envía ninguna notificación a " + usuario.getNombre() + ": " + mensaje);
    }
}