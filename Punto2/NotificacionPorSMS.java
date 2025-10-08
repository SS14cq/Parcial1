public class NotificacionPorSMS implements NotificacionStrategy {
    @Override
    public void enviar(String mensaje, Usuario usuario) {
        System.out.println("Enviar promoción por SMS a " + usuario.getNombre() + ": " + mensaje);
    }
}