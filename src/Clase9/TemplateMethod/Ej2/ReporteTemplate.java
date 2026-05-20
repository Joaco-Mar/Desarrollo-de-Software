package Clase9.TemplateMethod.Ej2;

public abstract class ReporteTemplate {
    public final void generarReporte(){
        imprimirEncabezado();
        renderizarTabla();
        calcularGraficos();
        imprimirPie();
    }

    abstract public void imprimirEncabezado();
    abstract public void renderizarTabla();
    abstract public void calcularGraficos();
    abstract public void imprimirPie();
    
}
