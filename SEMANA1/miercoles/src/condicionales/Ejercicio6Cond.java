package condicionales;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio6Cond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematica");
        int notaMat = sc.nextInt();
        System.out.println("Ingrese la nota de fisica");
        int notaFis = sc.nextInt();
        System.out.println("Ingrese la nota de quimica");
        int notaQui = sc.nextInt();

        System.out.println("Impresion");
        System.out.println(notaMat);
        System.out.println(notaFis);
        System.out.println(notaFis);

        /*here the three (3) conditions must be true to accomplish the condition*/
        if((notaMat>=65 && notaFis>=55 && notaQui>=50) || (notaFis+ notaMat)>=140)
        {
            System.out.println("El alumno ingreso");
        }
        else {
            System.out.println("El alumno no ingreso");
        }
        sc.close();
    }
}
