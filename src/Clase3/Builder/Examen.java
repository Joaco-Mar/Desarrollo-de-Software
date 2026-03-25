package Clase3.Builder;

public class Examen {
    private boolean teoria;
    private boolean practica;
    private int minutosLimite;
    private int puntosExtra;

    private Examen(Builder builder){
        this.teoria=builder.teoria;
        this.practica=builder.practica;
        this.minutosLimite=builder.minutosLimite;
        this.puntosExtra=builder.puntosExtra;
    }
    
    @Override
    public String toString() {
        return "Examen [teoria=" + teoria + ", practica=" + practica + ", minutosLimite=" + minutosLimite
                + ", puntosExtra=" + puntosExtra + "]";
    }



    public static class Builder{
    private boolean teoria;
    private boolean practica;
    private int minutosLimite;
    private int puntosExtra;


    public void setTeoria(boolean teoria) {
        this.teoria = teoria;
    }
    public void setPractica(boolean practica) {
        this.practica = practica;
    }
    public void setMinutosLimite(int minutosLimite) {
        this.minutosLimite = minutosLimite;
    }
    public void setPuntosExtra(int puntosExtra) {
        this.puntosExtra = puntosExtra;
    }
    public Examen build(){
        return new Examen(this);
    }
    
    }
}
