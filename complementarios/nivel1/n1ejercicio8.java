package complementarios.nivel1;

import java.util.Scanner;

public class n1ejercicio8 {
        /* Crear una aplicación que solicite de entrada los datos de una persona en este orden:
    Nombre y Apellido
    Edad
    Dirección
    Ciudad
    Luego imprimirá el siguiente mensaje:
    {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido} */
    public static void main(String[] args) {
        //instanciado del objeto scanner
        Scanner input=new Scanner(System.in);
        //declaracion de variables e inicializacion
        String nombreYApellido="", direccion="", ciudad="";
        int edad=0;

        //msg al usuario
        System.out.println("\nEste programa solicita los datos de una persona y los devuelve en el siguiente orden"+
        "{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}");
        //msg de solicitud de ingreso por teclado del nombre y apellido
        System.out.print("Ingrese su nombre y apellido: ");
        //llamado al objeto scanner para ingresar nombre y apellido, y guardarlo en su variable
        nombreYApellido=input.nextLine();
        //msg de solicitud de ingreso por teclado de la edad
        System.out.print("ingrese su edad: ");
        //llamado al objeto scanner para ingresar la edad y guardarlo en su variable
        edad=input.nextInt();
        /*llamado al metodo nexLine para elimnar el salto de linea que dela nextInt, para
        asi no me devuelve vacio el siguiente nexLine*/
        input.nextLine();
        //msg de solicitud de ingreso por teclado de la direccion
        System.out.print("Ingrese su direccion: ");
        //llamado al objeto scanner para ingresar el valor de la direccion  y almacenarlo en su variable
        direccion=input.nextLine();
        //msg de solicitud de ingreso por teclado de la ciudad
        System.out.print("Ingrese su ciudad: ");
        //llamado al objeto scanner para ingresar el valor de la ciudad y guardarlo en la variable
        ciudad=input.nextLine();

        //impresion por pantalla de los valores ingresados por el usuario
        System.out.printf("%s - %s - %d - %s", ciudad, direccion, edad, nombreYApellido);
        //cierre del objeto scanner
        input.close();
    }
}
