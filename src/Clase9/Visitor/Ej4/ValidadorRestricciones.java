package Clase9.Visitor.Ej4;

public class ValidadorRestricciones implements Visitador {
    @Override
    public void visitar(ProductoFisico p) {
        System.out.println("Físico: " + (p.getStock() > 0 ? "Con Stock" : "SIN STOCK"));
    }
    @Override
    public void visitar(LicenciaDigital l) {
        System.out.println("Licencia: " + (l.isVencida() ? "VENCIDA" : "Válida"));
    }
    @Override
    public void visitar(CuponRegalo c) {
        System.out.println("Cupón: Listo para aplicar");
    }
}