import java.util.Scanner;

public class Ejercio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Competidor 1 (0=Piedra, 1=Papel, 2=Tijera): ");
        int jugador1 = sc.nextInt();

        System.out.print("Competidor 2 (0=Piedra, 1=Papel, 2=Tijera): ");
        int jugador2 = sc.nextInt();

        if (jugador1 < 0 || jugador1 > 2 || jugador2 < 0 || jugador2 > 2) {
            System.out.println("Entrada inválida. Solo se permite 0, 1 o 2.");
        } else {
         
            if (jugador1 == jugador2) {
                System.out.println("Empate!");
            } else if ((jugador1 == 0 && jugador2 == 2) || 
                       (jugador1 == 1 && jugador2 == 0) || 
                       (jugador1 == 2 && jugador2 == 1)) { 
                System.out.println("Gana el Competidor 1!");
            } else {
                System.out.println("Gana el Competidor 2!");
            }
        }

        sc.close();
    }
}
