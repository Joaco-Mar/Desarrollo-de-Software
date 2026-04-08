package Clase5.Facade;

public class Pantalla {
    Boolean abajo = false;

    public Boolean getAbajo() {
        return abajo;
    }

    public void setAbajo(Boolean abajo) {
        this.abajo = abajo;
        System.out.println("Pantalla abajo? "+abajo);
    }
    
}
