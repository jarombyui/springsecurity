package condicionales;

import java.util.Scanner;
// EJERCICIO 2.2 escriba un programa que reciba un numero y verifique si es par o impar
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int valor = sc.nextInt();

        if (valor%2==0)
        {
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
        System.out.println("Fin del programa");
    }
}
