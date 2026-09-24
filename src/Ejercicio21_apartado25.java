import java.util.Scanner;

public class Ejercicio21_apartado25 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para calcular su factorial:");
        num = sc.nextInt();

        if (num < 0) {
            System.out.println("No se puede calcular el factorial de un numero negativo.");
        } else {
            int resultado = 1;
            for (int i = 2; i <= num; i++) {
                resultado *= i;
            }

            System.out.println("El factorial de " + num + " es: " + resultado);
        }
    }
}
