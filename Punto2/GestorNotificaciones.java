public class GestorNotificaciones {
    public void enviarNotificacion(Usuario usuario, TipoNotificacion tipo, String mensaje) {
        NotificacionStrategy estrategia = usuario.getPreferencia(tipo);
        if (estrategia != null) {
            estrategia.enviar(mensaje, usuario);
        } else {
            System.out.println("No hay estrategia definida para " + usuario.getNombre() + " y tipo " + tipo);
        }
    }
}