package Clase3.NotificacionFactory;

public class Email implements INotificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Se ha enviado su email correctamente");
    }
}
