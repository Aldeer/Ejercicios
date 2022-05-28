package complementarios.nivel1;

import java.util.Scanner;

public class n1ejercicio1 {
    public static void main(String[] args) {
        //instanciar el objeto escaner
        Scanner in = new Scanner(System.in);
        //declaracion de la variable
        String nombre = "";

        //Mostrar msg al usuario
        System.out.print("Ingrese su nombre de usuario: ");
        //llamado al objeto escaner para guardar lo que ingresa el usuario
        nombre = in.nextLine();
        //Mostrar saludo al usuario que ingreso su nombre
        System.out.printf("Hola %s!!!", nombre);
        //cerrar el objeto escaner
        in.close();
    }
}
