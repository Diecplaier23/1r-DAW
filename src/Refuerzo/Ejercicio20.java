package Refuerzo;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        int saldoInicial, cambioEstimado, saldoFinal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el saldo inicial y el cambio estimado:");
        saldoInicial = sc.nextInt();
        cambioEstimado = sc.nextInt();
        saldoFinal = saldoInicial + cambioEstimado;

        if (saldoFinal >= 0) {
            System.out.println("SÍ");
        } else {
            System.out.println("NO");
        }
    }
}
