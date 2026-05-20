package Clase9.Visitor.Ej4;

public class ProductoFisico implements ElementoCarrito {
    private double peso;
    private int stock;
    private double precio;

    public ProductoFisico(double peso, int stock, double precio) {
        this.peso = peso;
        this.stock = stock;
        this.precio = precio;
    }

    public double getPeso() { return peso; }
    public int getStock() { return stock; }
    public double getPrecio() { return precio; }
    public void aplicarDescuento(double porc) { this.precio -= this.precio * porc; }

    @Override
    public void aceptar(Visitador visitor){ 
        visitor.visitar(this); 
    }
}

