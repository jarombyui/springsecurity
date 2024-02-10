import clasesJava.Computadora;
import clasesJava.Perro;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de la clase Persona
        /*Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Ana", 30);

        // Acceder a los atributos y métodos de los objetos
        persona1.saludar();
        persona2.saludar();

        // Cambiar el nombre de persona1 usando el setter
        persona1.setNombre("Pedro");
        persona2.setNombre("Jarom");

        // Obtener la edad de persona2 usando el getter
        int edadPersona2 = persona2.getEdad();
        int edadPersona1 = persona1.getEdad();

        System.out.println(persona2.getNombre() + " tiene " + edadPersona2 + " años.");
        System.out.println(persona1.getNombre() + " tiene " + edadPersona1 + " años.");*/




        // Crear objetos de la clase perro

        /*Perro perro1 = new Perro("Fido", "Doverman", (byte)10);
        Perro perro2 = new Perro("Cur", "Pastor", (byte)18);
        Perro perro3 = new Perro("Frank", "Hashpuppy", (byte)25);
        Perro perro4 = new Perro("Can", "Golden", (byte)19);

        // Acceder a los atributos y métodos de los objetos
        perro1.ladrar();
        perro2.comer();
        perro3.ladrar();
        perro4.comer();

        // Cambiar los nombres de los perros usando el "setter"

        System.out.println(perro1.nombre);
        System.out.println(perro2.edad);
        System.out.println(perro3.raza);
        System.out.println(perro4.nombre);*/



        // Crear objetos de la clase Computadora

        /*Computadora computadora1 = new Computadora("Lenovo", "H2-gp", (byte)7,45, 30.5F);*/

        // Crear un objeto de la clase Círculo
        Circulo miCirculo = new Circulo(5.0);

        // Obtener y mostrar el área y el perímetro del círculo
        System.out.println("Área del círculo: " + miCirculo.calcularArea());
        System.out.println("Perímetro del círculo: " + miCirculo.calcularPerimetro());
        System.out.println("Radio del círculo: " + miCirculo.getRadio());



    }
}
