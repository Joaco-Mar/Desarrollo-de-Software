package Clase9.TemplateMethod.Ej1;

public class Vendedores extends SueldosGeneral{
    private double sueldoMinimoBase;
    private double totalVentas;
    private double porcentajeComision;

    public Vendedores(double horasTrabajadas, double sueldoMinimoBase, double totalVentas, double porcentajeComision) {
        this.sueldoMinimoBase = sueldoMinimoBase;
        this.totalVentas = totalVentas;
        this.porcentajeComision = porcentajeComision;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    protected double calcularSueldoBruto() {
        return sueldoMinimoBase + (totalVentas * porcentajeComision);
    }

    @Override
    protected double calcularDeducciones(double bruto) {
        return bruto * 0.10; // Ejemplo de retención menor para comisionistas
    }

    @Override
    protected double calcularBonos() {
        return 0.0;
    }
}
