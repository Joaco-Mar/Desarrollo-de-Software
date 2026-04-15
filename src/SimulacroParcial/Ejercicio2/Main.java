package SimulacroParcial.Ejercicio2;

public class Main {
    
public static void main(String[] args) {
    AudioExterno audioOrginal = new AudioExterno();
    String audioTrasformado = new Adapter().reproducir(audioOrginal);
    System.out.println(audioTrasformado);
}
    
}
