import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero binario:");
        String binario = sc.next();
        int decimal = 0;

        for (int i = 0; i < binario.length(); i++) {
            char bit = binario.charAt(i);
            if (bit != '0' && bit != '1') {
                System.out.println("La cadena solo puede contener 0 y 1.");
                return;
            }
            if (decimal > (Integer.MAX_VALUE - (bit - '0')) / 2) {
                System.out.println("El resultado es demasiado grande para un int.");
                return;
            }
            decimal = decimal * 2 + (bit - '0');
        }

        System.out.println("En decimal: " + decimal);
    }
}
