import Usuario;

import NotificacionTransacciones.NotificacionStrategy;

public class AlertaSaldoConUmbral implements NotificacionStrategy {
    private double umbral;
    
    public AlertaSaldoConUmbral(double umbral) {
        this.umbral = umbral;
    }
    
    @Override
    public void enviar(String mensaje, Usuario usuario) {
        if (usuario.getSaldo() < umbral) {
            System.out.println("Alerta: saldo bajo para " + usuario.getNombre() + ": " + mensaje);
        }
    }
}
