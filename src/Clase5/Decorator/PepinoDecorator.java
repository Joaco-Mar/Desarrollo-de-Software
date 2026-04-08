package Clase5.Decorator;

public class PepinoDecorator extends HamburguesaDecorator{
    private int precio = 1;
    private String descripcion = " con Pepino";


    public PepinoDecorator(IHamburguesa hamburguesa){
        super(hamburguesa);
    }

    @Override
    public int getPrecio() {
        return super.getPrecio()+precio;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion()+descripcion;
    }
}
