import java.util.HashMap;
import java.util.Map;

public class Usuario {
    private String nombre;
    private double saldo;
   
    private Map<TipoNotificacion, NotificacionStrategy> preferenciasNotificacion;
    
    public Usuario(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.preferenciasNotificacion = new HashMap<>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void setPreferencia(TipoNotificacion tipo, NotificacionStrategy estrategia) {
        preferenciasNotificacion.put(tipo, estrategia);
    }
    
    public NotificacionStrategy getPreferencia(TipoNotificacion tipo) {
        return preferenciasNotificacion.get(tipo);
    }
}
