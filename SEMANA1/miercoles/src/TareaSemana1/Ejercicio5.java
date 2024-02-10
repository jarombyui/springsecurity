package TareaSemana1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para sumar sus digitos: ");
        int numero = scanner.nextInt();

        int sumaDigitos = sumarDigitos(numero);

        System.out.println("La suma de los dígitos es: " + sumaDigitos);
    }

    // Método para sumar los dígitos de un número
    public static int sumarDigitos(int numero) {
        int suma = 0;

        while (numero != 0) {
            suma += numero % 10; // Sumar el último dígito
            numero /= 10;        // Eliminar el último dígito
        }

        return suma;
    }
}
