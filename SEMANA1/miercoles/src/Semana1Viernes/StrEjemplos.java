package Semana1Viernes;

public class StrEjemplos {
    public static void main(String[] args) {
        String str  = "Hola a todos";
        /// obtener un caracter de un
        System.out.println(str.charAt(1));


        //obener substring

        String str1 = str.substring(1);
        System.out.println(str1);

        String str2 = str.substring(1, 3);
        System.out.println(str2);


        // starwith y endwith

        boolean starwith1 = str.startsWith("Ho");
        System.out.println(starwith1);

        boolean starwith2 = str.startsWith("ho");
        System.out.println(starwith2);

        boolean endwith1 = str.endsWith("os");
        System.out.println(endwith1);

        boolean endwith2 = str.endsWith("Os");
        System.out.println(endwith2);

        // eliminar espacios en blanco

        String blank = "  Hola   . hola";
        System.out.println(blank.trim());

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        String[] s = str.split( "");
        System.out.println();


    }
}
