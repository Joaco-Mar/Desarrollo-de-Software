package Clase9.Visitor.Ej4;

public class GeneradorDescuentos implements Visitador{
    private double totalFisicosBase = 0;
    private double totalLicencias = 0;
    private boolean tieneCupon = false;

    @Override
    public void visitar(ProductoFisico p) {
        // Sumamos el precio base de todos los físicos que aparezcan
        totalFisicosBase += p.getPrecio();
    }

    @Override
    public void visitar(LicenciaDigital l) {
        totalLicencias += l.getPrecio();
    }

    @Override
    public void visitar(CuponRegalo c) {
        // Si aparece el cupón, simplemente marcamos que existe
        tieneCupon = true;
    }

    // Método final para calcular el neto y mostrar los resultados en bloque
    public void mostrarResultadosFinales() {
        double totalFisicosFinal = totalFisicosBase;

        System.out.println("--- RESULTADOS COMPRA ---");
        System.out.println("Total Licencias: $" + totalLicencias);
        System.out.println("Total Físicos (Base): $" + totalFisicosBase);

        if (tieneCupon) {
            // Si hubo cupón, aplicamos el 15% de descuento a la suma total de los físicos
            totalFisicosFinal = totalFisicosBase - (totalFisicosBase * 0.15);
            System.out.println("¡Cupón aplicado! Total Físicos con desc: $" + totalFisicosFinal);
        } else {
            System.out.println("No se detectaron cupones de descuento.");
        }

        // Se sumen o no los descuentos, el total general siempre se calcula al final
        double totalGeneral = totalFisicosFinal + totalLicencias;
        System.out.println("TOTAL GENERAL A PAGAR: $" + totalGeneral);
    }
}