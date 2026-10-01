import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dividendo (numero entero no negativo):");
        int dividendo = sc.nextInt();
        System.out.println("Introduce el divisor (numero entero positivo):");
        int divisor = sc.nextInt();

        if (dividendo < 0 || divisor <= 0) {
            System.out.println("El dividendo debe ser no negativo y el divisor debe ser positivo.");
            return;
        }

        int resto = dividendo;
        while (resto >= divisor) {
            resto -= divisor;
        }

        System.out.println("El resto de " + dividendo + " / " + divisor + " es " + resto);
    }
}
