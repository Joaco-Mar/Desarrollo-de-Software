package Clase9.TemplateMethod.Ej2;

public class Main {
public static void main(String[] args) {
    Excel ReporteExcel = new Excel();
    ReporteExcel.generarReporte();

    HTML reporteHTML = new HTML();
    reporteHTML.generarReporte();

    PDF reportPDF = new PDF();
    reportPDF.generarReporte(); 
}
}
