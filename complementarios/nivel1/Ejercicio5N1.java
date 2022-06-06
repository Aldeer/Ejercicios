import java.util.Scanner;

public class Ejercicio5N1 {
        /* Se desea una aplicación que solicite 2 números enteros y realice 
    la operación de multiplicación por sumas sucesivas (sin uso de librerías). */
    public static void main(String[] args) {
        //instanciado del objeto scanner
        Scanner input=new Scanner(System.in);
        //declaracion de variables
        int numero1=0, numero2=0, resultado=0;

        //Msg al usuario
        System.out.println("Programa pide dos numeros enteros y devuelve el resultado de la multiplicacion entre " + 
        "ambos");
        //msg para el ingreso del primer valor
        System.out.print("Ingresa un numero: ");
        //llamado del objeto scanner para guardar el primer valor
        numero1=input.nextInt();
        //msg para el ingreso del segundo valor
        System.out.print("Ingresa otro numero: ");
        //segundo llamado al objeto scanner para guardar segundo valor
        numero2=input.nextInt();

        //bucle for para realizar la multiplicacion por suma sucesiva
        for(int i=1; i<=numero1; i++){
            //acumulacion de las sumas en la variable resultado
            resultado+=numero2;
        }
        
        //mostrar el resultado en pantalla
        System.out.printf("El resultado de la multiplicacion es %d", resultado);
        //cierre del objeto scanner
        input.close();
    }
}
