package Clase3.Builder;

public class main {
    public static void main(String[] args) {
        Examen.Builder builder = new Examen.Builder();
        builder.setPractica(true);
        builder.setTeoria(false);
        builder.setMinutosLimite(90);
       Examen examen1 = builder.build();

        System.out.println(examen1.toString());
    }
}
