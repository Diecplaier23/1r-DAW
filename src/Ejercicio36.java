import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero entre 0 y 255:");
        int numero = sc.nextInt();
        if (numero < 0 || numero > 255) {
            System.out.println("El numero debe estar entre 0 y 255.");
            return;
        }

        if (numero == 0) {
            System.out.println("En binario: 0");
            return;
        }

        String binario = "";
        while (numero > 0) {
            binario = (numero % 2) + binario;
            numero /= 2;
        }
        System.out.println("En binario: " + binario);
    }
}
