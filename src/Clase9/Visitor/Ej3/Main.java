package Clase9.Visitor.Ej3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creamos la red eléctrica
        List<ComponenteRed> red = new ArrayList<>();
        red.add(new Poste());
        red.add(new Transformador());
        red.add(new Medidor());

        // Instanciamos las operaciones (visitors)
        Inspector auditoria = new Auditoria();
        Inspector impuestos = new CalculoImpuestos();
        Inspector desgaste = new Desgaste();

        // Ejecutamos cada operación sobre toda la red
        System.out.println("--- AUDITORIA ---");
        for (ComponenteRed c : red) c.aceptar(auditoria);

        System.out.println("\n--- IMPUESTOS ---");
        for (ComponenteRed c : red) c.aceptar(impuestos);

        System.out.println("\n--- DESGASTE ---");
        for (ComponenteRed c : red) c.aceptar(desgaste);
    }
}