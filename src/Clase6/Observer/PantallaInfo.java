package Clase6.Observer;

public class PantallaInfo implements IPantalla{
    private String nombre;

    public PantallaInfo(String nombre) { this.nombre = nombre; }

    @Override
    public void actualizar(float temperatura) {
        System.out.println("Notificación en [" + nombre + "]: La temperatura actual es " + temperatura + "°C");
    }
}
