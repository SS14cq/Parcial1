public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Ana", 1500);
        Usuario usuario2 = new Usuario("Luis", 300);
        
        // Definir preferencias para usuario1
        usuario1.setPreferencia(TipoNotificacion.TRANSACCION, new NotificacionInstantanea());
        usuario1.setPreferencia(TipoNotificacion.ALERTA_SALDO, new AlertaSaldoConUmbral(500));
        usuario1.setPreferencia(TipoNotificacion.PROMOCIONES, new NotificacionPorEmail());
        
        // Definir preferencias para usuario2
        usuario2.setPreferencia(TipoNotificacion.TRANSACCION, new NotificacionResumenDiario());
        usuario2.setPreferencia(TipoNotificacion.ALERTA_SALDO, new SinAlertaSaldo());
        usuario2.setPreferencia(TipoNotificacion.PROMOCIONES, new NotificacionPorSMS());
        
        GestorNotificaciones gestor = new GestorNotificaciones();
        
        // Enviar notificaciones de prueba
        gestor.enviarNotificacion(usuario1, TipoNotificacion.TRANSACCION, "Compra de $100 realizada.");
        gestor.enviarNotificacion(usuario2, TipoNotificacion.TRANSACCION, "Compra de $50 realizada.");
        
        gestor.enviarNotificacion(usuario1, TipoNotificacion.ALERTA_SALDO, "Saldo actual: $1500");
        usuario1.setSaldo(400);
        gestor.enviarNotificacion(usuario1, TipoNotificacion.ALERTA_SALDO, "Saldo actual: $400");
        
        gestor.enviarNotificacion(usuario2, TipoNotificacion.ALERTA_SALDO, "Saldo actual: $300");
        
        gestor.enviarNotificacion(usuario1, TipoNotificacion.PROMOCIONES, "20% de descuento en tu próxima recarga.");
        gestor.enviarNotificacion(usuario2, TipoNotificacion.PROMOCIONES, "Recarga con descuento especial.");
    }
}