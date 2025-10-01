import java.util.Scanner;

public class DocenaOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        // Verificamos si está fuera de rango usando OR
        if (numero < 1 || numero > 36) {
            System.out.println("El número " + numero + " está fuera de rango.");
        } else if (numero <= 12) {
            System.out.println("El número " + numero + " pertenece a la primera docena.");
        } else if (numero <= 24) {
            System.out.println("El número " + numero + " pertenece a la segunda docena.");
        } else { // Solo queda la tercera docena
            System.out.println("El número " + numero + " pertenece a la tercera docena.");
        }

        sc.close();
    }
}
