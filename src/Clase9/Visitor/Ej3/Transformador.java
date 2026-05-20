package Clase9.Visitor.Ej3;

public class Transformador implements ComponenteRed {
    private double temperatura = 45.5;
    private int anioInstalacion = 2015;

    public double getTemperatura() { return temperatura; }
    public int getAnioInstalacion() { return anioInstalacion; }

    @Override
    public void aceptar(Inspector visitor) {
        visitor.visitar(this);
    }
}