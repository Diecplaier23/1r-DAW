package Ampliacion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejerciio9 {
    public static void main(String[] args) {
        int num;
        int a[] = new int[4];
        System.out.println("Introduce un numero tus 4 cartas");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);

            if (a[1] == a[0]+1 && a[2] == a[1]+1 && a[3] == a[2]+1) {
                if (a[3] + 1 == 14) {
                    System.out.println(a[0] - 1);
                } else {
                    System.out.println(a[3] + 1);
                }
            } else {
                for (int i = 1; i < a.length; i++) {
                    if (a[i] != a[i - 1] + 1 && a[i] == a[i - 1] +2) {
                        System.out.println((a[i - 1] + 1));
                    }else{
                        System.out.println("No se puede formar una escalera");
                        break;
                    }
                }
            }

    }
}