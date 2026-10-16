package Ampliacion;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

    public class Ejercicio11 {
        public static final String R = "\u001B[31m";
        public static final String V = "\u001B[32m";
        public static final String B = "\u001B[97m";
        public static final String RS = "\u001B[0m";

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print(V + "Introduce el numero que quieras saber si es cubinfinito: " + RS);
            int num = sc.nextInt();

            List<Integer> numeros = new ArrayList<>();

            do {
                // Comprobar si el número ya ha aparecido
                if (numeros.contains(num)) {
                    System.out.println(R + "No es cubinfinito porque se repite un numero como minimo" + RS);
                    break;
                }

                // Guardar el número actual
                numeros.add(num);

                // Parte 1: separar las cifras y elevarlas al cubo
                int n_cifras = String.valueOf(num).length();
                int[] c = new int[n_cifras];

                for (int i = 0; i < n_cifras; i++) {
                    c[i] = Integer.parseInt(String.valueOf(num).substring(i, i + 1));
                }

                int resultado = 0;

                for (int i = 0; i < n_cifras; i++) {
                    resultado += c[i] * c[i] * c[i];
                }

                System.out.println(V + num + " -> " + resultado + RS);

                // El objetivo es llegar a 1
                if (resultado == 1) {
                    System.out.println(V + "Es cubinfinito." + RS);
                    break;
                }

                // Preparar la siguiente iteración
                num = resultado;

            } while (true);


    }
}