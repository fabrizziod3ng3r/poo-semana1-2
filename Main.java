public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Fabrizzio Palacios",22, 18, false);
        Estudiante e2 = new Estudiante("Beatriz Leon", 21, 17,true);
        Estudiante e3 = new Estudiante("Rosa Díaz", 23, 18.5, true);

        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();
 
        System.out.println("\nTotal de estudiantes: " + Estudiante.getTotalEstudiantes());

        e3.setNombre("María Díaz");
        System.out.println("\n****************************************************");
        System.out.println("\nCambio de nombre del estudiante 3: " + e3.getNombre() + "\n");
        e3.mostrarInfo();
    }
}