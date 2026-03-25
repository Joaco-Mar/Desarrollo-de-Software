package Clase3.NotificacionFactory;

public class main {

    public static void main(String[] args) {
        INotificacion metodo = NotificationFactory.crearNotificacion("EMAIL");
        INotificacion metodo2 = NotificationFactory.crearNotificacion("SMS");
        metodo.enviar(null);
        metodo2.enviar(null);
    }
}
