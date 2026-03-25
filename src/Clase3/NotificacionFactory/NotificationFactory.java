package Clase3.NotificacionFactory;

public class NotificationFactory {
    public static INotificacion crearNotificacion(String forma){
        if(forma.equalsIgnoreCase("EMAIL")){
            return new Email();
        }
        else if(forma.equalsIgnoreCase("SMS")){
            return new SMS();
        }
        else if(forma.equalsIgnoreCase("WhatsApp")){
            return new WhatsApp();
        }
        else{
            System.out.println("No se reconoce como un tipo de notificacion posible, chequea la ortografía");
            return null;
        }
}
}
