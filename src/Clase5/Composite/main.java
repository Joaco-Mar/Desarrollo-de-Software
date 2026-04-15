package Clase5.Composite;

public class main {
public static void main(String[] args) {
    Hoja Catedra1= new Hoja("Catedra Física", 100);
    Hoja Catedra2= new Hoja("Catedra Psicologia", 40);
    Hoja Catedra3= new Hoja("Catedra Economia", 60);

    Rama DepartamentoExactas=new Rama("Exactas");
    Rama DepartamentoPsico=new Rama("Psicologia");

    DepartamentoExactas.añadir(Catedra1);
    DepartamentoExactas.añadir(Catedra2);
    DepartamentoPsico.añadir(Catedra3);

    System.out.println("Exactas gasta "+DepartamentoExactas.getPresupuesto());
    System.out.println("Psicologia gasta "+DepartamentoPsico.getPresupuesto());
}
}
