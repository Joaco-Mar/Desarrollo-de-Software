package Clase8.State;

public class Ocupada implements EstadoAula{
    public void reservar(Aula aula) { 
        System.out.println("Error: El aula está ocupada."); 
    }
    public void ocupar(Aula aula) { 
        System.out.println("El aula ya está siendo utilizada."); 
    }
    public void liberar(Aula aula) {
        System.out.println("Aula liberada.");
        aula.setEstado(new Disponible());
    }
    public void mantener(Aula aula) { 
        System.out.println("Error: No se puede reparar mientras haya clase."); 

    }
}
