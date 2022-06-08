import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2N3 {
    public static void main(String[] args) {
        //definimos e instanciamos un objeto list
        List<Integer> listaNumeros = List.of(1,2,3,4,5,6);
        
        //definimos otra lista donde se almacenaran los numeros potenciados al cuadrado
        List<Integer> listaNumerosPotenciados = listaNumeros.stream()
            .map(num -> (int) Math.pow(num, 2.00))
            .collect(Collectors.toList());
        //mostramos la lista nueva con los elementos potenciados
        System.out.println(listaNumerosPotenciados);
    }
}
