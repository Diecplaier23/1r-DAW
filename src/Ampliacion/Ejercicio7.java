package Ampliacion;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int num1,num2,llevadas=0,n_cifras1,n_cifras2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los numeros:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        n_cifras1 = String.valueOf(num1).length();
        n_cifras2 = String.valueOf(num2).length();

        if (n_cifras1 != n_cifras2) {
            System.out.println("Los numeros deben ser iguales");
            return;
        }
        int a[] = new int[n_cifras1];
        int b[] = new int[n_cifras2];

        for (int i = 0; i < n_cifras2; i++) {
            a[i] = Integer.parseInt(String.valueOf(num1).substring(i,i+1));
        }

        for (int i = 0; i < n_cifras2; i++) {
            b[i] = Integer.parseInt(String.valueOf(num2).substring(i,i+1));
        }

        for (int i = 0; i < n_cifras1; i++) {
            if (a[i]+b[i]>9){
                llevadas += 1;
            }
        }
        System.out.println("Esa combinacion de numeros tras sumarlos se llevan "+llevadas);
    }
}
