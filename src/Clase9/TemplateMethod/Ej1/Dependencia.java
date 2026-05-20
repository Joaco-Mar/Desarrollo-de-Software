package Clase9.TemplateMethod.Ej1;

public class Dependencia extends SueldosGeneral{
    private double sueldoFijoMensual;
    private double bonoPerformance;

    public Dependencia(double horasTrabajadas, double sueldoFijoMensual, double bonoPerformance) {
        this.sueldoFijoMensual = sueldoFijoMensual;
        this.bonoPerformance = bonoPerformance;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    protected double calcularSueldoBruto() {
        return sueldoFijoMensual;
    }

    @Override
    protected double calcularDeducciones(double bruto) {
        return bruto * 0.17;
    }

    @Override
    protected double calcularBonos() {
        return bonoPerformance;
    }
}
