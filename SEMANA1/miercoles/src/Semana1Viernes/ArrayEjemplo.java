package Semana1Viernes;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayEjemplo {
    public static void main(String[] args) {
        // definiendo un array 'permitivo', una vez definifo no se puede modificar su tamaño y otras caracteristicas
        int[] array = new int[5];
        array[2] = 10;
        array[4] = 56;

        // imprimiendo los arrays con sus respectivos indices uno por uno

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

        System.out.println("+++++++++++++++++++++++++++++++");

        //usando bucles para no imprimir linea por linea como se ve arriva
        int tamaño = array.length; // creamos una variable 'tamaño' en la que guardamos los arrays segun el tamaño
        for (int i=0; i < tamaño; i++) // creo un bucle, inicia en la posicion 'cero', cuya condicion es menor que el tamaño
        {                               // y que aumente de  en uno hasta alcanzar el tamaño delarray que es 5
            System.out.println(array[i]);
            System.out.println("+++++++++++++++++++++++++++++++");
        }

        // Segunda forma de definir un array con {} y utilizando en bucle for para imprimir

        int[] array2 = {1, 2, 1, 22, 23, 32, 23, 232};
        int tamaño2 = array2.length;
        for (int i=0; i < tamaño2; i++)
        {
            System.out.println(array2[i]);
        }

        /// ArrayList
        /// integer otra forma de representar un entero
        ArrayList<Integer> arrayList = new ArrayList<>(); /// hasta aqui esta con cero elementos el array
        arrayList.add(17); // con el 'arrayList.add' añado elementos a mi arrayList
        arrayList.add(56);
        arrayList.add(78);
        arrayList.add(67);
        System.out.println("+++++++++++++++++++++++++++++");
        int tamArrayList = arrayList.size(); // para sacar el tamaño de mi arrayList uso el '.size'
        for (int i =0 ; i < tamArrayList; i++)
        {
            System.out.println(arrayList.get(i));
        }

        /*arrayList.remove(0); /*te acepta borrar  el indice=index de un array  */


        //Linked List

        /*LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(2);
        linkedList.add(89);
        linkedList.add(76);

        System.out.println(linkedList);*/



    }
}
