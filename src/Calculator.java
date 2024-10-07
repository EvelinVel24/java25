public class Calculator {

    // Método que realiza las divisiones
    public static void dividir(int[] numeradores, int[] denominadores) {
        for (int i = 0; i < numeradores.length; i++) {
            try {
                // Realizamos la división
                int resultado = numeradores[i] / denominadores[i];
                System.out.println("Resultado de " + numeradores[i] + " / " + denominadores[i] + " = " + resultado);
            } catch (ArithmeticException e) {
                // Captura la excepción por división entre 0
                System.out.println("Error: No se puede dividir por 0 en el índice " + i);
            } catch (ArrayIndexOutOfBoundsException e) {
                // Captura la excepción por índice fuera de los límites
                System.out.println("Error: No hay más denominadores para el numerador en el índice " + i);
            } finally {
                System.out.println("Finalizando la operación para el índice " + i + "\n");
            }
        }
    }

    public static void main(String[] args) {
        // Arreglos de numeradores y denominadores
        int[] numeradores = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denominadores = {2, 0, 4, 4, 0, 8};

        // Manejo de excepciones en el main
        try {
            dividir(numeradores, denominadores);
        } catch (Exception e) {
            System.out.println("Error en la ejecución de la calculadora.");
        }
    }
}
