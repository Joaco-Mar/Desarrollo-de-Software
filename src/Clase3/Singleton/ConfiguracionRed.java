package Clase3.Singleton;

public class ConfiguracionRed {
    
    private static ConfiguracionRed instancia;

    private String nombreServidor;
    private int puerto;

    private ConfiguracionRed(String nombre, int puertoaasignado){
        this.nombreServidor= nombre;
        this.puerto = puertoaasignado;
    }

    public static  ConfiguracionRed getInstance(){
        if (instancia ==null){
            instancia= new ConfiguracionRed("ServidorUADE", 1984);
            System.out.println("Se ha creado su sevidor correctamente");
        }
        return instancia;
    }

    
}


