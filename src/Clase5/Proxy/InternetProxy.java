package Clase5.Proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class InternetProxy {
    private List<String> sitiosProhibidos = new ArrayList<>(Arrays.asList("instagram.com", "facebook.com", "twitter.com"));

    public void controlAcceso(String url){
        if (!sitiosProhibidos.contains(url)){
            new InternetReal().conectarA(url);
        }
        else{
            System.out.println("Acceso DENEGADO!");
        }
    }
}

