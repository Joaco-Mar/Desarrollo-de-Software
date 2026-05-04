package Clase6.Mediator;

public class TorreControl implements IMediador{
    private boolean pistaDisponible = true;

    @Override
    public void solicitarPista(Avion avion) {
        if (pistaDisponible) {
            pistaDisponible = false;
            System.out.println("Torre: Aterrizaje autorizado para " + avion.getNombre());
        } else {
            System.out.println("Torre: Denegado. Pista ocupada, " + avion.getNombre() + " mantenga espera.");
        }
    }

    @Override
    public void liberarPista() {
        pistaDisponible = true;
        System.out.println("Torre: Pista ahora se encuentra LIBRE.");
    }

}
