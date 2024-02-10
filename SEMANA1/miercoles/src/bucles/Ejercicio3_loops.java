package bucles;

import java.util.Scanner;

public class Ejercicio3_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su numero de vecez: ");
        int num = sc.nextInt();
        for (int i=0;i<num;i++){
            System.out.println("Hola Mundo");
        }
    }
}

