package TareaSemana1;

public class Ejercicio3 {
    public static void main(String[] args) {
        int multiplicando = 5;
        int multiplicadorInicio = 1;
        int multiplicadorFin = 10;


        System.out.println("Tabla de multiplicar del " + multiplicando + ":");


        for (int multiplicador = multiplicadorInicio; multiplicador <= multiplicadorFin; multiplicador++){
            int producto = multiplicando * multiplicador;
            System.out.println(multiplicando + " x " + multiplicador + " = " + producto);

        }

    }
}
