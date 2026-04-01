package Clase4.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Guerrero implements IPrototype{
    private String nombre;
    private int salud;
    private List<Equipamiento> equipamientos;


    @Override
    public IPrototype clonar() {
        return new Guerrero(this.nombre, this.salud, this.equipamientos);
    }

    @Override
    public IPrototype colnarProfundo() {
        Guerrero nuevoGuerrero = new Guerrero(this.nombre, this.salud);
        for (Equipamiento e : this.equipamientos) {
            Equipamiento copiaEquipamiento;
            if (e != null) {
                copiaEquipamiento = e.clonar();
                nuevoGuerrero.agregarEquipamiento(copiaEquipamiento);
            }
        }
        return nuevoGuerrero;
    }

    public Guerrero(String nombre, int salud, List<Equipamiento> equipamiento){
        this.nombre=nombre;
        this.salud=salud;
        this.equipamientos=equipamiento;
}
    public Guerrero(String nombre, int salud){
        this.nombre=nombre;
        this.salud=salud;
        this.equipamientos= new ArrayList<>();
    }

    public void setEquipamientos(List<Equipamiento> equipamientos) {
        this.equipamientos = equipamientos;
    }
    public void agregarEquipamiento(Equipamiento e) {
        this.equipamientos.add(e);
    }

    @Override
    public String toString() {
        return "Guerrero [nombre=" + nombre + ", salud=" + salud + ", equipamientos=" + equipamientos + "]";
    }


    
}
