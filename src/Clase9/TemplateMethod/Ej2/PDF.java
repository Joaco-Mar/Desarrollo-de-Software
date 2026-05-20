package Clase9.TemplateMethod.Ej2;

public class PDF extends ReporteTemplate {

    @Override
    public void imprimirEncabezado() {
        System.out.println("[PDF] Incrustando logo vectorial y título en coordenadas X:10, Y:750.");
    }

    @Override
    public void renderizarTabla() {
        System.out.println("[PDF] Dibujando líneas de grilla e imprimiendo filas de datos financieros.");
    }

    @Override
    public void calcularGraficos() {
        System.out.println("[PDF] Renderizando gráfico estadístico de barras en espacio asignado.");
    }

    @Override
    public void imprimirPie() {
        System.out.println("[PDF] Escribiendo firmas digitales y cláusula de confidencialidad en el margen inferior.");
    }
}