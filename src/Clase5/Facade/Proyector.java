package Clase5.Facade;

public class Proyector {
    boolean encendido = false;

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
        System.out.println("Proyector prendido? "+encendido);
    }
    
}
