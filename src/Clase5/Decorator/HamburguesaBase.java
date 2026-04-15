package Clase5.Decorator;

public class HamburguesaBase implements IHamburguesa{
    private int precio = 10;
    private String descripcion = "Hamburguesa simple";

    public HamburguesaBase(HamburguesaBase burga){
        this.precio=burga.getPrecio();
        this.descripcion=burga.getDescripcion();
    }

    public HamburguesaBase(){

    }
    @Override
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
