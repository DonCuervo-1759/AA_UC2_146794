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
        
        System.out.println("Arreglo Original: ");
        ImprimirArreglos(datos);
        
        //Metodo de Burbuja
        //El codigo abajo de aqui llama al metodo de burbuja para acomodar
        //el arreglo en main.
        int[] burbuja = datos.clone();
        Ordenamientos.OrdenamientoBurbuja(burbuja);
        System.out.println("\nOrden por burbuja: ");
        ImprimirArreglos(burbuja);
        
        
        //Metodo de Selección
        int[] selection = datos.clone();
        Ordenamientos.OrdenamientoSeleccion(selection);
        System.out.println("\nOrden por Seleccion: ");
        ImprimirArreglos(selection);
        
        
        //Metodo de Inserción{
        int[] insertion = datos.clone();
        Ordenamientos.OrdenamientoInsersion(insertion);
        System.out.println("\nOrden por Insersion: ");
        ImprimirArreglos(insertion);
    }
}
