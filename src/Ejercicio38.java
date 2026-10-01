import java.util.Random;
import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Random aleatorio = new Random(System.currentTimeMillis());
        int secreto = aleatorio.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            System.out.println("Adivina el numero entre 1 y 100 (o -1 para rendirte):");
            numero = sc.nextInt();

            if (numero == -1) {
                System.out.println("Se rinde");
            } else if (numero == secreto) {
                System.out.println("Has Ganado");
            } else if (numero > secreto) {
                System.out.println("El numero secreto es mas pequeno");
            } else {
                System.out.println("El numero secreto es mas grande");
            }
        } while (numero != secreto && numero != -1);
    }
}
