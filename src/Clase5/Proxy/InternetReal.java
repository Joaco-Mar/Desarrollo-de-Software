package Clase5.Proxy;

public class InternetReal implements IInternet{
    @Override
    public void conectarA(String url) {
        System.out.println("Conectando a "+url);
    }
}
