package complementarios.nivel2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class n2ejercicio6 {
        /* 
    Se dispone de una colección de Empleados, de cada empleado se conoce:
    Nombre y Apellido
    DNI
    horasTrabajadas
    valorPorHora
    Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo
    (horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario)
    donde la clave (key) es el dni y el valor (value) es el sueldo calculado. 
    */
    public static void main(String[] args) {
        //instanciado del objeto set de empleados y map de empleados
        Set <Empleados> empleado = new HashSet<>();
        Map <Integer, Integer> salarios = new HashMap<>();
        
        //cargamos el set con los objetos empleados
        empleado.add(new Empleados("emanuel", "gomila", 2222222, 60, 600));
        empleado.add(new Empleados("daiana", "meza", 1111111, 60, 400));
        empleado.add(new Empleados("andres", "gomila", 3333333, 40, 700));

        for (Empleados emp: empleado){
            //variable auxiliar
            int sueldo;
            sueldo = emp.getHorasTrabajadas() * emp.getValorPorHora();
            //guardamos el sueldo del empleado en un map
            salarios.put(emp.getDni(), sueldo);
        }

        //bucle for para devolver los salarios 
        for (Empleados emp: empleado){
            System.out.printf("\nEmpleado: %s, %s => Sueldo: %d",
            emp.getApellido(),
            emp.getNombre(),
            salarios.get(emp.getDni()));
        }

        
    }
}

class Empleados {
    //propiedades y atributos
    private String nombre;
    private String apellido;
    private int dni;
    private int horasTrabajadas;
    private int valorPorHora;
    
    //constructor
    public Empleados(String nombre, String apellido, int dni, int horasTrabajadas, int valorPorHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    //metodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(int valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    
}
