package Clase3.Abstract_Factory;

public class WindowsFactory extends GUIFactory{
    @Override
    public IComponentes crearBoton() {
        return new BotonWn();
    }
}
