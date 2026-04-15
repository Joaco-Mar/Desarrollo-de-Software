package Clase5.Facade;

public class Luces {
    int intensidad = 100;

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
        System.out.println("Intensidad de luces al "+intensidad+"%");
    }
    
}
