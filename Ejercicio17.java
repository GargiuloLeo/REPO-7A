import java.util.Scanner;

public class PromedioAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota 1: ");
        int nota1 = sc.nextInt();

        System.out.print("Ingrese la nota 2: ");
        int nota2 = sc.nextInt();

        System.out.print("Ingrese la nota 3: ");
        int nota3 = sc.nextInt();

        double promedio = (nota1 + nota2 + nota3) / 3.0;

        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        int sumaPares = 0;

        if (nota1 % 2 == 0) sumaPares += nota1;
        if (nota2 % 2 == 0) sumaPares += nota2;
        if (nota3 % 2 == 0) sumaPares += nota3;

        System.out.println("Suma de las notas pares (con if): " + sumaPares);

        int sumaParesSinIf = (nota1 % 2 == 0 ? nota1 : 0) +
                             (nota2 % 2 == 0 ? nota2 : 0) +
                             (nota3 % 2 == 0 ? nota3 : 0);

        System.out.println("Suma de las notas pares (sin if): " + sumaParesSinIf);

        sc.close();
    }
}
