package Clase9.TemplateMethod.Ej1;

public abstract class SueldosGeneral {
    protected double horasTrabajadas;
    public final void liquidarSueldo() {
        // Use the instance field instead of declaring a new local variable
        cargarDiasTrabajados(horasTrabajadas);
        double bruto = calcularSueldoBruto();
        double deducciones = calcularDeducciones(bruto);
        double bonos = calcularBonos();
        double neto = bruto - deducciones + bonos;
        generarReciboYEmitirPago(neto);
    }

    // Pasos comunes con implementación por defecto
    protected void cargarDiasTrabajados(double horasTrabajadas) {
        System.out.println("Cargando " + horasTrabajadas + " horas trabajadas del mes en el sistema.");
    }

    protected void generarReciboYEmitirPago(double neto) {
        System.out.println("Recibo digital generado. Transferencia bancaria emitida por: $" + neto);
    }

    // Pasos abstractos: Las subclases DEBEN personalizar estos cálculos
    protected abstract double calcularSueldoBruto();
    protected abstract double calcularDeducciones(double bruto);
    protected abstract double calcularBonos();
}
