package SimulacroParcial.Ejercicio1;

public class Constancia implements IDocumento{
    @Override
    public void mostrarTipo() {
     System.out.println("Tipo: Constancia");
    }
    @Override
    public void generarContenido() {
        System.out.println("Generando contenido para Constancia...");
    }
}
