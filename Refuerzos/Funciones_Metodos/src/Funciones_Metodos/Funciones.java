package Funciones_Metodos;

public class Funciones {

    public static void main(String[] args) {
        //ARGUMENTOS: cuando se pasan valores reales
        saludar();
        sumar(4, 10);

    }
    // PARAMETROS:Especifican el tipo de dato y el nombre de la variable que se utilizará
    // para almacenar el valor pasado a la función/metodo
    static void saludar(){
        System.out.println("Hola Mundo");
    }

    static void sumar(int a, int b){
        int suma = a + b;
        System.out.println("La suma es: " + suma);
    }

}
