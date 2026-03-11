package Clase1;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private int victorias = 0;
    private int derrotas = 0;
    private int empates = 0;
    private List<Jugador> jugadores;

    public Equipo(String nombre){
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }
    public void añadirJugadores (Jugador miembro){
        jugadores.add(miembro);
    }
}
