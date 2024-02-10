package Semana1Viernes;

import java.util.Scanner;

public class RecorriendoArray {
    public static void main(String[] args) {
        /*int[] array = {12,23,12,44,2};

        System.out.println(array[0]); // hacer esto es impractico, que pasa si tengo 200 datos//
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("/////////////////");

        for (int i = 0; i < array.length; i++){
            System.out.println(array[ i ]);
        }*/

        // inicializando valores, dandole una posicion por consola de usuario

        int[] array2 = new int[5];
        int size = array2.length;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < size; i++){
            System.out.println("Ingrese el valor para la posicion " + i);

            int valor = sc.nextInt();
            array2[i] = valor;
        }
        for (int  i = 0; i < size; i++){
            System.out.println(array2[i]);
        }
        }

    }

