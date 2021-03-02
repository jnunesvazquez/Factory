package com.programacion;

import com.libreria.FactoriaDeSalidas;
import com.libreria.INombre;
import com.libreria.ISalida;

public class Main {

    public static void main(String[] args) {

        ISalida salidaConsola, salidaVentana, salidaImpresora;
        INombre salidaNombreConsola, salidaNombreVentana;

        salidaConsola = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.CONSOLA, "Hola desde la fabrica");
        salidaConsola.visualiza();

        salidaVentana = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.VENTANA, "Adios desde la fabrica");
        salidaVentana.visualiza();

        salidaImpresora = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.IMPRESORA, "Imprimido");
        salidaImpresora.visualiza();

        salidaNombreConsola = FactoriaDeSalidas.getProductoNombre(FactoriaDeSalidas.NOMBRECONSOLA);
        salidaNombreConsola.visualiza();

        salidaNombreVentana = FactoriaDeSalidas.getProductoNombre(FactoriaDeSalidas.NOMBREPANTALLA);
        salidaNombreVentana.visualiza();
    }
}
