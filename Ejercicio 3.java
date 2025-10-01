import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre de un mes: ");
        String mes = sc.nextLine().toLowerCase(); 
        if (mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre")) {
            System.out.println("El mes de " + mes + " tiene 30 días.");
        } else if (mes.equals("febrero")) {
            System.out.println("El mes de " + mes + " tiene 28 días (29 si es año bisiesto).");
        } else if (mes.equals("enero") || mes.equals("marzo") || mes.equals("mayo") || 
                   mes.equals("julio") || mes.equals("agosto") || mes.equals("octubre") || 
                   mes.equals("diciembre")) {
            System.out.println("El mes de " + mes + " tiene 31 días.");
        } else {
            System.out.println("El nombre ingresado no corresponde a un mes válido.");
        }

        sc.close();
    }
}
