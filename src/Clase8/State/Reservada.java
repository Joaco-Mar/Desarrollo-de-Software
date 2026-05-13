package Clase8.State;

public class Reservada implements EstadoAula{
    public void reservar(Aula aula) { 
        System.out.println("El aula ya está reservada."); 
    }
    public void ocupar(Aula aula) {
        System.out.println("Aula ocupada ahora.");
        aula.setEstado(new Ocupada());
    }
    public void liberar(Aula aula) {
        System.out.println("Reserva cancelada. Aula disponible.");
        aula.setEstado(new Disponible());
    }
    public void mantener(Aula aula) { 
        System.out.println("Error: Cancele la reserva antes de mantenimiento."); 
    }
}
