package condicionales;

public class EjemploCond {

    public static void main(String[] args) {
        int num1 = 10;
        int  num2 = 12;
        // condicinal

        if(num1 < num2){
            System.out.println("Num1 es menor que num 2");
        }
        else {
            System.out.println("Num2 es menor");
        }


        // dado un numero, verificar si es par o no es par
        int numero = 10;
        if(numero%2==0)
        {
            System.out.println("El numero es par");
        }
        else {
            System.out.println("el numeor es impar");
        }
        System.out.println("Fin del programa");
    }
}
