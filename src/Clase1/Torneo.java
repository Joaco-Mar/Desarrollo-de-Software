package Clase1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Torneo {
    private String fecha;
    private String nombre;
    private Equipo primerpuesto;
    private Equipo segundopuesto;
    private Equipo tercerpuesto;
    private Sede lugar;
    private List<Equipo> equipos;
    private List<Partido> partidos;
    
    public Torneo(String fecha, String nombre, Sede lugar) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.lugar = lugar;
        this.equipos = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }
    
    public void registrarEquipo(Equipo equipo){
        equipos.add(equipo);
    }
    public void generarPartido(int horaInicio, Equipo equipo1, Equipo equipo2){
        partidos.add(new Partido(horaInicio, equipo1, equipo2));
    }

}
