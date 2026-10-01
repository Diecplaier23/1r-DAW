package Ampliacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
    int n_barras;
    String codigo_de_barras;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de barras del codigo de barras:");
        codigo_de_barras = sc.next();

        n_barras = String.valueOf(codigo_de_barras).length();

        if (n_barras == 13 || n_barras == 8){
            System.out.println("El codigo de barras introducido es valido");
            int[] a = new int[n_barras];

            for (int i = 0; i < n_barras; i++) {
                a[i] = codigo_de_barras.charAt(i) - '0';
                System.out.println("Cifra " + (i + 1) + ": " + a[i]);
            }




































        } else {
            System.out.println("El codigo de barras introducido no es valido, debe tener 8 o 13 cifras");
        }

    }
}
