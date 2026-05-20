package Clase9.Visitor.Ej4;

public class LicenciaDigital implements ElementoCarrito {
    private boolean vencida;
    private double precio;

    public LicenciaDigital(double precio,boolean vencida) { this.vencida = vencida; }
    public boolean isVencida() { return vencida; }

    @Override
    public void aceptar(Visitador visitor) { visitor.visitar(this); }
    
    public double getPrecio() {
        return precio;
    }

    
}