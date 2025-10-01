import java.util.Scanner;

public class CaracteristicasAuto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la clase del auto (a, b, c): ");
        char clase = sc.next().charAt(0); // Tomamos el primer carácter ingresado

        switch (clase) {
            case 'a':
            case 'A': // Para aceptar mayúsculas
                System.out.println("Clase A: 4 ruedas, un motor.");
                break;
            case 'b':
            case 'B':
                System.out.println("Clase B: 4 ruedas, un motor, cierre centralizado, aire.");
                break;
            case 'c':
            case 'C':
                System.out.println("Clase C: 4 ruedas, un motor, cierre centralizado, aire, airbag.");
                break;
            default:
                System.out.println("Clase inválida. Debe ser 'a', 'b' o 'c'.");
                break;
        }

        sc.close();
    }
}
