package bucles;

import java.util.Scanner;

public class Ejercicio3_4Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de n hasta donde sumar: ");
        int n = sc.nextInt();/*el valor de n sera el que se ingrese por consola*/
        int Suma = 0; /*aqui, se crea a variable 'suma' para que inicie la suma desde 0*/
        for (int i = 1; i <= n; i++){
            Suma += i;
        }
        System.out.println(Suma);
    }
}
