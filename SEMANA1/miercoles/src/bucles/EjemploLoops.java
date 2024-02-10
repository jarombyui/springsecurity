package bucles;

import java.sql.SQLOutput;

public class EjemploLoops {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++)
        {
            System.out.println(i);
        }

        System.out.println("Aumentando de 5 en 5");

        for(int i = 0; i<10; i=i+5)
        {
            System.out.println(i);
        }
    }
}
