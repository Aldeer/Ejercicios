package complementarios.nivel2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class n2ejercicio5 {
        /* Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) 
    del resumen de carga de horas semanal de un empleado. Se debe generar otra lista que 
    contenga los totales y luego imprimir el total final a cobrar */

    public static void main(String[] args) {
        //instanciado del objeto scanner
        Scanner input = new Scanner(System.in);
        //instanciado del objeto ArrayList
        ArrayList <Integer> horasTrabajadas = new ArrayList<>();
        ArrayList <Integer> valorPorHoras = new ArrayList<>();
        List <Integer> gananciaPorDia = new ArrayList<>();
        String [] dias = {"Lunes", "Martes","Miercoles","Jueves","Viernes"};

        //bucle for para carcar las horas trabajadas
        for (String dia: dias){
            //declaracion de variable auxiliar
            int hora;
            System.out.printf("Ingrese la cantidad de horas trabajas el %s: ", dia);
            //llama al objeto scanner para guardar el valor de las horas trabajas
            hora = input.nextInt();
            //carga el valor ingresado al arraylist
            horasTrabajadas.add(hora);
        }
        System.out.println("----------------------------------------------------------------");
        //bucle for carga el valor de por horas
        for (String dia: dias){
            //declaracion de variable auxiliar
            int valor;
            System.out.printf("Ingrese cuanto gana por las horas trabajadas el %s: ", dia);
            //llama al objeto scanner para guardar el valor de las horas trabajas
            valor = input.nextInt();
            //carga el valor ingresado al arraylist
            valorPorHoras.add(valor);
        }
        //cierre del objeto scanner
        input.close();

        //declaracion de variables iteradoras
        Iterator <Integer> iteradorHorasTrabajadas = horasTrabajadas.iterator();
        Iterator <Integer> iteradorValorPorHoras = valorPorHoras.iterator();
        /*el bucle recorre los valores iterados de las 2 arrraylist, multiplica los valores y los almacena
        en otra lista*/
        while (iteradorHorasTrabajadas.hasNext() && iteradorValorPorHoras.hasNext()) {
            //declaracion de variable auxiliar
            int resultado = iteradorHorasTrabajadas.next() * iteradorValorPorHoras.next();
            gananciaPorDia.add(resultado);
        }

        System.out.println("----------------------------------------------------------------");
        //muestra la lista de ganacias por dia
        System.out.println("\nLa ganancias por dia son: " + gananciaPorDia);

        //declaracion de la variable que va a almacenar la ganancia total
        int gananciaTotal=0;
        for (int ganacia: gananciaPorDia) {
            gananciaTotal+=ganacia;
        }
        //mostrar la ganancia total
        System.out.println("La ganancia total de la semana es: " + gananciaTotal);
    }
}
