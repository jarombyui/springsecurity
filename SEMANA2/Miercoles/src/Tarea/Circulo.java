// Clase abstracta Figura
abstract class Figura {
    // Métodos abstractos que deben ser implementados por las clases derivadas
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

// Clase Círculo que hereda de Figura
class Circulo extends Figura {
    // Atributos específicos para un círculo
    private double radio;

    // Constructor de la clase Círculo
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método para calcular el área de un círculo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Implementación del método para calcular el perímetro de un círculo
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Getter para obtener el radio del círculo
    public double getRadio() {
        return radio;
    }
}

