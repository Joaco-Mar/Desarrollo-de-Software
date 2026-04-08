package Clase5.Composite;

import java.util.ArrayList;
import java.util.List;

public class Rama implements IComponenteGasto{
    private String name;
    private List<IComponenteGasto> hijos= new ArrayList<>();

public Rama(String nombre){
    this.name=nombre;
}
public void añadir(IComponenteGasto hijo){
    hijos.add(hijo);
}

@Override
public int getPresupuesto() {
    int suma=0;
    for(IComponenteGasto e : hijos){
        suma+=e.getPresupuesto();
    }
    return suma;
}
}
