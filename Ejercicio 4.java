import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la categoría (a, b o c): ");
        String categoria = sc.nextLine().toLowerCase();  
        if (categoria.equals("a")) {
            System.out.println("hijo");
        } else if (categoria.equals("b")) {
            System.out.println("padres");
        } else if (categoria.equals("c")) {
            System.out.println("abuelos");
        } else {
            System.out.println("Categoría no válida.");
        }

        sc.close();
    }
}
