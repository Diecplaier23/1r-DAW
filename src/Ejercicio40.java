import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        int saldo_total, retirar, accion, ingreso;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el saldo total de la cuenta:");
        saldo_total = sc.nextInt();

        do {
            System.out.println("Saldo: " + saldo_total);
            System.out.println("1.Ingresar dinero 2.Retirar dinero 0.Salir");
            accion = sc.nextInt();
            if (accion == 1) {
                System.out.println("Introduce la cantidad a ingresar:");
                ingreso = sc.nextInt();
                saldo_total = saldo_total + ingreso;
            } else if (accion == 2) {
                System.out.println("Introduce la cantidad a retirar:");
                retirar = sc.nextInt();
                if (retirar > saldo_total) {
                    System.out.println("No se puede retirar esa cantidad, saldo insuficiente");
                }else {
                    System.out.println("Operacion realizada con exito, saldo final: " + saldo_total);
                    }
            }

        } while (saldo_total <= 0 || accion != 0);

    }
}
