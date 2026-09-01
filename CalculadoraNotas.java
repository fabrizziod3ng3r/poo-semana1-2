
public class CalculadoraNotas {

    // Método privado para calcular el promedio de las evaluaciones
     private static double calcularPromedio(double evaluacion1, double evaluacion2,
        double evaluacion3) {

        return evaluacion1 * 0.30 + evaluacion2 * 0.30 + evaluacion3 * 0.40; // devuelve el valor del promedio
    }

    // Método privado para calcular el estado del estudiante según su promedio
    private static String calcularEstado(double promedio) {
        if (promedio >= 14) {
            return "Aprobado con distinción ✅";
        } else if (promedio >= 11) {
            return "Aprobado";
        } else if (promedio >= 5) {
            return "En recuperación";
        } else {
            return "Desaprobado ❌";
        }
    }

    // Método público para mostrar el resultado del estudiante
    public static void mostrarResultado(String nombre, double evaluacion1,
        double evaluacion2, double evaluacion3) {

        double promedio = calcularPromedio(evaluacion1, evaluacion2, evaluacion3);
        String estado = calcularEstado(promedio);

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Estudiante : " + nombre.toUpperCase());
        System.out.printf("Promedio   : %.2f%n", promedio);
        System.out.println("Estado     : " + estado);
    }









}