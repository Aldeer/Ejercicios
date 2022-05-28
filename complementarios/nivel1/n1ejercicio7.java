package complementarios.nivel1;

import java.util.Scanner;

public class n1ejercicio7 {
    /* Realizar un programa que dado un String de entrada en minúsculas lo convierta por 
    completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase(). */
    public static void main(String[] args) {
        //instanciado del objeto scanner
        Scanner input=new Scanner(System.in);
        //declaracion de variable e inicializacion
        String cadenaMinuscula = "", cadenaMayusucula="";

        //msg al usuario sobre el programa
        System.out.println("Programa recibe un string en minuscula y lo devuelve en mayusculas");
        //msg de ingreso de la cadena
        System.out.print("Ingresa una cadena en minusculas: ");
        //llamado al objeto scanner para ingresar valor de String y almacenarlo en la variable
        cadenaMinuscula=input.nextLine();

        //bucle for para recorrer los elementos del String
        for(int i=0; i<cadenaMinuscula.length(); i++){
            //variable auxiliar para guarda caracter de la cadena momentaneamente
            char letra=cadenaMinuscula.charAt(i);
            if(letra>='a' && letra<='z' || letra == ' '){
                /*Realizo la operacion de suma y resta de caracteres, el cual me devuelve un numero, ese numero lo
                transformo en caracter y gracias al codigo ASCII recibo el caracter en mayuscula en la cadena*/
                letra= (char) (letra-'a'+'A');
                //acumula los caracteres en mayuscula
                cadenaMayusucula+=letra;
            }
        }
        //muestra en pantalla una nueva cadena con mayuscula
        System.out.println(cadenaMayusucula);
        //cierre del objeto scanner
        input.close();
    }
}
