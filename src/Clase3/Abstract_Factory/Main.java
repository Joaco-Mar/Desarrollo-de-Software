package Clase3.Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        GUIFactory fabricaInterfase = new MacFactory();
        AppFinal app = new AppFinal(fabricaInterfase);
        app.renderizarBoton();
    }
}
