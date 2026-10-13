package Ampliacion;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int n_vampiro, n_colmillos,n_cifras;
        int num;
        System.out.println("Introduce un nuemro para ver si es vampiro o no");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();

        n_cifras = String.valueOf(num).length();
        if (n_cifras%2 ==0){
            int a[] = new int[n_cifras];

            for (int i = 0; i < n_cifras; i++) {
                a[i] = Integer.parseInt(String.valueOf(num).substring(i, i++));
            }
            System.out.println(a[0]);



        }else{
            System.out.println("Error el numero no es valido");}
    }
}
