package Refuerzo;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros");
        num1= sc.nextInt();
        num2= sc.nextInt();

        if (num2 >= 0 && num1 >=0){
            System.out.println("Los dos numeros son positivos");
        } else if (num2 >= 0 || num1 >=0) {
            System.out.println("Un numero es positivo pero el otro no");

        } else {
            System.out.println("Ninguno es postivo");
        }
    }
}
