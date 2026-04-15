package Clase5.Bridge;

public class MP4 implements FormatoVideo{
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo en MP4");
    }
}
