import java.util.Scanner;

public class Ejercicio5_subapartado20 {
    public static void main(String[] args) {
        int nota;
        String trabajos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame tu nota");
        nota = sc.nextInt();
        System.out.println("Has entregado todos los trabajos (si/no)");
        trabajos = sc.next();

        if (nota <5){
            System.out.println("Suspenso por no llegar a la nota minima");
        } else if ((nota >= 5) && (!trabajos.equals("si"))) {
            System.out.println("Suspenso por no entregar todas las practicas");
        }else {
            if ( nota >=9){
                System.out.println("Sobresaliente");
            } else if (nota >=7) {
                System.out.println("Notable");
            }else {
                System.out.println("Aprobado");
            }

        }

    }
}
