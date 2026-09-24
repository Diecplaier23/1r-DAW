package Refuerzo;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros");
        num1= sc.nextInt();
        num2= sc.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("los numros son multiplos");
        }else {
            System.out.println("los numeros no son multiplos");
        }
    }
}
