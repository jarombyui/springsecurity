package SolucionEjerciciolunes18;

public class ejercicio5 {

    static final int tipoCambioDolarEuro = 3;
    static final int tipoCambioEuroDolar = 2;
    public static void main(String[] args) {
        int cantidadDolares = 30;
        int cantidadEuros = 60;

        int comversionEuros = cantidadDolares * tipoCambioDolarEuro;
        int conversionDolares = (cantidadEuros/tipoCambioEuroDolar);

        System.out.println("La comversion a euros son: ");
        System.out.println(cantidadEuros);

        System.out.println("La comversion a dolares son: ");
        System.out.println(cantidadDolares);

    }
}
