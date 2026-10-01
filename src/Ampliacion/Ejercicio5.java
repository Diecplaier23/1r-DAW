package Ampliacion;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int n_cifras, resultado = 0;
        String codigo_de_barras = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de cifras del codigo de barras:");
        codigo_de_barras = sc.nextLine();
        n_cifras = codigo_de_barras.length();

        int[] a = new int[n_cifras];
        if (n_cifras == 8 || n_cifras == 13) {

            for (int i = 0; i < n_cifras; i++) {
                a[i] = Character.getNumericValue(codigo_de_barras.charAt(i));

            }


            if (n_cifras==8){
                System.out.println("8");
                resultado =a[6]*3+a[5]+a[4]*3+a[3]+a[2]*3+a[1]+a[0]*3;
                resultado = resultado + a[7];
                resultado = 10 - (resultado % 10);
                System.out.println("El digito de control es: " + resultado);
            } else {
                System.out.println("13");
                resultado =a[11]+a[10]*3+a[9]+a[8]*3+a[7]+a[6]*3+a[5]+a[4]*3+a[3]+a[2]*3+a[1]+a[0]*3;
                resultado = resultado + a[12];
                resultado = 10 - (resultado % 10);
                System.out.println("El digito de control es: " + resultado);
            }


        } else {
            System.out.println("El codigo de barras no es valido.");
        }
    }
}
