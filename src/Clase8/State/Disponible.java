package Clase8.State;

public class Disponible implements EstadoAula{
    public void reservar(Aula aula) {
        System.out.println("Aula reservada con éxito.");
        aula.setEstado(new Reservada());
    }
    public void ocupar(Aula aula) { System.out.println("Error: No se puede ocupar sin reserva previa."); }
    public void liberar(Aula aula) { System.out.println("El aula ya está libre."); }
    public void mantener(Aula aula) {
        System.out.println("Aula enviada a mantenimiento.");
        aula.setEstado(new EnMantenimiento());
    }
}
