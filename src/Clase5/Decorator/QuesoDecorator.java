package Clase5.Decorator;

public class QuesoDecorator extends HamburguesaDecorator{
    private int precio = 3;
    private String descripcion = " con Queso";

    public QuesoDecorator(IHamburguesa hamburguesa){
        super(hamburguesa);
    }

    public int getPrecio() {
        return hamburguesaDecorada.getPrecio()+precio;
    }

    public String getDescripcion() {
        return hamburguesaDecorada.getDescripcion()+descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
