public class CalculadoraBasica {
 
    private String historial;
    private static int totalOperaciones = 0;  // modificador static
 
    public CalculadoraBasica() {
        this.historial = "";
    }
 
    // Sobrecarga del método sumar
    public int sumar(int a, int b) {
        int resultado = a + b;
        totalOperaciones++;
        historial += a + "+" + b + "=" + resultado + "\n";
        return resultado;
    }
 
    public double sumar(double a, double b) {
        double resultado = a + b;
        totalOperaciones++;
        historial += a + "+" + b + "=" + resultado + "\n";
        return resultado;
    }
 
    public int sumar(int a, int b, int c) {
        return sumar(a, b) + c;
    }
 
    // Método static
    public static int getTotalOperaciones() { return totalOperaciones; }
    public void mostrarHistorial() { System.out.println(historial); }

}
