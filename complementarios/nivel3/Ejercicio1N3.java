import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Ejercicio1N3 {
    public static void main(String[] args) {
        //defino mi interface list para guardar strings
        List<String> palabras = new ArrayList<>();
        //cargo mi lista de palabras
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        /* 
        usamos stream para filtrar los datos segun haya elementos nulos y o espacios vacios
        devolviendo solo palabras
        */
        palabras.stream()
            .filter(Objects::nonNull)
            .filter(p -> !p.equals(""))
            .forEach(p -> {
                System.out.printf("%s ",p);
            });
    }
}