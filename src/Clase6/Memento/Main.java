package Clase6.Memento;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        jugador1.configurar("Ignacio", 10, 5, -1000, "Espada");

        // Crear historial y guardar el estado inicial
        Historial historial = new Historial();
        historial.salvar(jugador1.guardar());

        // Cambiar el estado del jugador
        jugador1.configurar("Ignacio", 20, 3, 500, "Escudo");
        System.out.println("Estado modificado: " + jugador1);

        // Restaurar el estado anterior
        jugador1.restaurar(historial.deshacer());
    }
}
