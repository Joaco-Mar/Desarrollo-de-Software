package Clase1;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("No implemento mas texto, es solo conceptual y logico");
        Sede recoleta = new Sede("jose ingenieros 2020","Sede central");
        Torneo torneoDeLosOchoMaestros = new Torneo("01/11/2026", "Torneo De Los Ocho Maestros", recoleta);

        Equipo aves = new Equipo("Aves");
        Equipo pumas = new Equipo("Pumas");

        Jugador carlos = new Jugador("carlos","perez", "02/03/2005" , 45348564);
        Jugador pedro = new Jugador("Pedro","Lopez", "01/04/2003", 57683940);

        aves.añadirJugadores(carlos);
        pumas.añadirJugadores(pedro);

        torneoDeLosOchoMaestros.generarPartido(11, aves, pumas);
        
        //Con esta implementacion tenemos todas las clases implementadas, menos los medios de comunicación y tenemos 
        // los metodos de añadirJugadores y generarPartido funcioanando correctamente.
    }
}
