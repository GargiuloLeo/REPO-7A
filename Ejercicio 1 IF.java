// Ejercicio 1
// Realizar un programa que permita definir 3 variables correspondientes a las evaluaciones de un
// alumno de una escuela, sobre el particular se deberá informar lo siguiente:
// a. Aprobado si el promedio es mayor igual a 7
// b. Reprobado si el promedio es menor a esta nota

import java.util.Scanner;

public class Practica4Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingreso de notas
        System.out.print("Ingrese la primera nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double nota3 = sc.nextDouble();

        // Cálculo del promedio
        double promedio = (nota1 + nota2 + nota3) / 3;

        // Condición única con if
        if (promedio >= 7) {
            System.out.println("Aprobado. Promedio: " + promedio);
        } else {
            System.out.println("Reprobado. Promedio: " + promedio);
        }

        sc.close();
    }
}
