import java.util.Random;

public class NumerosAleatoriosWhile {
    public static void main(String[] args) {
        Random rand = new Random(); // Generador de números aleatorios
        int contador = 0;
        int suma = 0;

        System.out.println("Números aleatorios:");

        while (contador < 10) {
            int numero = rand.nextInt(100) + 1; // Genera un número del 1 al 100
            System.out.println(numero);
            suma += numero;
            contador++;
        }

        double promedio = suma / 10.0;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
