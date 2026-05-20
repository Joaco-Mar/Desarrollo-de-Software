package Clase9.TemplateMethod.Ej2;

public class HTML extends ReporteTemplate {

    @Override
    public void imprimirEncabezado() {
        System.out.println("[HTML] Renderizando header");
    }

    @Override
    public void renderizarTabla() {
        System.out.println("[HTML] Abriendo etiquetas.");
    }

    @Override
    public void calcularGraficos() {
        System.out.println("[HTML] Insertando contenedor");
    }

    @Override
    public void imprimirPie() {
        System.out.println("[HTML] Renderizando footer con CSS");
    }
}