package Clase3.Abstract_Factory;

public class MacFactory extends GUIFactory{
    @Override
    public IComponentes crearBoton() {
        return new BotonMac();
    }
}
