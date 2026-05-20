package Clase9.Visitor.Ej4;

public class CalculadorEnvio implements Visitador {
    private double costoTotal = 0;

    public double getCostoTotal() { return costoTotal; }

    @Override
    public void visitar(ProductoFisico p) { costoTotal += p.getPeso() * 50; } // $50 por kg
    @Override
    public void visitar(LicenciaDigital l) {} // Envío $0
    @Override
    public void visitar(CuponRegalo c) {}     // Envío $0
}