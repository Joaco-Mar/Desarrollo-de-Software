package Clase3.NotificacionFactory;

public class WhatsApp implements INotificacion{
    @Override
    public void enviar(String mensaje) {
        System.out.println("Se ha enviado su mensaje por WhatsApp");
    }
}