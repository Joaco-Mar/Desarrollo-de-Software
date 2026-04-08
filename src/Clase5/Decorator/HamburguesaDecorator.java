package Clase5.Decorator;

public abstract class HamburguesaDecorator implements IHamburguesa{
    protected IHamburguesa hamburguesaDecorada;
    
    public HamburguesaDecorator(IHamburguesa hamburguesa){
        this.hamburguesaDecorada=hamburguesa;
    }

    @Override
    public String getDescripcion() {
        return hamburguesaDecorada.getDescripcion();
    }
    @Override
    public int getPrecio() {
        return hamburguesaDecorada.getPrecio();
    }
    
}
