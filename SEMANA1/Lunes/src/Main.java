
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TIPOS DE DATOS
        /*int vidas = 3;
        char valor ='a';



        System.out.println(vidas);
        System.out.println(valor);


        short num1 = 32767;
        byte num2 = 12;

        float alturaH = 1.733f;
        double factor = 0.23232323;*/


        // Imprimir imofmracion

        String nombre = "Jarom";
        String apellido = "Campos";
        byte edad  = 30;
        String ciudad = "Arequipa";
        float  altura = 1.65f;

        // Mi nombre es "Jarom" y mi apellido es "Campos", tengo 30 años y mido 1.65 y vivi en Lima.
        System.out.println("Mi nombre es "+nombre+" y mi apellido es "+apellido+", tengo "+edad+" años y mido "+altura+" y vivo en Lima");


        // OPERACION ES CON VARIABLES

        int num1 = 10;
        int num2 = 20;
        // suma
        int resultado = num1 + num2;
        System.out.println(resultado);
        //resta

        int resultado2 = num1 - num2;

        System.out.println(resultado2);

        num1 = num1+5;

        System.out.println(num1);

        num1 =56;

        System.out.println(num1);

        String str1 = "Hola";
        String str2 = "Mundo";

        String result = str1+str2;
        System.out.println(result);

        System.out.println();

        final float PI = 3.14f;

        num1 = 10;
        num2 =4;

        int resultadoDiv = num1/num2;
        System.out.println("Division " + resultadoDiv ) ;

        float resultadoDiv1 = (float) num1/num2;
        System.out.println(resultadoDiv);


        float num1F = 10;
        float num2F = 4;

        float resultafoF = num1F/num2F;
        System.out.println(resultafoF);

        // OPERADOR MODULO

        num1 = 10;
        num2 = 3;
        System.out.println(num1%num2);

        // calcula el area de un rectangulo
        // base * altura=height
        // area = base*altura

        float base = 10.4f;
        float height = 4.2f;

        float area = base*height;
        System.out.println("El area es: " + area);






    }
}