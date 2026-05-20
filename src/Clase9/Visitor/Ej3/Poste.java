package Clase9.Visitor.Ej3;

public class Poste implements ComponenteRed {
    private boolean tieneGrietas = false;
    private int anioInstalacion = 2018;

    public boolean tieneGrietas() { return tieneGrietas; }
    public int getAnioInstalacion() { return anioInstalacion; }

    @Override
    public void aceptar(Inspector visitor) {
        visitor.visitar(this);
    }
}