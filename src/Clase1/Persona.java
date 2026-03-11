package Clase1;
import java.time.LocalDate;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String nacimento;
    private int DNI;

    public Persona(String Nombre, String Apellido, String Nacimiento, int dNI){
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.nacimento = Nacimiento;
        this.DNI = dNI;
    }
}
