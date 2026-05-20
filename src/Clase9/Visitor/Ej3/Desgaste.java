package Clase9.Visitor.Ej3;

public class Desgaste implements Inspector {
    private int anioActual = 2026;

    @Override
    public void visitar(Poste p) {
        System.out.println("Poste: " + (anioActual - p.getAnioInstalacion()) + " años de uso.");
    }
    @Override
    public void visitar(Transformador t) {
        System.out.println("Transformador: " + (anioActual - t.getAnioInstalacion()) + " años de uso.");
    }
    @Override
    public void visitar(Medidor m) {
        System.out.println("Medidor: " + (anioActual - m.getAnioInstalacion()) + " años de uso.");
    }
}