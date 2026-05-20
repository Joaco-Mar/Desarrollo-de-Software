package Clase9.Visitor.Ej4;

public interface Visitador {
    void visitar(ProductoFisico p);
    void visitar(LicenciaDigital l);
    void visitar(CuponRegalo c);
}
