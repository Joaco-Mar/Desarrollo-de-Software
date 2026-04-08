package Clase5.Bridge;

public abstract class Dispositivo {
    protected FormatoVideo formato;
    protected int pulgadas;

    public abstract void reproducirVideo();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [formato=" + formato.getClass().getSimpleName() + ", pulgadas=" + pulgadas + "]";
    }
}
