package complementarios.nivel1;

import java.util.Scanner;

public class n1ejercicio2 {
    public static void main(String[] args) {
        //Instanciado del objeto scanner
        Scanner in = new Scanner(System.in);
        //declaracion de las variables
        int num1 = 0, num2 = 0;

        //Msg al usuario
        System.out.println("\nEste programa pide que se ingrese dos numeros por teclado y devuelve la suma, resta " + 
        "multiplicacion, division y modulo de los numeros ingresados");
        System.out.print("Ingresa un numero: ");
        //llamado del objeto scanner para almacenar el valor ingresado en la variable
        num1 = in.nextInt();
        System.out.print("Ingresa otro numero: ");
        //llamado del objeto scanner para almacenar el valor ingresado en la variable
        num2 = in.nextInt();

        //Msg al usuario mostrando los resultados
        //Impresion del resutlado de la suma
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        //Impresion del resultado de la resta
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        //Impresion del resultado de la multiplicacion
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        //Impresion del resultado de la division
        System.out.println(num1 + "/" + num2 + "=" + ((float)num1 / (float)num2));
        //Impresion del resultado de la modulo
        System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
        //cerrar el objeto scanner
        in.close();
    }
}
