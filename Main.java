import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Fabrizzio Palacios",22, 18, false);
        Estudiante e2 = new Estudiante("Beatriz Leon", 21, 17,true);
        Estudiante e3 = new Estudiante("Rosa Díaz", 23, 18.5, true);

        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();
 
        System.out.println("\nTotal de estudiantes: " + Estudiante.getTotalEstudiantes());

        System.out.println("\n****************************************************");
        System.out.println("\nCambio de nombre del estudiante 3: " + e3.getNombre() + "\n");
        e3.setNombre("María Díaz");
        e3.mostrarInfo();

        // ==============================================================================
        Scanner scanner = new Scanner(System.in);   // instanciar la clase scanner 

        System.out.println("\n****************************************************");
        System.out.println("\nPRUEBA DE CALCULO DE NOTAS: ");


        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu nota para la Evaluación 1 (30%): ");
        double evaluacion1 = scanner.nextDouble();

        System.out.print("Ingresa tu nota para la Evaluación 2 (30%): ");
        double evaluacion2 = scanner.nextDouble();

        System.out.print("Ingresa tu nota para la Evaluación 3 (40%): ");
        double evaluacion3 = scanner.nextDouble();

        CalculadoraNotas.mostrarResultado(nombre, evaluacion1, evaluacion2, evaluacion3);

        scanner.close();
    }
}