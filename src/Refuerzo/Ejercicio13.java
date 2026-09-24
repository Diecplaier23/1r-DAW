package Refuerzo;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros");
        num1= sc.nextInt();
        num2= sc.nextInt();

        if ((num1 % 2== 0 && num2 %2 !=0)|| (num2 % 2== 0 && num1 %2 !=0)){
            System.out.println("Un numero es par pero el otro no");
        }else {
            System.out.println("Hay dos pares o dos impares");
        }
    }
}
