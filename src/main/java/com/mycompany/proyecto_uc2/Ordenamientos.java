/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_uc2;

import java.util.Arrays;

public class Ordenamientos {
    
    public static void OrdenamientoBurbuja(int[] arr){//O(n^2)
        int n = arr.length;
        
        //Este for delimita el rango de busqueda del for dentro de este mismo
        //cuando el valor mas alto llega a la ultima posicion a la derecha
        //bloquea ese valor, indicando que ese indice ya esta en su posicion correcta
        for(int i = 0; i < n - 1; i++){//n+4
            
            //Este for recorre todo el arreglo comparando valores adiacentes a j con "j + 1"
            //j < n - i - 1 cierra el valor mas alto ya que encuentre su posicion final a la derecha del arreglo
            //disminuyendo el rango de busqueda en el arreglo, acompletando un cilo del primer for
            for(int j = 0; j < n - i - 1; j++){//n+5
                
                //Este "if" se activa solo si j es mayor al valor adiacente a su derecha, el cual se considera j + 1
                    //El auxiliar "aux" guarda temporalmente el valor de "j" cuando el "if" ocurre
                    //El valor de "j" cambia a ser el valor que anteriormente era de "j + 1"
                    //El valor que "aux" sostenia, que anteriormente era de "j" ahora pasa a ser el nuevo valor de "j + 1"
                if(arr[j] > arr[j + 1]){//3
                    int aux = arr[j];//1
                    arr[j] = arr[j + 1];//1
                    arr[j + 1] = aux;//1
                }
            }
        }
    }
    
    public static void OrdenamientoSeleccion(int[] arr){//O(n^2)
        int n = arr.length;
        
        //El primer "for" indic la posicion de "i"
        //El "IndiceMin" indica el primer valor donde inicia "i" como el valor
        //minimo del arreglo, sera el valor que "j" comparara en su iteracion
        //hasta encontrar un valor menor a ese
        for(int i = 0; i < n - 1; i++){//n+4
            int IndiceMin = i;//1
            for(int j = i +1; j < n; j++){//n+4
                //Si "j" en el transcurso de su iteracion encuentra un valor
                //menor al de "i" ese nuevo valor se considera el nuevo valor minimo
                if (arr[j] < arr[IndiceMin]){//2
                    IndiceMin = j;//1
                }
            }
            //El Auxiliar guarda el valor del inidce minimo encontrado por "j"
            int aux = arr[IndiceMin];//1
            //El valor del indice minimo se sobreescribe y ahora es el valor de i
            arr[IndiceMin] = arr[i];//1
            //El valor de "i" se sobreescribe y cambia a ser el valor que el auxiliar
            //tomo del indice minimo antes de su cambio.
            arr[i] = aux;//1
            
        }
    }
    
    public static void OrdenamientoInsersion(int[] arr ){//O(n^2)
        int n = arr.length;
        
        //La iteracion de "i" en el arreglo de una inserción comienza desde el
        //segundo indice, este viniendo siendo "1"
        for(int i = 1; i < n; i++){//O(n)
            //key se guarda como el valor dentro del arreglo donde se eencuentra "i"
            int key = arr[i];
            //Aqui inicia la iteracion de "j" y esta empieza un indice abajo de "i"
            int j = i - 1;
            
            //El while es donde se procede a intercambiar para ordenar
            //el arreglo. Se compara si "j" es mayor que el valor del indice de "key"
            //Las condiciones para entrar al while son "Si j es mayor o igual a 0" y
            //"que el valor de j sea mayor al valor que contiene key"
            //(SE TIENEN QUE CUMPLIR AMBAS CONDICIONES)
            while(j >= 0 && arr[j] > key){//O(n)
                //Como "j" inicia un indice abajo de "i" esta operacion remplaza
                //el valor del indice donde esta "i"
                arr[j + 1] = arr[j];
                //"j" se movera a un indice atras.
                j = j - 1;
            }
            //El valor de "j" sustituye el de "key", esto se hace para que j
            // no sea dejado afuera del arreglo y cause un error.
            arr[j + 1] = key;
        }
    }
    
        public static void OrdenamientoQuicksort(int[] arr, int inicio, int fin){
            //Determina la particion del arreglo en donde comienza la iteracion
            if(inicio < fin){
                //Inicia la particion desde el pivote seleccionado comunmente
                //se selecciona el indice final como pivote para empezar
                int PivoteIndice = particion(arr, inicio, fin);
                System.out.println("\nEl indicce del pivote esta en: " + PivoteIndice + ". Estado Actual del arreglo: " + Arrays.toString(arr));
                
                //Comienza la particion de la izquierda cuando hay dos particiones o mas
                OrdenamientoQuicksort(arr, inicio, PivoteIndice -1);
                System.out.println("\nIZQUIERDA. Pivote es: "+ PivoteIndice + " Estado actual del arreglo " + Arrays.toString(arr));
                
                //Comienza la particion de la derecha cuando hay dos particiones o mas
                OrdenamientoQuicksort(arr, PivoteIndice +1, fin);
                System.out.println("\nDERECHA. Pivote es: "+ PivoteIndice + " Estado actual del arreglo " + Arrays.toString(arr));
            }
        }
        
        //Aqui se hacen los intercambios entre valores de los indices
        public static int particion(int[] arr, int inicio, int fin){
            
            //determina el indice final como el pivote para comenzar la particion inicial
            //que seria todo el arreglo al inicio
            int pivote = arr[fin];
            
            //"i" se tiene que dejar un indice menor al inicio para que no lo
            //sobreescriba cuando ocurran cambios, ya que "i" es el que marca cual
            //es el indice de menor valor dentro de la particion
            int i = inicio - 1;
            
            //El "for" se encarga de recorrer la particion dentro del pivote
            //sin contar dicho pivote, comparando los valores con este
            //y cambiandolos si resultan ser menores al pivote
            for(int j = inicio; j < fin; j++){
                if(arr[j] < pivote){
                    i++;
                    
                    //"i" se guardara como el valor que se considera como el minimo
                    //en el arreglo por el momento hasta que se encuentre otro
                    //durante la iteracion
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                
            }
            
            //al final de la iteracion, el valor del pivote sera movido al indice
            //al frente de "i" ya que "i" determina cual es el indice de menor valor
            //encontrado en la iteracion.
            int temp = arr[i +1];
            arr[i +1] = arr[fin];
            arr[fin] = temp;
            
            return i + 1;
        }
    
    
    public static void ImprimirArreglos(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
