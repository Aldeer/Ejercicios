import java.util.Scanner;

public class Ejercicio4N1 {
    public static void main(String[] args) {
        //instanciado de la clase scanner
        Scanner input=new Scanner(System.in);
        //declaracion variables
        int numero=0;
        int resultado=1;

        /**Este programa devuelve el factorial de un numero dado*/
        System.out.println("Calcular el factorial de un numero");
        System.out.print("Ingresa un numero entero: ");
        //llamado al objeto scanner
        numero=input.nextInt();
        //bucle for para ir multiplicando los valores sucesivos del numero ingresado
        for(int i=1; i<=numero; i++){
            resultado*=i;
        }
        //impresion por pantalla del resultado del factorial del valor ingresado
        System.out.printf("%d! = %d", numero, resultado);
        //cierre del objeto scanner
        input.close();
    }
}
