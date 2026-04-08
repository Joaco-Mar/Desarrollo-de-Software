package Clase5.Bridge;

public class Portatil extends Dispositivo{

    public Portatil(FormatoVideo formato, int pulgadas){
        this.formato = formato;
        this.pulgadas = pulgadas;
    }

    public void reproducirVideo() {
        System.out.print("Portatil " + pulgadas + "\" - ");
        formato.reproducir();
    }
}
