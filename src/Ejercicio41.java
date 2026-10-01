
import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        int max_intentos = 3;
        String password = "DWER";
        String induducido = "";

        for (int i = 0; i < max_intentos; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce la contraseña (tienes " + max_intentos + " intentos):");
            induducido = sc.nextLine();
            if (induducido.equals(password)) {
                System.out.println("Acceso concedido");
            } else {
                System.out.println("Acceso denegado");
            }

        }
        System.out.println("Se han agotado los intentos, acceso denegado");
    }
}
