package Clase9.Visitor.Ej3;

public interface Inspector {
    void visitar(Poste poste);
    void visitar(Transformador transformador);
    void visitar(Medidor medidor);
}