package Clase6.Memento;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private int nivel;
    private int vidas;
    private int posición;
    private List<String> inventario = new ArrayList<>();

    public void configurar(String nombre, int nivel, int vidas, int posición,String item) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vidas = vidas;
        this.posición = posición;
        this.inventario.add(item);
    }

    public JugadorMemento guardar() {
        return new JugadorMemento(nombre, nivel, vidas, posición,inventario);
    }

    public void restaurar(JugadorMemento m) {
        this.nombre = m.getNombre();
        this.nivel = m.getNivel();
        this.vidas = m.getVidas();
        this.posición = m.getPosicion();
        this.inventario = m.getInventario();

        System.out.println("Estado recuperado: " + this);
    }

    @Override
    public String toString() {
        return "Jugador: " + nombre + " | Nivel: " + nivel + " | Vidas: " + vidas + " | Posicion: " + posición + " | Items: " + inventario;
    }

}
