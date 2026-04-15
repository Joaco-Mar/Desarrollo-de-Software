package Clase5.Decorator;

public class main {
public static void main(String[] args) {
    IHamburguesa hamburguesaSimple= new HamburguesaBase();
    System.out.println(hamburguesaSimple.getPrecio()+"\n"+ hamburguesaSimple.getDescripcion());
    IHamburguesa hamburguesaQueso = new QuesoDecorator(hamburguesaSimple);
    System.out.println(hamburguesaQueso.getPrecio()+"\n"+ hamburguesaQueso.getDescripcion());
    IHamburguesa hamburguesaCompleta = new PepinoDecorator(hamburguesaQueso);
    System.out.println(hamburguesaCompleta.getPrecio()+"\n"+ hamburguesaCompleta.getDescripcion());
    }
}
