import java.util.Scanner;

public class Ejercicio9N1 {
            /* Dado un String de entrada (frase, texto, etc) calcular la 
    cantidad de veces que aparece una letra dada. */
    
    public static void main(String[] args) {
        //instanciado del objeto scanner
        Scanner input=new Scanner(System.in);
        //declaracion de variable y su inicializacion
        //variable donde se guarda la cadena introducida por el usuario
        String cadena="";
        //variable acumuladora de las veces que aparece una letra en el texto introducido por el usuario
        int contador=0;
        //variable donde se almacena el caracter a buscar en la cadena ingresada por el usuario
        char letra=0;

        //msg al usuario
        System.out.println("\nEste programa devuelve la cantidad de veces que se repite una letra determinada" +
        " en la cadena ingresada por el usario");
        //msg de soliciud de ingreso por teclado de texto o frase
        System.out.print("Ingresa un texto o frase por favor: ");
        //llamado al objeto scanner y su metodo para leer una cadena y su posterior guardado en la variable
        cadena=input.nextLine();
        //msg de solicitud de ingreso por teclado el caracter que quiere buscar dentro de la cadena
        System.out.print("Ingrese el caracter que desea buscar dentro de la cadena: ");
        //llamado al objeto scanner para ingresar el valor del caracter a buscar
        letra=input.nextLine().charAt(0);//llamamos al metodo charAt para devolver solo el primer valor ingresado

        //bucle for para recorrer la cadena
        for(int i=0; i<cadena.length(); i++){
            //condicional para poder acumular los casos en los que el caracter buscado se encuentre en la cadena
            if(cadena.charAt(i)==letra){
                //acumulador de veces que se repite el caracter buscado en la cadena
                contador++;
            }
        }

        //mostrar en pantalla las veces que se repite la letra buscada en la cadena ingresada
        System.out.printf("El caracter %c se repite %d en el texto", letra, contador);
        //cierre del objeto scanner
        input.close();
    }
}
