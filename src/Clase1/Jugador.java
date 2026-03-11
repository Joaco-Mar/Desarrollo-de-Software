package Clase1;
import java.time.LocalDate;

public class Jugador extends Persona {
    private int goles =0;
    private int penales =0;

    public Jugador(String nombre, String apellido, String nacimiento, int DNI){
        super( nombre, apellido, nacimiento, DNI);
    }
}
