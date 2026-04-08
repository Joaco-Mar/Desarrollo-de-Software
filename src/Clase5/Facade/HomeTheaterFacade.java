package Clase5.Facade;

public class HomeTheaterFacade {
    private Luces luces = new Luces();
    private Pantalla pantalla = new Pantalla();
    private Proyector proyector = new Proyector();

    public void comenzarPelicula(){
        System.out.println("Preparando todo...");
        luces.setIntensidad(10);
        pantalla.setAbajo(true);
        proyector.setEncendido(true);
        System.out.println("Todo listo!");
    }
}
