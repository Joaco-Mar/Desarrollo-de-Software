package Clase8.State;

public interface EstadoAula {
    void reservar(Aula aula);
    void ocupar(Aula aula);
    void liberar(Aula aula);
    void mantener(Aula aula);
}