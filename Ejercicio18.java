public class TablasMultiplicar {
    public static void main(String[] args) {
        // Ciclo externo: número de la tabla (1 a 10)
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i + ":");

            // Ciclo interno: multiplicador (1 a 10)
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); // Línea en blanco entre tablas
        }
    }
}
