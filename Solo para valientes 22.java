import java.util.Random;

public class SueldoEmpleadoAleatorio {
    public static void main(String[] args) {
        Random rand = new Random();
        int contador = 0;

        while (contador < 10) {
            char categoria;
            do {
                int cat = rand.nextInt(3); 
                if (cat == 0) categoria = 'A';
                else if (cat == 1) categoria = 'B';
                else categoria = 'C';
            } while (false); 
            double sueldoBruto;
            do {
                sueldoBruto = 1000 + (10000 - 1000) * Math.random();
            } while (sueldoBruto < 1000 || sueldoBruto > 10000); 

            int antiguedad;
            do {
                antiguedad = rand.nextInt(20) + 1;
            } while (antiguedad < 1 || antiguedad > 20); 

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
                case 'A': plus = 1000; break;
                case 'B': plus = 2000; break;
                case 'C': plus = 3000; break;
            }

            double sueldoNeto = sueldoBruto + aumento + plus;

            System.out.println("Empleado " + (contador + 1));
            System.out.println("Categoría: " + categoria);
            System.out.println("Antigüedad: " + antiguedad + " años");
            System.out.printf("Sueldo bruto: %.2f\n", sueldoBruto);
            System.out.printf("Sueldo neto: %.2f\n", sueldoNeto);
            System.out.println("-----------------------------");

            contador++;
        }
    }
}
