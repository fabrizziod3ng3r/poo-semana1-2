
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

    // Método privado que realiza un diagnóstico de las evaluaciones
    private static void diagnostico(double evaluacion1, double evaluacion2, 
        double evaluacion3) {

        // Arreglo que almacena las notas de las tres evaluaciones
        double[] notas = {evaluacion1, evaluacion2, evaluacion3};

        // Arreglo que permite identificar a qué evaluación pertenece cada nota
        String[] evaluaciones = {
            "Evaluación 1",
            "Evaluación 2",
            "Evaluación 3"
        };


        // Ordenamiento burbuja de menor a mayor
        // Se ordenan las notas para mostrar primero la evaluación
        // que necesita mayor refuerzo
        for (int i = 0; i < notas.length - 1; i++) {

            for (int j = 0; j < notas.length - 1 - i; j++) {

                if (notas[j] > notas[j + 1]) {

                    // Intercambiar las notas
                    double auxiliarNota = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = auxiliarNota;


                    // También se intercambia el nombre de la evaluación
                    // para mantener la relación entre evaluación y nota
                    String auxiliarEvaluacion = evaluaciones[j];
                    evaluaciones[j] = evaluaciones[j + 1];
                    evaluaciones[j + 1] = auxiliarEvaluacion;
                }
            }
        }


        System.out.println("\n--- DIAGNÓSTICO DE EVALUACIONES ---");


        // Recorremos las evaluaciones ya ordenadas de menor a mayor
        for (int i = 0; i < notas.length; i++) {

            System.out.println("\n" + evaluaciones[i]);
            System.out.printf("Nota : %.2f%n", notas[i]);


            // Clasificación del nivel de repaso según la nota obtenida
            if (notas[i] <= 5) {

                System.out.println("Nivel: Repaso urgente 🔴");
                System.out.println(
                    "Recomendación: Reforzar nuevamente los conceptos básicos."
                );

            } else if (notas[i] <= 10) {

                System.out.println("Nivel: Repaso necesario 🟠");
                System.out.println(
                    "Recomendación: Repasar la teoría y realizar más ejercicios."
                );

            } else if (notas[i] <= 13) {

                System.out.println("Nivel: Repaso recomendado 🟡");
                System.out.println(
                    "Recomendación: Practicar los temas donde presentó dificultades."
                );

            } else if (notas[i] <= 17) {

                System.out.println("Nivel: Repaso ligero 🟢");
                System.out.println(
                    "Recomendación: Reforzar algunos conceptos para consolidar el aprendizaje."
                );

            } else {

                System.out.println("Nivel: Tema dominado 🔵");
                System.out.println(
                    "Recomendación: Buen dominio de los temas evaluados."
                );
            }
        }


        // Como las notas están ordenadas de menor a mayor,
        // la posición 0 siempre contiene la evaluación con menor nota.
        System.out.println("\n--- PRIORIDAD DE REPASO ---");

        System.out.println(
            "Debe reforzar principalmente: " + evaluaciones[0]
        );

        System.out.printf(
            "Nota más baja: %.2f%n", notas[0]
        );
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

        // Después de mostrar el resultado general,
        // se llama al método que analiza las evaluaciones.
        diagnostico(evaluacion1, evaluacion2, evaluacion3);
    }

}