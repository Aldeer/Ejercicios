import java.util.List;

public class Ejercicio3N3 {
    public static void main(String[] args) {
        //definimos y creamos una lista
        List<String> listaDePersonajes = List.of(
            "Aquaman", "Batman", "Superman", "Flash", "Batgirl",
            "brainiac", "Cyborg" 
        );
        //usamos la funcion stream para devolver la cantidad de nombres que empiezan con 'b'
        int n = (int) listaDePersonajes.stream()
            .filter(per -> per.startsWith("b") || per.startsWith("B"))
            .count();
        
        System.out.println(
            "\nLa cantidad de personajes que inician su nombre con al letra B son: "+n
        );
    }
}
