import java.util.Scanner;

public class Ejercicio17_apartado21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int año;
        boolean bisiesto;

        System.out.print("Introduce un año: ");
        año = sc.nextInt();

        // Suponemos que no es bisiesto
        bisiesto = false;

        // Comprobamos si es bisiesto
        if (año % 400 == 0) {
            bisiesto = true;
        } else if (año % 4 == 0 && año % 100 != 0) {
            bisiesto = true;
        }

        if (bisiesto) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}