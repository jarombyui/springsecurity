package condicionales;

public class EjemploAndOr {
    public static void main(String[] args) {

        // ejemplo and = &&
        int num1 = 10;
        int num2 = 12;
        int num3 = 16;

        System.out.println("Ejemplo AND");
        System.out.println(num2>num1 && num1>num3); /* 'AND' basta que 1 condition sea false,la declaration es false */
        System.out.println(num2>num1 && num1<num3); /*'And' las 2 condition son true, declaration true*/

        // ejemmplo or = ||
        System.out.println("Ejemplo OR");
        System.out.println(num2>num1 || num1>num3);/*'OR' basta que 1 condition sea 'true', la declaration sera 'true' */
        System.out.println(num2<num1 || num1<num3);/*'OR' basta que 1 condition sea 'true', la declaration sera 'true' */

    }
}
