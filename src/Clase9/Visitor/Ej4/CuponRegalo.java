package Clase9.Visitor.Ej4;

public class CuponRegalo implements ElementoCarrito {
    private double descuento = 0.15; // 15% desc.

    public double getDescuento() { return descuento; }

    @Override
    public void aceptar(Visitador visitor) { visitor.visitar(this); }
}
