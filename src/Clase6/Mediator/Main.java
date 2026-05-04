package Clase6.Mediator;

public class Main {
    public static void main(String[] args) {
        TorreControl torreCentral = new TorreControl();
        Avion boeing = new Avion("Boeing", torreCentral);
        Avion f35 = new Avion("F35", torreCentral);
        Avion b2 = new Avion("B2", torreCentral);

        boeing.intentarPista();
        f35.intentarPista();
        boeing.terminarManiobra();
        b2.intentarPista();
    }
}
