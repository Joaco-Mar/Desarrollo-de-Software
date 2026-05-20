package Clase9.Visitor.Ej3;

public class Medidor implements ComponenteRed {
    private boolean adulterado = false;
    private int consumoKwh = 350;
    private int anioInstalacion = 2022;

    public boolean isAdulterado() { return adulterado; }
    public int getConsumoKwh() { return consumoKwh; }
    public int getAnioInstalacion() { return anioInstalacion; }

    @Override
    public void aceptar(Inspector visitor) {
        visitor.visitar(this);
    }
}