import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4N3 {
    public static void main(String[] args) {
        //definimos y creamos una lista de numeros enteros con algunos elementos repetidos
        List<Integer> listaNumeros = List.of(1,1,2,2,5,6,8,5);
        /* 
        Definimos otra lista para almacenar el factorial de los numeros contenidos 
        en la lista anterior. Filtraremos los valores repetidos y luego
        operaremos los datos sacando su factorial
        */
        List<Integer> listaDeFactoriales = listaNumeros.stream()
            .distinct()
            .map(num -> Ejercicio4N3.factorial(num))
            .collect(Collectors.toList());
        //mostrar los elementos de la nueva lista con los factoriales
        System.out.println(listaDeFactoriales);
    }
    public static int factorial(int f){
        if(f == 1){
            return 1;
        } else {
            return f * factorial(f-1);
        }
    }
}
