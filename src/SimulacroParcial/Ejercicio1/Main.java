package SimulacroParcial.Ejercicio1;

public class Main {
public static void main(String[] args) {
    IDocumento facturaAbril = new DocumentoFactory().DocumentoSelect("Factura");
    facturaAbril.mostrarTipo();
    IDocumento reciboCompra = new DocumentoFactory().DocumentoSelect("Recibo");
    reciboCompra.generarContenido();
}
}
