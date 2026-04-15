package Clase5.Bridge;

public class SmartTV extends Dispositivo{

    public SmartTV(FormatoVideo formato, int pulgadas){
        this.formato = formato;
        this.pulgadas = pulgadas;
    }

    public void reproducirVideo() {
        System.out.print("SmartTV " + pulgadas + "\" - ");
        formato.reproducir();
    }
}
