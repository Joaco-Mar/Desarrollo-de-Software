package Clase4.Prototype;

public class Equipamiento implements IPrototype{
    private String equipamiento;

    public Equipamiento(String equipo){
        this.equipamiento=equipo;
    }

    public Equipamiento clonar() {
        return new Equipamiento(this.equipamiento);
    }
    @Override
    public IPrototype colnarProfundo() {
        return this.clonar();
    }
}
