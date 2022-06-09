import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5N3 {
    public static void main(String[] args) {
        //declaro una lista de alumnos y la cargo
        List<Alumno> listaAlumnos = List.of(
            new Alumno("Bart", "Simpson", LocalDate.parse("2002-01-01")),
            new Alumno("Homero", "Simpson", LocalDate.parse("1982-01-01")),
            new Alumno("Lisa", "Simpson", LocalDate.parse("2003-01-01")),
            new Alumno("Marge", "Simpson", LocalDate.parse("1983-01-01")),
            new Alumno("Maggie", "Simpson", LocalDate.parse("2019-01-01"))
        );

        //crear un Map de alumno con clave nombre y apellido y valor edad
        Map<String,Integer> mapAlumno = listaAlumnos.stream()
            .collect(Collectors
                .toMap(k -> k.getApellido()+" "+k.getNombre(), v -> calulcarEdad(v.getFechaNacimiento())));
        //mostrar el map 
        mapAlumno.forEach((k,v) -> System.out.printf("%s = %d\n", k,v));
    }

    public static int calulcarEdad(LocalDate fecha){
        Period edad = Period.between(fecha, LocalDate.now());
        return edad.getYears();
    }
}

class Alumno{
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    
    public Alumno(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "[apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + "]";
    }
}
