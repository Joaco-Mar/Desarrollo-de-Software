package Clase8.State;

public class EnMantenimiento implements EstadoAula{
    public void reservar(Aula aula) { 
        System.out.println("Error: El aula está en reparaciones."); 
    }
    public void ocupar(Aula aula) { 
        System.out.println("Error: El aula no es apta para uso."); 
    }
    public void liberar(Aula aula) {
        System.out.println("Mantenimiento finalizado.");
        aula.setEstado(new Disponible());
    }
    public void mantener(Aula aula) { 
        System.out.println("Ya se encuentra en mantenimiento.");  
    }
}
