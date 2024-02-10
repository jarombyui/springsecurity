package condicionales;

import java.util.Scanner;
// EJERCICIO 2.3 escriba un programa que reciba un numero y verifique si es positivo o negativo
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su numero: ");
        int valor = sc.nextInt();

        if (valor>0)
        {
            System.out.println("El numero es positivo");
        }
        else if (valor<0)
        {
            System.out.println("El numero es negativo");
        }
        else {
            System.out.println("Fin del programa");
        }
    }
}
