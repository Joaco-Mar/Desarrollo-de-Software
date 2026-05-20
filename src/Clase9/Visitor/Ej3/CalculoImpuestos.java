package Clase9.Visitor.Ej3;

public class CalculoImpuestos implements Inspector {
    @Override
    public void visitar(Poste p) {
        System.out.println("Poste: Fijo $100");
    }
    @Override
    public void visitar(Transformador t) {
        System.out.println("Transformador: Tasa Ambiental $500");
    }
    @Override
    public void visitar(Medidor m) {
        System.out.println("Medidor: Tasa Consumo $" + (m.getConsumoKwh() * 0.10));
    }
}