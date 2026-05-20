package Clase9.TemplateMethod.Ej1;

public class Main {
public static void main(String[] args) {
    Dependencia EmpleadoEnDependencia = new Dependencia(80,1000, 500);
    EmpleadoEnDependencia.liquidarSueldo();

    System.out.println("Ahora del empleado freelance");

    Freelance EmpleadoFreelance = new Freelance(40, 1000);
    EmpleadoFreelance.liquidarSueldo();

    System.out.println("Ahora del empleado Vendedor");

    Vendedores EmpleadoVendedor = new Vendedores(100, 300, 100, 5);
    EmpleadoVendedor.liquidarSueldo();

}
}
