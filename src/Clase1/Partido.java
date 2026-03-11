package Clase1;
public class Partido {
    private int horaInicio;
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesequipo1 = 0;
    private int golesequipo2 = 0;
    private String resultado;
    
    public Partido(int horaInicio, Equipo equipo1, Equipo equipo2) {
        this.horaInicio = horaInicio;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultado = "Pendiente";
    }

    
}
