package Semana1Viernes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejemplo2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // un Scanner para capturar lo que ingrese el usuaruio
        int[] values = new int[5]; // dandole el tamaño al array

        for (int i = 0; i < values.length; i++)
        {
            System.out.println("Ingrese el valor para la posicion " + i);
            int valor = sc.nextInt();
            values[i] = valor;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = 6;
        for (int i =0; i < size; i++);
    }
}
