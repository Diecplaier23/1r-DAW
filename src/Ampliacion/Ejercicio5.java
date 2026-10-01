package Ampliacion;

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
            int[] a = new int[n_barras - 1];

            for (int i = n_barras - 2, posicion = 1; i >= 0; i--, posicion++) {
                int cifra = codigo_de_barras.charAt(i) - '0';
                int multiplicador = posicion % 2 == 1 ? 3 : 1;
                a[posicion - 1] = cifra * multiplicador;
                System.out.println("Cifra " + cifra + " en posicion " + posicion
                        + " (desde la derecha, sin contar el digito de control) x "
                        + multiplicador + " = " + a[posicion - 1]);
            }

        } else {
            System.out.println("El codigo de barras introducido no es valido, debe tener 8 o 13 cifras");
        }

    }
}
