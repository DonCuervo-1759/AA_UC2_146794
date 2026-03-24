/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_uc2;

/**
 *
 * @author shado
 */
import java.util.Arrays;

public class Proyecto_UC2 {
    
    public static void ImprimirArreglos(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] datos = {2, 25, 4};
        int[] datosalter = {2, 25, 4, 17, 100, 54, 3, 70, 14, 7, 15};
        
        Ordenamientos ord = new Ordenamientos();
        
        
        System.out.println("Arreglo Original: ");
        ImprimirArreglos(datos);
        
        System.out.println("\nArreglo secundario original: ");
        ImprimirArreglos(datosalter);
        
        //Metodo de Burbuja
        System.out.println("\n////////////////////////////////////////////////////");
        //El codigo abajo de aqui llama al metodo de burbuja para acomodar
        //el arreglo en main.
        int[] arrBurb = datos.clone();
        //Ordenamientos.OrdenamientoBurbuja(burbuja);
        ord.OrdenamientoBurbuja(arrBurb);
        System.out.println("\nORDEN POR BURBUJA: " + Arrays.toString(arrBurb));
        //ImprimirArreglos(burbuja);
        
        
        //Metodo de Selección
        System.out.println("\n////////////////////////////////////////////////////");
        int[] arrSelect = datos.clone();
        //Ordenamientos.OrdenamientoSeleccion(selection);
        ord.OrdenamientoSeleccion(arrSelect);
        System.out.println("\nORDEN POR SELECCION: " + Arrays.toString(arrSelect));
        //ImprimirArreglos(selection);
        
        
        //Metodo de Inserción
        System.out.println("\n////////////////////////////////////////////////////");
        int[] arrInsert = datos.clone();
        //Ordenamientos.OrdenamientoInsersion(insertion);
        ord.OrdenamientoInsersion(arrInsert);
        System.out.println("\nORDEN POR INSERCION: " + Arrays.toString(arrInsert));
        //ImprimirArreglos(insertion);
        
        //Metodo de Quicksort
        System.out.println("\n////////////////////////////////////////////////////");
        System.out.println("\nORDEN POR QUICKSORT: ");
        int[] arrQuick = datosalter.clone();
        ord.OrdenamientoQuicksort(arrQuick, 0, arrQuick.length -1);
        System.out.println("\nOrden final de Quicksort: " + Arrays.toString(arrQuick));
    }
}
