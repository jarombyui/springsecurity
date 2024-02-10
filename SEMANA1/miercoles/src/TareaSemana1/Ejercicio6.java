package TareaSemana1;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Cuadrados perfecto hasta el numero 100: ");

        for (int i = 1; i <= 10; i++) {
            int cuadradoPerfecto = i * i;

            if (cuadradoPerfecto <= 100) {
                System.out.println(cuadradoPerfecto);
            } else {
                break;
            }
        }
    }
}
