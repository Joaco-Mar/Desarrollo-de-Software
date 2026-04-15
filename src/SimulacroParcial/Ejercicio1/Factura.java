package SimulacroParcial.Ejercicio1;

public class Factura implements IDocumento{
    @Override
    public void mostrarTipo() {
     System.out.println("Tipo: Factura");
    }
    @Override
    public void generarContenido() {
        System.out.println("Generando contendido para la Factura...");
    }
}
