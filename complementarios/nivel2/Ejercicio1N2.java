import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1N2 {
        /* Crear un ArrayList y cargarlo con tus ciudades favoritas de 
    Argentina, luego imprimir por pantalla el ranking */
    public static void main(String[] args) {
        //instanciado del objeto scanner
        Scanner input = new Scanner(System.in);
        //instanciado del objeto arraylist
        List <String> ciudadesFavoritas = new ArrayList<String>();
        //declaracion de variable e inicializacion
        int vueltas = 5;
        int posicion = 0;

        //msg al usuario
        System.out.println("\nEste programa te pide que ingrese 5 de tus ciudades favoritas de Argentina" + 
        " y te devuelve en un ranking");
        //bucle while para cargar las 5 ciudades favoritas
        while (vueltas != 0){
            //decremento en 1 del valor almacenado
            vueltas--;
            //msg de solicitud de ingreso por teclado de la ciudad
            System.out.print("Ingresa una ciudad favorita: ");
            //declaracion de variable auxiliar y posterior ingreso del dato
            String ciudad = input.nextLine();
            //cargando el arraylist
            ciudadesFavoritas.add(ciudad);
        }
        //cierre del objeto scanner
        input.close();
        
        //salto de linea para separar la impresion en pantalla
        System.out.println("");
        //bucle for each para mostrar el ranking de ciudades favoritas
        for(String ciudad:ciudadesFavoritas){
            //incremento en 1 la variable posicion
            posicion++;
            //impresion por pantalla del ranking de las cuidades favoritas
            System.out.printf("#%d - %s\n", posicion, ciudad);
        }


    }
}
