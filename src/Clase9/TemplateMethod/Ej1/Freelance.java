package Clase9.TemplateMethod.Ej1;

public class Freelance extends SueldosGeneral{
    private double tarifaPorHora;

    public Freelance(double horasTrabajadas, double tarifaPorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    protected double calcularSueldoBruto() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    protected double calcularDeducciones(double bruto) {
        return 0.0; // Autónomo, no se le retienen aportes jubilatorios
    }

    @Override
    protected double calcularBonos() {
        return 0.0; // No aplica bonos corporativos estándar
    }
}
