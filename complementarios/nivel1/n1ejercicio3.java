package complementarios.nivel1;

import java.util.Scanner;

public class n1ejercicio3 {
    public static void main(String[] args) {
        //instanciar el objeto scanner
        Scanner input = new Scanner(System.in);
        //declaracion de variables
        int numero = 0;

        /* este programa devuelve la secuencia de numeros incrementando de a uno hasta 
        llegar al valor digitado por el usuario */

        //Msg al usuario 
        System.out.print("Ingrese un numero: ");
        //llamado al objeto scanner para ingresar y guardar el valor en la variable
        numero = input.nextInt();

        //bucle for para mostrar en secuencia los numeros consecutivos hasta alcanzar el valor ingresado por el usuario
        for(int i=1; i<=numero; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            //salto de linea para mostrar la siguiente fila de la secuencia de numeros
            System.out.println("");
        }
        //cierre del objeto scanner
        input.close();
    }
}
