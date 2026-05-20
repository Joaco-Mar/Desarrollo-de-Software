package Clase9.TemplateMethod.Ej1;

public abstract class SueldosGeneral {
    private int horas;
    private int pagoXHora;
    private int sueldoBruto;
    private int sueldoACobrar;
    private int porcentajeDeducciones;

    public int CargarHoras(int horasTrabajadas){
        return horasTrabajadas;
    }
    public int CalcularSueldoBase(){
        return pagoXHora*horas;
    }
    public int AplicarDeducciones(){
        int sueldo =porcentajeDeducciones*sueldoACobrar/100;
        return sueldo;
    }
    abstract public int AplicarBonos(){
        
    }
    abstract public void GenerarResumen();
}
