package Clase6.Observer;

import java.util.ArrayList;
import java.util.List;

public class EstacionMeteorologica{
    private List<IPantalla> pantallas = new ArrayList<>();
    private float temperatura;

    public void registrarPantalla(IPantalla p) { 
        pantallas.add(p); 
    }
    public void eliminarPantalla(IPantalla p) { 
        pantallas.remove(p); 
    }

    public void setTemperatura(float temp) {
        this.temperatura = temp;
        notificar();
    }

    private void notificar() {
        for (IPantalla p : pantallas) {
            p.actualizar(temperatura);
        }
    }
}
