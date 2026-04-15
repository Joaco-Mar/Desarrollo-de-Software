package SimulacroParcial.Ejercicio1;

public class Recibo implements IDocumento{
    @Override
    public void mostrarTipo() {
     System.out.println("Tipo: Recibo");
    }
    @Override
    public void generarContenido() {
     System.out.println("Generando contenido para el recibo...");   
    }
}
