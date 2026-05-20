package Clase9.Visitor.Ej3;

public class Auditoria implements Inspector {
    @Override
    public void visitar(Poste p) {
        System.out.println("Poste: " + (p.tieneGrietas() ? "GRIETAS DETECTADAS" : "OK"));
    }
    @Override
    public void visitar(Transformador t) {
        System.out.println("Transformador: Temp " + t.getTemperatura() + "°C - " + (t.getTemperatura() > 80 ? "ALERTA" : "OK"));
    }
    @Override
    public void visitar(Medidor m) {
        System.out.println("Medidor: " + (m.isAdulterado() ? "ADULTERADO" : "OK"));
    }
}