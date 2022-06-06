import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4N2 {
    /* 
    Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3
    cursos (3 arrayList) e imprimir dichos cursos.
    */
    public static void main(String[] args) {
        //instanciado del objeto scanner y arraylist
        Scanner input = new Scanner(System.in);
        ArrayList <String> listaDeAlumnos = new ArrayList<String>();
        List <String> listaClaseUno = new ArrayList<String>();
        List <String> listaClaseDos = new ArrayList<String>();
        List <String> listaClaseTres = new ArrayList<String>();

        //declaracion de variables auxiliares
        String nombre = "";
        int vueltas = 12;

        //msg al usuario sobre el programa
        System.out.println("\nEste programa carga una lista de 12 alumnos y los separa en 3 cursos distintos");
        //bucle para rellenar la lista de alumnos
        for (int i = 1; vueltas >= i; i++) {
            System.out.print("Ingresa el nombre del alumno: ");
            nombre = input.nextLine();
            listaDeAlumnos.add(nombre);
        }
        //cierre del objeto scanner
        input.close();


        /*
        usando el metodo de subList para cortar las listas y luego almacenarlos
        */
        listaClaseUno = listaDeAlumnos.subList(0, 4);
        listaClaseDos = listaDeAlumnos.subList(4, 8);
        listaClaseTres = listaDeAlumnos.subList(8, 12);

        //impresion por pantalla de los alumnos separados en los 3 cursos
        System.out.printf("\nLista de alumnos de la clase 1: %s", listaClaseUno);
        System.out.printf("\nLista de alumnos de la clase 2: %s", listaClaseDos);
        System.out.printf("\nLista de alumnos de la clase 3: %s", listaClaseTres);
    }
}
