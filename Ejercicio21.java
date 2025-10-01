import java.util.Scanner;

public class SueldoEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la categoría del empleado (A, B, C): ");
        char categoria = sc.next().charAt(0);

        System.out.print("Ingrese la antigüedad en años: ");
        int antiguedad = sc.nextInt();

        System.out.print("Ingrese el sueldo bruto: ");
        double sueldoBruto = sc.nextDouble();

        double aumento = 0;
        if (antiguedad >= 1 && antiguedad <= 5) {
            aumento = 0.05 * sueldoBruto;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            aumento = 0.10 * sueldoBruto;
        } else if (antiguedad > 10) {
            aumento = 0.30 * sueldoBruto;
        }

        double plus = 0;
        switch (categoria) {
            case 'A':
            case 'a':
                plus = 1000;
                break;
            case 'B':
            case 'b':
                plus = 2000;
                break;
            case 'C':
            case 'c':
                plus = 3000;
                break;
            default:
                System.out.println("Categoría inválida.");
                sc.close();
                return;
        }

        double sueldoNeto = sueldoBruto + aumento + plus;

        System.out.println("Sueldo neto del empleado: $" + sueldoNeto);

        sc.close();
    }
}
