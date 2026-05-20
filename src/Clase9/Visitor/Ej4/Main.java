package Clase9.Visitor.Ej4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ElementoCarrito> carrito = new ArrayList<>();
        
        // Cargamos productos en el carrito
        ProductoFisico mouse = new ProductoFisico(0.5, 10, 1000);
        LicenciaDigital antivirus = new LicenciaDigital(2000,false);
        CuponRegalo cupon = new CuponRegalo();

        carrito.add(mouse);
        carrito.add(antivirus);
        carrito.add(cupon);

        // Algoritmo A: Validación
        System.out.println("--- VALIDACION ---");
        ValidadorRestricciones validador = new ValidadorRestricciones();
        for (ElementoCarrito e : carrito) e.aceptar(validador);

        // Algoritmo B: Envío
        System.out.println("\n--- ENVIO ---");
        CalculadorEnvio envio = new CalculadorEnvio();
        for (ElementoCarrito e : carrito) e.aceptar(envio);
        System.out.println("Costo total de envío: $" + envio.getCostoTotal());


        // Algoritmo C: Descuentos y Totales
        System.out.println("\n--- PROCESANDO DESCUENTOS Y TOTALES ---");
        GeneradorDescuentos algoritmoC = new GeneradorDescuentos();

        // El visitor recorre todo el carrito una sola vez acumulando los datos
        for (ElementoCarrito e : carrito) {
            e.aceptar(algoritmoC);
        }

        // Al final, el visitor expone el resumen completo del carrito
        algoritmoC.mostrarResultadosFinales();
        }
}