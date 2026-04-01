package Clase4.Prototype;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        Equipamiento hilianShield = new Equipamiento("Hilian Shield");
        Equipamiento masterSword = new Equipamiento("Master Sword");
        List<Equipamiento> equipo = new ArrayList<>();
        equipo.add(masterSword);
        equipo.add(hilianShield);
        Guerrero link = new Guerrero("Link", 100, equipo);

        Guerrero copia = (Guerrero) link.clonar();
        Guerrero copiaProfunda = (Guerrero) link.colnarProfundo();
    
    
        System.out.println(link);
        System.out.println(copia);
        System.out.println(copiaProfunda);
    }
}
