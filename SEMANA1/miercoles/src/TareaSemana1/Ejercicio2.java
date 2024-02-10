package TareaSemana1;

public class Ejercicio2 {
    public static void main(String[] args) {
        int sumaImpares = 0;
        for (int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                sumaImpares += i;
            }
        }
        System.out.println("La suma de los numeros impares del 1 al 100 es: " + sumaImpares);
    }
}
