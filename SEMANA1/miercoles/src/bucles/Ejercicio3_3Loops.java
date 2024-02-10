package bucles;

import java.util.Scanner;

public class Ejercicio3_3Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            if(i%2==0) /*Si 'i' modulo 2 means que si 2 es par*/
            {
                System.out.println(i);
            }
        }
        System.out.println("Solution 2");
        for(int i=0; i<n; i=i+2){
            System.out.println(i);
        }
    }
}
