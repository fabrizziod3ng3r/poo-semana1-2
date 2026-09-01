// Alumno.java — clase creada en Semana 2
public class Estudiante { 
 
    // Atributos de instancia (privados - encapsulamiento)
    private String nombre;
    private int edad;
    private double promedio;
    private boolean curso;
 
    // Variable STATIC: compartida por todos los objetos
    private static int totalEstudiantes = 0;
 
    // Constructor de estudiante
    public Estudiante(String nombre, int edad, double promedio, boolean curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio   = promedio;
        this.curso = curso;
        totalEstudiantes++;   // se incrementa en cada objeto creado
    }
 
    // Getters de las variables privadas
    public String getNombre() { return nombre; }
    public double getPromedio()   { return promedio; }
    public int getEdad()   { return edad; }
    public boolean getcurso() {return curso; }

    // Setters de las variables privadas
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setPromedio(double promedio) { this.promedio = promedio; }
    public void setCurso(boolean curso) { this.curso = curso; }

    // Método static
    public static int getTotalEstudiantes() { return totalEstudiantes; }
 
    // Muestra información del estudiante
    public void mostrarInfo() {
        System.out.println("\n=======================================");
        System.out.println("         PERFIL DEL ESTUDIANTE ");
        System.out.println("=======================================");
        System.out.println("Nombre    : " + nombre);
        System.out.println("Edad      : " + edad);
        System.out.println("Promedio  : " + promedio + " / 20");
        System.out.println("Carga     : Más de 5 cursos :" + curso);
        System.out.println("=======================================");

    }
}