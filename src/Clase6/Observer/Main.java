package Clase6.Observer;

public class Main {
    public static void main(String[] args) {
    EstacionMeteorologica informacion = new EstacionMeteorologica();
    
    PantallaInfo pantalla1 = new PantallaInfo("Mostrador");
    PantallaInfo pantalla2 = new PantallaInfo("Cuarto");
    PantallaInfo pantalla3 = new PantallaInfo("Cocina");
    
    informacion.registrarPantalla(pantalla1);
    informacion.registrarPantalla(pantalla2);
    informacion.registrarPantalla(pantalla3);

    informacion.setTemperatura(28);
    informacion.setTemperatura(24);


    }
}
