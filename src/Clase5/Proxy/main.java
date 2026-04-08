package Clase5.Proxy;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el sitio a ingresar:");
    String URLPersonalizada= scanner.nextLine();
    String URL="instagram.com";
    String URL2="twitter.com";
    String URL3="google.com";

    new InternetProxy().controlAcceso(URLPersonalizada);
    new InternetProxy().controlAcceso(URL);
    new InternetProxy().controlAcceso(URL2);
    new InternetProxy().controlAcceso(URL3);
    
}
}
