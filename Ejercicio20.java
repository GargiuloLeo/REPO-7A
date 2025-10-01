import java.util.Random;

public class NumerosAleatoriosDoWhile {
    public static void main(String[] args) {
        Random rand = new Random();
        int contador = 0;
        int max = Integer.MIN_VALUE; // Inicializamos el máximo al valor más bajo posible
        int min = Integer.MAX_VALUE; // Inicializamos el mínimo al valor más alto posible

        System.out.println("Números aleatorios:");

        do {
            int numero = rand.nextInt(100) + 1; // Número aleatorio entre 1 y 100
            System.out.println(numero);

            // Actualizamos máximo y mínimo
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }

            contador++;
        } while (contador < 10);

        System.out.println("Número máximo: " + max);
        System.out.println("Número mínimo: " + min);
    }
}
