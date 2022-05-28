package complementarios.nivel2;

import java.util.ArrayList;
import java.util.Collections;

public class n2ejercicio3 {
    public static void main(String[] args) {
        //instanciado del objeto arraylist
        ArrayList <Integer> barajaFrancesa = new ArrayList<Integer>();
        //declaracion de variable
        int valor = 13;

        //bucle for para rellenar el arreglo con los valores de la baraja francesa
        for (int i = 1; valor >= i; i++) {
            barajaFrancesa.add(i);
        }
        
        //impresion por pantalla de la baraja francesa
        System.out.print("\n\nBaraja francesa ordenada: ");
        System.out.print(barajaFrancesa);
        System.out.print("\n\nBaraja francesa en orden inverso: ");
        //metodo para invertir el orden de los elementos de una lista
        Collections.reverse(barajaFrancesa);
        System.out.print(barajaFrancesa);
        System.out.print("\n\nBaraja francesa mezclada: ");
        //metodo para mezclar el orden de los elementos de una lista
        Collections.shuffle(barajaFrancesa);
        System.out.println(barajaFrancesa);
    }
}
