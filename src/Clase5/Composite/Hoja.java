package Clase5.Composite;

public class Hoja implements IComponenteGasto{
    private String name;
    private int costo;

    @Override
    public int getPresupuesto() {
        return costo;
    }
    public String getName() {
        return name;
    }

    public Hoja(String nombre, int costo){
        this.name=nombre;
        this.costo=costo;
    }
}
