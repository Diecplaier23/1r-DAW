import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        int saldo_total, retirar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el saldo total de la cuenta:");
        saldo_total = sc.nextInt();

        do {
            System.out.println("Introduce la cantidad a retirar:");
            retirar = sc.nextInt();
            if (retirar > saldo_total) {
                System.out.println("No se puede retirar esa cantidad, saldo insuficiente");
            } else {
                saldo_total -= retirar;
                System.out.println("Retiro realizado, saldo restante: " + saldo_total);
            }
        } while (retirar <= 0);


    }
}
