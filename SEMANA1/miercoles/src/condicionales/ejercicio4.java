package condicionales;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();

        if (esBisiesto(anio)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }

    // Método para verificar si un año es bisiesto
    public static boolean esBisiesto(int anio) {
        // Un año es bisiesto si es divisible por 4 y no divisible por 100, excepto si es divisible por 400
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}
