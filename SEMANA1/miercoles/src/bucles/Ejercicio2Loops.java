package bucles;

import java.util.Scanner;

public class Ejercicio2Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de n: ");
        int n = sc.nextInt();

        for(int i = 0; i <= 10; i++) /*aqui ya conocemos el numero de iteraciones por ello */
        {
            System.out.println(i);
        }
    }
}
