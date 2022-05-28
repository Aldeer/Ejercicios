package complementarios.nivel2;

import java.util.ArrayList;
import java.util.Scanner;

public class n2ejercicio2 {
        /* 
    Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero 
    al principio de la lista y otro al final. Por último, iterar e imprimir los 
    elementos de la lista y el tamaño de la misma (antes y después de agregar a en 
    la primera y última posición).
    */
    
    public static void main(String[] args) {
        //instanciado del objeto scanner y arraylist
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> listaNumeros =  new ArrayList<Integer>();
        //declaracion de variables e inicializacion
        int vueltas = 7;
        int tamañoInicial=0;
        int tamañoFinal=0;

        //msg al usuario
        System.out.println("\nEste programa crea un ArrayList de 5 numeros enteros por teclado, " +
        "se agregan 2 numeros mas al comienzo y final de la lista, e imprime los elementos " + 
        "y tamaño de la misma antes y despues de agregar los dos numeros");

        //declaracion de bucle while para cargar los 5 primeros numeros a la lista
        while (vueltas != 0) {
            //declaracion de variable local auxiliar para los numeros enteros
            int numero;

            //condicional que entra solo para cargar los 5 primeros numeros
            if (vueltas > 2) {
                //msg al usuario de que ingrese un numero
                System.out.print("Ingresa un numero: ");
                //ingresa el numero por teclado y lo almacena
                numero = input.nextInt();
                //carga el valor numero a la lista
                listaNumeros.add(numero);
            }
            //decremento en 1
            vueltas--;
            
            
            //condicional que ingresa luego de cargar los 5 primeros numeros
            if(vueltas == 2) {
                //guardar el tamaño original del arraylist
                tamañoInicial = listaNumeros.size();
            }
            //condicional que entra luego de cargar los dos ultimos datos 
            if (vueltas <= 1) {
                //codicional para ingresar el numero al comienzo de la lista
                if (vueltas == 1) {
                    //msg al usuario que ingrese un numero
                    System.out.print("Ingresa otro numero: ");
                    //guardar el numero ingresado por el usuario
                    numero = input.nextInt();
                    //agregar el valor al comienzo de la lista
                    listaNumeros.add(0, numero);
                }
                //condicional para ingresar un numero al final de la lista
                if (vueltas == 0) {
                    //msg al usuario que ingrese un numero
                    System.out.print("Ingresa otro numero: ");
                    //guardar el numero ingresado por el usuario
                    numero = input.nextInt();
                    //agregar el valor al final de la lista
                    listaNumeros.add(numero);
                }
                
            }
        }
        //guardar el tamaño final de la lista
        tamañoFinal = listaNumeros.size();
        //cierre del objeto scanner
        input.close();
        
        //bucle for each para imprimir la lista de numeros por pantalla
        System.out.print("Los elementos de la lista son: [");
        for (int numeros: listaNumeros){
            //impresion con formato de los numeros de la lista
            System.out.printf("%d ", numeros);
        }
        System.out.print("]\n");
        System.out.println("El tamaño inicial de la lista es: " + tamañoInicial);
        System.out.println("El tamaño final de la lista es: " + tamañoFinal);
    }
}
