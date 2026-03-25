package Clase3.Abstract_Factory;

public class AppFinal{
   private IComponentes boton;

   public AppFinal(GUIFactory sistemaOperativo){
      this.boton = sistemaOperativo.crearBoton();
   }

   public void renderizarBoton() {
      boton.renderizar();
   }
}
