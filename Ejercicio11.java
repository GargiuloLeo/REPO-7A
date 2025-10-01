import java.util.Scanner;

public class EJE11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un carácter: ");
        char caracter = sc.next().charAt(0); 
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
            caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
            System.out.println("El carácter es una vocal.");
        } else {
            System.out.println("El carácter no es una vocal.");
        }

        sc.close();
    }
}
