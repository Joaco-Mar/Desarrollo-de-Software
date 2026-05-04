package Clase6.Mediator;

public class Avion{
    private String nombre;
    private IMediador mediador;

    public Avion(String nombre, IMediador mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
    }

    public void intentarPista() {
        System.out.println(nombre + ": Solicitando aterrizaje...");
        mediador.solicitarPista(this);
    }

    public void terminarManiobra() {
        mediador.liberarPista();
    }
    
    public String getNombre() { return nombre; }
}
