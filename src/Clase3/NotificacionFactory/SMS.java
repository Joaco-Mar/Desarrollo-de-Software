package Clase3.NotificacionFactory;

public class SMS implements INotificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Se ha envido su SMS");
    }
}
