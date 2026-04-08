package Clase5.Decorator;

public class QuesoDecorator implements IHamburguesa{
    private int precio = 3;
    private String descripcion = "Queso";

    public QuesoDecorator(HamburguesaBase hamburguesa){
        hamburguesa.setPrecio(hamburguesa.getPrecio()+precio);
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
