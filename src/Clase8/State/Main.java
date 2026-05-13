package Clase8.State;

public class Main {
    public static void main(String[] args) {
        Aula aula1 = new Aula("Laboratorio 3");

        // Intentar ocupar directamente (Debe fallar)
        aula1.ocupar(); 

        // Flujo correcto: Reservar y luego ocupar
        aula1.reservar();
        aula1.ocupar();

        // Intentar mantenimiento mientras está ocupada (Debe fallar)
        aula1.mantener();

        // Liberar y enviar a mantenimiento
        aula1.liberar();
        aula1.mantener();
        
        // Dejar de mantener y reservar
        aula1.liberar();
        aula1.reservar();

    }
}