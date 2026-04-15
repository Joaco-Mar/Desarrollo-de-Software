package SimulacroParcial.Ejercicio1;

public class DocumentoFactory {
    public IDocumento DocumentoSelect(String tipo){
        if (tipo.equalsIgnoreCase("Factura")){
            return new Factura();
        }
        else if(tipo.equalsIgnoreCase("Recibo")){
            return new Recibo();
        }
        else if(tipo.equalsIgnoreCase("Constancia")){
            return new Constancia();
        }
        else{
            System.out.println("Error al crear su documento");
            return null;
        }
    }
}
