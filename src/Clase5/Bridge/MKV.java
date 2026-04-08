package Clase5.Bridge;

public class MKV implements FormatoVideo{
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo en MKV");
    }
}
