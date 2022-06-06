import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7N2 {
    /* 
    Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), 
    nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final.
    Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si 
    es a la vez múltiplo de ambos colocara “FizzBuzz”. 
    Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con 
    qué valor debe frenar (no se incluye en el cálculo)
    Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4  
    */
    public static void main(String[] args) {
        //instanciado del objeto scanner
        Scanner scan =new Scanner(System.in);
        //declaracion de variables
        int extremoInicial=0, extremoFinal=0;

        //Ingreso de los valores por teclado
        System.out.print("Ingrese el valor del extremo inicial del intervalo: ");
        extremoInicial=scan.nextInt();
        System.out.print("Ingrese el valor del extremo final del invervalo: ");
        extremoFinal=scan.nextInt();
        //cierre del objeto scanner
        scan.close();

        System.out.println(fizzBuzzFuncion(extremoInicial, extremoFinal));
    }

    public static List<String> fizzBuzzFuncion(int a, int b){
        List <String> arraylist = new ArrayList<>();

        for (int i=a; i<b; i++){
            //condicional que devuelve fizz, buzz, fizzbuzz o el string del numero 
            //segun sea divisible por 2, 3 o por ambos
            if (i%6 == 0){
                /* evaluamos la primer condicion de si es divisible por 2 y 3, simplificamos
                el argumento en la condicion en base a una regla de divisores, dice que si
                un numero es divisible por 6 entonces es divisible por 2 y por 3 */
                arraylist.add("FizzBuzz");
            } else if (i%2 == 0){
                arraylist.add("Fizz");
            } else if (i%3 == 0){
                arraylist.add("Buzz");
            } else {
                arraylist.add(""+i);
            }
        }
        return arraylist;
        
    }
}
