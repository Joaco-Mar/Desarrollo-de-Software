package Clase6.Memento;

import java.util.ArrayList;
import java.util.List;

public class JugadorMemento {
    private final String nombre;
    private final int nivel;
    private final int vidas;
    private final int posición;
    private final List<String> inventario;

    public JugadorMemento(String nombre, int nivel, int vidas, int posición,List<String> inventario) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vidas = vidas;
        this.posición = posición;
        this.inventario = new ArrayList<>(inventario);
    }

    // Getters para el Originador
    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public int getVidas() { return vidas; }
    public int getPosicion() {return posición; }
    public List<String> getInventario() { return inventario; }
}
