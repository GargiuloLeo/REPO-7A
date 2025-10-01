import java.util.Scanner;

public class EJE10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor número es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El mayor número es: " + num2);
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("El mayor número es: " + num3);
        }

        sc.close();
    }
}
