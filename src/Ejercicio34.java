import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero entero:");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el segundo numero entero:");
        int numero2 = sc.nextInt();

        int suma = 0;
        int sumando = numero1;
        int veces = numero2;
        if (veces == Integer.MIN_VALUE) {
            System.out.println("El segundo numero es demasiado grande para repetir la suma.");
            return;
        }
        if (veces < 0) {
            sumando = -sumando;
            veces = -veces;
        }

        for (int i = 0; i < veces; i++) {
            suma += sumando;
        }

        System.out.println(numero1 + " x " + numero2 + " = " + suma);
    }
}
