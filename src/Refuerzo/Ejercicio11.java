package Refuerzo;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros");
        num1= sc.nextInt();
        num2= sc.nextInt();

        if (num1 % 2== 0 && num2 %2 ==0){
            System.out.println("Los dos numeros son pares");
        }else {
            System.out.println("Los numeos son impares");
        }
    }
}
