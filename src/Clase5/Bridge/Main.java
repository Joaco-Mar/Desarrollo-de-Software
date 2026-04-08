package Clase5.Bridge;

public class Main {

    public static void main(String[] args) {
        FormatoVideo mp4 = new MP4();
        FormatoVideo mkv = new MKV();

        Dispositivo telefono = new Portatil(mkv, 10);
        Dispositivo TV = new SmartTV(mp4, 100);

        telefono.reproducirVideo();
        TV.reproducirVideo();
    }
}
