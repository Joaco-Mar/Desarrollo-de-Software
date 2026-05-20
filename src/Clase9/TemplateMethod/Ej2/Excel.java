package Clase9.TemplateMethod.Ej2;

public class Excel extends ReporteTemplate {

    @Override
    public void imprimirEncabezado() {
        System.out.println("[Excel] Insertando imagen de logo en celda A1.");
    }

    @Override
    public void renderizarTabla() {
        System.out.println("[Excel] Mostrando los datos seleccionados de la tabla.");
    }

    @Override
    public void calcularGraficos() {
        System.out.println("[Excel] generando gráfico de Excel.");
    }

    @Override
    public void imprimirPie() {
        System.out.println("[Excel] Agregando celdas de texto");
    }
}