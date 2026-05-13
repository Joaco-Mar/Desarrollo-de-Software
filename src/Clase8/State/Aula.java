package Clase8.State;

public class Aula {
    private String nombre;
    private EstadoAula estadoActual;

    public Aula(String nombre) {
        this.nombre = nombre;
        this.estadoActual = new Disponible(); // Estado inicial
    }

    public void setEstado(EstadoAula nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    // Delegación de comportamiento al estado
    public void reservar() { estadoActual.reservar(this); }
    public void ocupar() { estadoActual.ocupar(this); }
    public void liberar() { estadoActual.liberar(this); }
    public void mantener() { estadoActual.mantener(this); }

    public String getNombre() { return nombre; }
}