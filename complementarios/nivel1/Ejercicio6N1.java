import java.util.Scanner;

public class Ejercicio6N1 {
        /* Se desea una aplicación que solicite 2 números enteros y 
    realice la operación de potencia (sin uso de librerías). */
    public static void main(String[] args) {
        //instanciado del objeto scanner
        Scanner input=new Scanner(System.in);
        //declaracion de variables e inicializacion
        int base=0, exponente=0, resultado=1;

        //msg al usuario del programa
        System.out.println("\nPrograma que calcula realiza la operacion potencia de dos numeros ingresados");
        //msg de ingreso del valor de la base
        System.out.print("Ingrese el valor de la base: ");
        //llamado al objeto scanner para ingresar el valor de la base
        base=input.nextInt();
        //msg de ingreso del valor del exponente
        System.out.print("Ingrese el valor del exponente: ");
        //llamado al obeto scanner para ingresar el valor del exponente
        exponente=input.nextInt();

        //bucle for para realizar la multiplicacion sucesiva de la base
        for(int i=1; i<=exponente; i++){
            //acumulador
            resultado*=base;
        }
        //msg por pantalla del resultado de la potencia
        System.out.printf("%d^%d = %d", base, exponente, resultado);
        //cierre del objeto scanner
        input.close();
    }
}
