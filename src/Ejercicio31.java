import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero natural:");
        num = sc.nextInt();

        if (num <= 0) {
            System.out.println("El numero debe ser natural.");
        } else {
            System.out.println("Los divisores de " + num + " son:");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
