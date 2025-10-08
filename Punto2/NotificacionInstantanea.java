public class NotificacionInstantanea implements NotificacionStrategy {
    @Override
    public void enviar(String mensaje, Usuario usuario) {
        System.out.println("Enviar notificación instantánea a " + usuario.getNombre() + ": " + mensaje);
    }
}