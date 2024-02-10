package TareaSemana1;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);

    }
}
