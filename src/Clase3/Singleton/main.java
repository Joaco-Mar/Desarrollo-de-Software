
package Clase3.Singleton;

public class main {
    public static void main(String[] args) {
        ConfiguracionRed config1 = ConfiguracionRed.getInstance();
        ConfiguracionRed config2 = ConfiguracionRed.getInstance();
        ConfiguracionRed config3 = ConfiguracionRed.getInstance();

        System.out.println(config1 == config2);
        System.out.println("Al imprimir true demuestra que son el mismo objeto");
    }
}
