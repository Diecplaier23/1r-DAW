import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        int num;
        boolean primo = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero:");
        num = sc.nextInt();

        if (num < 2) {
            primo = false;
        } else if (num != 2 && num % 2 == 0) {
            primo = false;
        } else {
            for (int i = 3; i <= num / 2; i += 2) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println("El numero " + num + " es primo.");
        } else {
            System.out.println("El numero " + num + " no es primo.");
        }
    }
}
