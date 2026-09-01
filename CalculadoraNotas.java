
public class CalculadoraNotas {

     private static double calcularPromedio(double evaluacion1, double evaluacion2,
        double evaluacion3) {

        return evaluacion1 * 0.30 + evaluacion2 * 0.30 + evaluacion3 * 0.40; // devuelve el valor del promedio
    }


    public static void mostrarResultado(String nombre, double evaluacion1,
        double evaluacion2, double evaluacion3) {

        double promedio = calcularPromedio(evaluacion1, evaluacion2, evaluacion3);

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Estudiante : " + nombre.toUpperCase());
        System.out.printf("Promedio   : %.2f%n", promedio);
    }









}