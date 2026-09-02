public class CursoProgramacion {

    // Variables y tipos de datos - Semana 1
    private String nombre;
    private int cantidadEstudiantes;
    private double notaMinima;
    private boolean disponible;

    // Variable static - Semana 2
    private static int totalCursos = 0;

    // Constructor
    public CursoProgramacion(String nombre, int cantidadEstudiantes,
                             double notaMinima, boolean disponible) {
        this.nombre = nombre;
        this.cantidadEstudiantes = cantidadEstudiantes;
        this.notaMinima = notaMinima;
        this.disponible = disponible;
        totalCursos++;
    }

    // Getters y Setters - Semana 2

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    public double getNotaMinima() {
        return notaMinima;
    }

    public void setNotaMinima(double notaMinima) {
        this.notaMinima = notaMinima;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Getter static
    public static int getTotalCursos() {
        return totalCursos;
    }

    // Método para mostrar los datos
    public void mostrarInformacion() {
        System.out.println("Curso: " + nombre);
        System.out.println("Cantidad de estudiantes: " + cantidadEstudiantes);
        System.out.println("Nota minima: " + notaMinima);
        System.out.println("Disponible: " + disponible);
    }
}